package cn.nlsde.repository.mongo;

import cn.nlsde.base.BaseTest;
import cn.nlsde.repository.mongo.dao.PersonRepository;
import cn.nlsde.repository.mongo.dao.SchoolRepository;
import cn.nlsde.repository.mongo.entity.Person;
import cn.nlsde.repository.mongo.entity.School;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zwj on 2016/3/11.
 */
public class MongoTest extends BaseTest {

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    PersonRepository personRepository;

    @Test
    @Ignore
    public void testMongodb() {
        School school = new School();
        school.setName("北航");
        school.setAddress("学院路");
        schoolRepository.save(school);
        Person p = new Person();
        p.setAge(13);
        p.setName("张三");
        p.setPassword("12312");
        personRepository.save(p);
    }

    @Test
    @Ignore
    public void testgetMongodb() {
        School school = new School();
        school.setName("北航");
        school.setAddress("学院路");
        schoolRepository.save(school);
        System.out.println(personRepository.findOne("56e22ec01ee0964b18788b79"));
    }
}
