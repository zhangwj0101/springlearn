package cn.nlsde.taglib;

import cn.nlsde.common.SessionBean;
import cn.nlsde.constant.Constants;
import cn.nlsde.privilege.Privilege;
import lombok.Data;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Set;

/**
 * Created by zhangwj on 16/3/5.
 */
@Data
public class SecurityTagHandler extends SimpleTagSupport {

    /**
     * 需要的权限列表，逗号分隔，形如"USER_ADD, USER_ALTER"
     */
    private String privilegeString;

    public void doTag() throws JspException, IOException {

        SessionBean sb = getSessionBean();

        if (sb != null) {
            Set<Privilege> userPrivileges = sb.getPrivileges();
            String[] privileges = privilegeString.split(",");
            for (String p : privileges) {
                Privilege anEnum = Privilege.valueOf(p.trim());
                if (anEnum != null && userPrivileges.contains(anEnum)) {
                    getJspBody().invoke(null);
                    return;
                }
            }
        }
    }

    private SessionBean getSessionBean() {
        JspContext jspContext = this.getJspContext();
        Object sessionBean = jspContext.getAttribute(Constants.SESSION_BEAN, PageContext.SESSION_SCOPE);
        if (sessionBean != null && sessionBean instanceof SessionBean) {
            return (SessionBean) sessionBean;
        }
        return null;
    }


}
