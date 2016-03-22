package cn.nlsde.common;

import cn.nlsde.privilege.Privilege;
import cn.nlsde.repository.jpa.entity.User;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

/**
 * 用于表示用户的相关信息
 * Created by zhangwj on 16/3/5.
 */
@Data
public class SessionBean extends BaseEntity {

    private User user;

    private Set<Privilege> privileges = new HashSet<>();

}

