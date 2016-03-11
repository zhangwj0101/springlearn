package cn.nlsde.common;

import cn.nlsde.privilege.Privilege;
import cn.nlsde.repository.jpa.entity.User;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangwj on 16/3/5.
 */
@Data
public class SessionBean {

    private User user;

    private Set<Privilege> privileges = new HashSet<>();

}

