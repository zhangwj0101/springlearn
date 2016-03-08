package cn.nlsde.entity;

import cn.nlsde.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * Created by zhangwj on 16/2/27.
 */
@Data
@Entity
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(name = "User.findUser", query = "select u from User u where id = :id")

})
@EqualsAndHashCode(callSuper = false)
public class User extends BaseEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private String userName;
    private String password;

}
