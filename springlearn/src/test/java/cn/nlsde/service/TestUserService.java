package cn.nlsde.service;

import cn.nlsde.base.BaseTest;
import cn.nlsde.privilege.Privilege;
import cn.nlsde.repository.jpa.dao.AddressDAO;
import cn.nlsde.repository.jpa.dao.EmployeeDAO;
import cn.nlsde.repository.jpa.dao.RoleDAO;
import cn.nlsde.repository.jpa.dao.UserDAO;
import cn.nlsde.repository.jpa.entity.Address;
import cn.nlsde.repository.jpa.entity.Employee;
import cn.nlsde.repository.jpa.entity.Role;
import cn.nlsde.repository.jpa.entity.User;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Repeat;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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
    RoleDAO roleDAO;
    @Autowired
    EmployeeDAO employeeDAO;
    @Autowired
    AddressDAO addressDAO;

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Test
    @Transactional
//    @Ignore
    public void testName() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Employee employee = userService.get("e4802c4a-e99f-42d9-8922-9ffeb4c922a4");
        employee.getEmployeeName();
    }

    @Test
    @Repeat(value = 3)
    public void testUser() {
        User user = new User();
        user.setUserName("中国");
        userDAO.save(user);
    }

    @Test
//    @Ignore
    public void del() {
//        User user = userDAO.findUser("fbc7e5c2-bd85-40dc-a96a-5dfd24cde16a");
//        logger.info("{}", user.getRoles().size());
//        Role one = roleDAO.findOne("24309149-409a-4a9c-b6e7-6ca77b256a90");
//        logger.info("{}", one.getMembers().size());
//        userDAO.delete("30cabc6e-234d-4820-80ac-a90118053334");

        roleDAO.delete("4021b60d-121c-4b4b-a22f-fd5b67b75fc0");
//        addressDAO.delete("fc622966-d9c0-40ef-a44d-4c3b9816b292");
//        employeeDAO.deleteAll();
//        addressDAO.deleteAll();
    }

    @Test

    public void fileds() {

        User user = new User();
        user.setUserName("tes");
        User user1 = new User();
        user1.setUserName("tes1");

        Role role = new Role();
        role.setName("test");
        role.setPrivileges(Arrays.asList(Privilege.USER_ADD));

        Role role2 = new Role();
        role2.setName("test2");
        role2.setPrivileges(Arrays.asList(Privilege.USER_ALTER));
        Role role3 = new Role();
        role3.setName("test3");
        role3.setPrivileges(Arrays.asList(Privilege.USER_DELETE));

        user.setRoles(Arrays.asList(role, role2));
        user1.setRoles(Arrays.asList(role2, role3));
        role.setMembers(Arrays.asList(user));
        role2.setMembers(Arrays.asList(user1, user));
        role3.setMembers(Arrays.asList(user1));
        userDAO.save(user);
        userDAO.save(user1);
        roleDAO.save(role);
        roleDAO.save(role2);
        roleDAO.save(role3);

    }


    @Test
    public void t() {
        Employee e = new Employee();
        e.setEmployeeName("e");
        Address a = new Address();
        a.setAddressCity("bj");
        Address a1 = new Address();
        a1.setAddressCity("bj1");
        e.setAddresses(Arrays.asList(a, a1));
        a.setEmployee(e);
        a1.setEmployee(e);
        employeeDAO.save(e);
        addressDAO.save(a);
        addressDAO.save(a1);
    }

}
