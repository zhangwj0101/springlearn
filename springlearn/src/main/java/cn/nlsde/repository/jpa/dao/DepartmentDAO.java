package cn.nlsde.repository.jpa.dao;

import cn.nlsde.repository.jpa.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zwj on 2016/4/8.
 */
public interface DepartmentDAO extends JpaRepository<Department, String> {
}
