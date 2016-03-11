package cn.nlsde.service;

import cn.nlsde.base.BaseTest;
import cn.nlsde.db.dao.EmployeeDAO;
import cn.nlsde.db.dao.UserDAO;
import cn.nlsde.db.entity.Address;
import cn.nlsde.db.entity.Employee;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
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
    EntityManagerFactory entityManagerFactory;

    @Test
//    @Ignore
    public void testName() {
        Employee e = new Employee();
        e.setEmployeeName("张三");

        Address a1 = new Address();
        a1.setAddressCity("北京");
        a1.setAddressCountry("北京");

        Address a2 = new Address();
        a2.setAddressCountry("南阳");
        a2.setAddressCity("南阳");

        e.getAddresses().addAll(Arrays.asList(a1, a2));
        employeeDAO.save(e);
//        Employee employee = userService.get();
//        for (Address a : employee.getAddresses()) {
//            logger.info("{}", a.getAddressCity());
//        }
    }

    @Test
    @Ignore
    public void del() {
        employeeDAO.delete("d06e4e90-2647-4e63-b230-d8a5ded26822");
//        addressDAO.delete("fc622966-d9c0-40ef-a44d-4c3b9816b292");
//        employeeDAO.deleteAll();
//        addressDAO.deleteAll();
    }
}
