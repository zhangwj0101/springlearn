package cn.nlsde.service;

import cn.nlsde.base.BaseTest;
import cn.nlsde.repository.jpa.dao.AddressDAO;
import cn.nlsde.repository.jpa.dao.EmployeeDAO;
import cn.nlsde.repository.jpa.dao.UserDAO;
import cn.nlsde.repository.jpa.entity.Address;
import cn.nlsde.repository.jpa.entity.Employee;
import cn.nlsde.repository.jpa.entity.User;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * Created by zhangwj on 16/2/27.
 */
public class TestUserService extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(TestUserService.class);
    @Resource
    UserService userService;

    @Autowired
    UserDAO userDAO;

    @Autowired
    EmployeeDAO employeeDAO;
    @Autowired
    AddressDAO addressDAO;

    @Test
    @Transactional
//    @Ignore
    public void testName() {

        Employee employee = userService.get("e4802c4a-e99f-42d9-8922-9ffeb4c922a4");
        employee.getEmployeeName();
    }

    @Test
    public void testUser() {
        User user = new User();
        user.setUserName("中国");
        userDAO.save(user);
    }

    @Test
//    @Ignore
    public void del() {
        User user = userDAO.findUser("adae08b9-c2db-492e-aea0-a735faa4e134");
        logger.info("{}", user);
//        addressDAO.delete("fc622966-d9c0-40ef-a44d-4c3b9816b292");
//        employeeDAO.deleteAll();
//        addressDAO.deleteAll();
    }
}
