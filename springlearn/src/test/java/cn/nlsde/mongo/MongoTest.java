package cn.nlsde.mongo;

import cn.nlsde.mongo.dao.PersonDAO;
import cn.nlsde.mongo.dao.SchoolDAO;
import cn.nlsde.mongo.entity.Person;
import cn.nlsde.mongo.entity.School;
import cn.nlsde.base.BaseTest;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by zwj on 2016/3/11.
 */
public class MongoTest extends BaseTest {

    @Autowired
    SchoolDAO schoolDAO;

    @Autowired
    PersonDAO personDAO;

    @Test
//    @Ignore
    public void testMongodb() {
        School school = new School();
        school.setName("北航");
        school.setAddress("学院路");
        schoolDAO.save(school);
        Person p = new Person();
        p.setAge(13);
        p.setName("张三");
        p.setPassword("12312");
        personDAO.save(p);
    }
    @Test
    @Ignore
    public void testgetMongodb() {
        School school = new School();
        school.setName("北航");
        school.setAddress("学院路");
        schoolDAO.save(school);
        System.out.println(schoolDAO.findOne("56e22ec01ee0964b18788b79"));
    }
}
