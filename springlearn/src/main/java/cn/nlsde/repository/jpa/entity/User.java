package cn.nlsde.repository.jpa.entity;

import cn.nlsde.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import java.util.Collection;

/**
 * Created by zhangwj on 16/2/27.
 */
@Data
@Entity
@Table(name = "TB_USER")
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(name = "User.findUser", query = "select u from User u where u.id = :id")


})
@EqualsAndHashCode(exclude = {"id"}, callSuper = false)
public class User extends BaseEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    @NotNull(message = "用户名不能为空")
    private String userName;
    private String password;

    @ManyToMany
    @JoinTable(name = "RF_USER_ROLE", joinColumns
            = @JoinColumn(name = "USER_ID"), inverseJoinColumns
            = @JoinColumn(name = "ROLE_ID"))
    private Collection<Role> roles;
}
