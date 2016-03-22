package cn.nlsde.repository.jpa.dao;

import cn.nlsde.repository.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.Future;

/**
 * Created by zhangwj on 16/2/27.
 */
public interface UserDAO extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {

    public List<User> findByUserName(String name);

    @Async
    @Query("select  u.userName from User u where u.userName = ?")
    Future<String> findUserName(String name);

    public User findUser(@Param("id") String id);


    @Query(value = "select username,password from tb_user where id = ?1", nativeQuery = true)
    public List<Object[]> querys(String id);

}
