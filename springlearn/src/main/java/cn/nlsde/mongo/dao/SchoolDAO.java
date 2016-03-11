package cn.nlsde.mongo.dao;

import cn.nlsde.mongo.entity.School;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zwj on 2016/3/11.
 */
public interface SchoolDAO extends MongoRepository<School, String> {
}
