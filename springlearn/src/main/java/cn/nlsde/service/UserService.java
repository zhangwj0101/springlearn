package cn.nlsde.service;


import cn.nlsde.repository.jpa.entity.Employee;

/**
 * Created by zhangwj on 16/2/27.
 */
public interface UserService {

    public void say();

    public void save();

    public Employee get(String id);

}
