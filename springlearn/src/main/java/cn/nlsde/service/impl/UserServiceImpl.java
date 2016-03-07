package cn.nlsde.service.impl;

import cn.nlsde.dao.UserDAO;
import cn.nlsde.entity.User;
import cn.nlsde.service.UserService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by zhangwj on 16/2/27.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Autowired
    SessionFactory sessionFactory;
    @Autowired
    HibernateTemplate hibernateTemplate;

    public void say() {
        User user = new User();
        user.setPassword("23");
        user.setUserName("张三");
        userDAO.save(user);
    }

    public void save() {
        User user = new User();
        user.setPassword("23");
        user.setUserName("张三");
//        user.setId(1);
        hibernateTemplate.save(user);
    }

    public User get(Integer id) {
        return userDAO.get(id);
    }
}
