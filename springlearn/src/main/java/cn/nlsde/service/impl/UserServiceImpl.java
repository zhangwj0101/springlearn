package cn.nlsde.service.impl;

import cn.nlsde.db.dao.AddressDAO;
import cn.nlsde.db.dao.EmployeeDAO;
import cn.nlsde.db.dao.UserDAO;
import cn.nlsde.db.entity.Address;
import cn.nlsde.db.entity.Employee;
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
        Employee e = new Employee();
        e.setEmployeeName("张三");

        Address a1 = new Address();
        a1.setAddressCity("北京");
        a1.setAddressCountry("北京");
        a1.setEmployee(e);
        Address a2 = new Address();
        a2.setAddressCountry("南阳");
        a2.setAddressCity("南阳");
        a2.setEmployee(e);

//        addressDAO.save(a1);
//        addressDAO.save(a2);

//        e.setAddresses(a1);
        e.getAddresses().addAll(Arrays.asList(a1, a2));
        employeeDAO.save(e);
    }

    public Employee get() {
        Employee employee = employeeDAO.getOne("eeac14f1-0443-4c60-af2b-d0f5fcae7e73");
        for (Address a : employee.getAddresses()) {
            logger.info("{}", a.getId());
        }
        return employee;
    }
}
