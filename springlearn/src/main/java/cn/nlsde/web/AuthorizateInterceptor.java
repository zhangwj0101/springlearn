package cn.nlsde.web;

import cn.nlsde.annotation.FreeAccess;
import cn.nlsde.annotation.LoginRequired;
import cn.nlsde.annotation.PrivilegeRequired;
import cn.nlsde.common.SessionBean;
import cn.nlsde.constant.Constants;
import cn.nlsde.privilege.Privilege;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhangwj on 16/3/5.
 */
public class AuthorizateInterceptor extends HandlerInterceptorAdapter {

    public final Logger logger = LoggerFactory.getLogger(AuthorizateInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        logger.info("begin interceptor");
        if (!handler.getClass().isAssignableFrom(HandlerMethod.class)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        SessionBean sb = (SessionBean) request.getSession().getAttribute(Constants.SESSION_BEAN);
        logger.info("login {}", sb);
        Privilege[] privileges = {};
        //类级别或者方法级别有注解
        if (handlerMethod.getMethod().isAnnotationPresent(FreeAccess.class)
                || handlerMethod.getBean().getClass().isAnnotationPresent(FreeAccess.class)) {
            return true;
        }
        if (handlerMethod.getMethod().isAnnotationPresent(LoginRequired.class)
                || handlerMethod.getBean().getClass().isAnnotationPresent(LoginRequired.class)) {
            if (sb == null) {
//                request.getSession().setAttribute(Constants.REDIRECT_URL, request.getRequestURL());
                response.sendRedirect("login");

            } else {
                logger.info("{}", sb);
            }
        }

        //对接口的访问权限过滤
        if (handlerMethod.getMethod().isAnnotationPresent(PrivilegeRequired.class)) {
            privileges = handlerMethod.getMethod().getAnnotation(PrivilegeRequired.class).privileges();
        } else if (handlerMethod.getBean().getClass().isAnnotationPresent(PrivilegeRequired.class)) {
            privileges = handlerMethod.getBean().getClass().getAnnotation(PrivilegeRequired.class).privileges();
        }

        for (Privilege p : privileges) {
            if (!sb.getPrivileges().contains(p)) {
                return false;
            }
        }
        return true;
    }
}
