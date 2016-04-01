package cn.nlsde.repository.jpa.entity;

/**
 * Created by zwj on 2016/4/1.
 */

import cn.nlsde.common.BaseEntity;
import cn.nlsde.privilege.Privilege;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by zhangwj on 16/2/27.
 */
@Data
@Entity
@Table(name = "TB_ROLE", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"NAME"})
})
@EqualsAndHashCode(exclude = {"id"}, callSuper = false)
public class Role extends BaseEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    /**
     * Name of this role
     */
    @Column(name = "NAME",
            nullable = false)
    private String name;

    /**
     * 说明
     */
    private String description;

    /**
     * The members having this role granted
     */
    @ManyToMany(mappedBy = "roles")
    private Collection<User> members;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "RF_PRIVILEGE")
    @Enumerated(EnumType.STRING)
    private Collection<Privilege> privileges;

}

