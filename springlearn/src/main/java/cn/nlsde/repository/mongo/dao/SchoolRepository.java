package cn.nlsde.repository.mongo.dao;

import cn.nlsde.repository.mongo.entity.School;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by zwj on 2016/3/11.
 */
public interface SchoolRepository extends MongoRepository<School, String> {
}
