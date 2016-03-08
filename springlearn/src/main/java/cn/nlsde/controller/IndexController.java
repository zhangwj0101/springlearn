package cn.nlsde.controller;

import cn.nlsde.annotation.FreeAccess;
import cn.nlsde.common.SessionBean;
import cn.nlsde.constant.Constants;
import cn.nlsde.entity.Address;
import cn.nlsde.entity.Employee;
import cn.nlsde.entity.User;
import cn.nlsde.privilege.Privilege;
import cn.nlsde.service.UserService;
import nl.captcha.Captcha;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by zhangwj on 16/2/27.
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    UserService userService;

    //    @ResponseBody
    @RequestMapping(value = "/test")
    public String test(HttpServletRequest request) {
        Map<String, Object> maps = new HashMap<>();
        logger.info("user = {}", request.getSession().getAttribute(Constants.SESSION_BEAN));
        return "test";
    }

    @ResponseBody
    @RequestMapping(value = "/testlogin")
    @FreeAccess
    public SessionBean testLogin(HttpServletRequest request) {
        Map<String, Object> maps = new HashMap<String, Object>();
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setUserName("张文杰");
        user.setPassword("test");
        SessionBean sb = new SessionBean();
        sb.setUser(user);
        sb.getPrivileges().add(Privilege.USER_ALTER);
        request.getSession().setAttribute(Constants.SESSION_BEAN, sb);
        return sb;
    }

        @ResponseBody
    @RequestMapping(value = "/login")
    @FreeAccess
    public Map login(HttpSession session) {
        System.out.println("login test");
        Map<Integer, String> maps = new HashMap<Integer, String>();
        maps.put(1, "中国");
        maps.put(2, "login test");
        Captcha captcha = (Captcha) session.getAttribute(Captcha.NAME);

        logger.info("captcha :{}", captcha.getAnswer());
        return maps;
    }

    @ResponseBody
    @RequestMapping("/get")
    @FreeAccess
    public String get() {
        Employee employee = userService.get();
        for (Address a : employee.getAddresses()) {
//            logger.info("{}", a.getAddressCity());
        }
        return "get";
    }


}
