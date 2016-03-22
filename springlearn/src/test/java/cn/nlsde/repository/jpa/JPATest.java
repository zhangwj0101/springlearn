package cn.nlsde.repository.jpa;

import cn.nlsde.base.BaseTest;
import cn.nlsde.repository.jpa.dao.EmployeeDAO;
import cn.nlsde.repository.jpa.dao.UserDAO;
import cn.nlsde.repository.jpa.entity.Address;
import cn.nlsde.repository.jpa.entity.Employee;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

/**
 * Created by zwj on 2016/3/11.
 */
public class JPATest extends BaseTest {

    @Autowired
    UserDAO userDAO;

    @Autowired
    EmployeeDAO employeeDAO;


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

        e.getAddresses().addAll(Arrays.asList(a1, a2));
        employeeDAO.save(e);

    }

    @Test
    @Ignore
    public void del() {
        employeeDAO.delete("d06e4e90-2647-4e63-b230-d8a5ded26822");

    }


}
