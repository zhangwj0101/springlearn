package cn.nlsde.dao;

import cn.nlsde.common.GenericDao;
import cn.nlsde.entity.User;

/**
 * Created by zhangwj on 16/2/27.
 */
public interface UserDAO extends GenericDao<User, Integer> {

    public User get();
}
