package cn.nlsde.repository.jpa.dao;

import cn.nlsde.repository.jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhangwj on 16/3/3.
 */
public interface EmployeeDAO extends JpaRepository<Employee, String> {
}
