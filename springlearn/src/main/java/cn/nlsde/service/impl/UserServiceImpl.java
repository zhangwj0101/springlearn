package cn.nlsde.service.impl;


import cn.nlsde.repository.jpa.dao.AddressDAO;
import cn.nlsde.repository.jpa.dao.EmployeeDAO;
import cn.nlsde.repository.jpa.dao.UserDAO;
import cn.nlsde.repository.jpa.entity.Address;
import cn.nlsde.repository.jpa.entity.Employee;
import cn.nlsde.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;


/**
 * Created by zhangwj on 16/2/27.
 */
@Service
public class UserServiceImpl implements UserService {

    public final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserDAO userDAO;

    @Autowired
    EmployeeDAO employeeDAO;

    @Autowired
    AddressDAO addressDAO;

    public void say() {

    }

    public void save() {
 
    }

    public Employee get(String id) {
        Employee employee = employeeDAO.findOne(id);
        return employee;
    }
}
