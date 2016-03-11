package cn.nlsde.repository.mongo.entity;

import cn.nlsde.common.BaseEntity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by zwj on 2016/3/11.
 */
@Document(collection = "walle")
@Data
public class Person extends BaseEntity {
    @Id
    private String id;
    @Indexed
    private String name;
    private int age;
    private String password;
}
