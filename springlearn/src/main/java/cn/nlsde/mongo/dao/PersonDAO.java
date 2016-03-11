package cn.nlsde.mongo.dao;

import cn.nlsde.mongo.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zwj on 2016/3/11.
 */
public interface PersonDAO extends MongoRepository<Person, String> {
}
