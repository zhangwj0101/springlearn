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
public class School extends BaseEntity {

    @Id
    private String id;
    @Indexed
    private String name;
    @Indexed
    private String address;
}
