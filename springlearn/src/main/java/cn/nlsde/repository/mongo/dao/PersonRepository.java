package cn.nlsde.repository.mongo.dao;

import cn.nlsde.repository.mongo.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zwj on 2016/3/11.
 */
public interface PersonRepository extends MongoRepository<Person, String> {
}
