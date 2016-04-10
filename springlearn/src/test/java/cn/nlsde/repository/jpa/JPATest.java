package cn.nlsde.repository.jpa;

import cn.nlsde.base.BaseTest;
import cn.nlsde.privilege.Privilege;
import cn.nlsde.repository.jpa.dao.*;
import cn.nlsde.repository.jpa.entity.*;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zwj on 2016/3/11.
 */
public class JPATest extends BaseTest {

    @Autowired
    UserDAO userDAO;

    @Autowired
    EmployeeDAO employeeDAO;

    @Autowired
    DepartmentDAO departmentDAO;

    @Autowired
    IDCardDAO idCardDAO;

    @Autowired
    PersonDAO personDAO;

    @Autowired
    CorporationUserDAO corporationUserDAO;

    @Test
    @Ignore
    public void testName() {
        Employee e = new Employee();
        e.setEmployeeName("张三");

        Address a1 = new Address();
        a1.setAddressCity("北京");
        a1.setAddressCountry("北京");

        Address a2 = new Address();
        a2.setAddressCountry("南阳");
        a2.setAddressCity("南阳");

    }

    @Test
//    @Ignore
    public void testmanytoOne() {
        Employee e = new Employee();
        e.setEmployeeName("张三");
        Employee e1 = new Employee();
        e1.setEmployeeName("as");
        Department d = new Department();
        d.setDepartmentName("rgz");
        e.setDepartment(d);
        e1.setDepartment(d);
        departmentDAO.save(d);
        employeeDAO.save(e);
        employeeDAO.save(e1);
        Set<Employee> es = new HashSet<>();
        es.add(e);
        es.add(e1);
        d.setEmployees(es);
    }

    @Test
    @Ignore
    public void testdelete() {
        employeeDAO.delete("797aaed2-8985-4bd3-9915-7a89d7778c75");
    }


    @Test
//    @Ignore
    public void del() {
        IDCard one = idCardDAO.findOne("94420089-7614-4a98-abb4-58bb59463325");
    }

    @Test
    public void testonetoone() {
        Person p = new Person();
        p.setUserName("df");
        IDCard id = new IDCard();
        id.setCard("12312");
        id.setPerson(p);
        p.setIdCard(id);
        personDAO.save(p);
        idCardDAO.save(id);
    }

    @Test
    public void testonetoon1e() {
        User u = new User();
        u.setUserName("user");
        CorporationUser copU = new CorporationUser();
        copU.setCopInfo("a");
        copU.setUser(u);
        userDAO.save(u);
        corporationUserDAO.save(copU);
    }

    @Test
    public void testUser() {
        User u = new User();
        u.setUserName("sdf");
        userDAO.save(u);
    }

    @Test
    public void testRole() {
        Role r = new Role();
        r.setName("roles");
        r.setPrivilege(Arrays.asList(Privilege.USER_ADD, Privilege.USER_ALTER));
    }

}
