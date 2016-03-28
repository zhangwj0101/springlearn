package cn.nlsde.entity;

import cn.nlsde.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * Created by zhangwj on 16/2/27.
 */
@Data
@Entity
@NoArgsConstructor
@NamedQueries({@NamedQuery(name = "getUser",
        query = "select u from User u where u.id = :id")})
@EqualsAndHashCode(callSuper = false, exclude = "id")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private String userName;
    private String password;

}
