package cn.nlsde.repository.jpa.dao;

import cn.nlsde.repository.jpa.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zwj on 2016/4/1.
 */
public interface RoleDAO extends JpaRepository<Role, String> {
}
