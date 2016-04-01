package cn.nlsde.repository.jpa.dao;

import cn.nlsde.repository.jpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zwj on 2016/3/28.
 */
public interface PersonDAO extends JpaRepository<Person, String> {
}
