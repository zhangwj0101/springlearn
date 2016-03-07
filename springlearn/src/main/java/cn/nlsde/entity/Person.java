package cn.nlsde.entity;

import cn.nlsde.common.BaseEntity;
import com.fasterxml.jackson.databind.deser.Deserializers;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by zhangwj on 16/3/2.
 */
@Data
@Entity
@NoArgsConstructor
public class Person extends BaseEntity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    private String userName;
    private String password;
}
