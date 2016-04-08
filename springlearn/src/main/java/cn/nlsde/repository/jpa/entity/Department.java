package cn.nlsde.repository.jpa.entity;

import cn.nlsde.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by zwj on 2016/4/8.
 */
@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"id", "employees"}, callSuper = false)
public class Department extends BaseEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private String departmentName;

    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;
}
