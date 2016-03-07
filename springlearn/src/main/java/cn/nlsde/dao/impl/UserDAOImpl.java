package cn.nlsde.dao.impl;

import cn.nlsde.common.GenericHibernateDao;
import cn.nlsde.dao.UserDAO;
import cn.nlsde.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangwj on 16/3/2.
 */
@Repository
public final class UserDAOImpl extends GenericHibernateDao<User, Integer> implements UserDAO {


    public UserDAOImpl() {
        super(User.class);
    }

    public User get() {
        return (User) this.getHibernateTemplate().findByNamedQuery("getUser", null).get(0);
    }

}
