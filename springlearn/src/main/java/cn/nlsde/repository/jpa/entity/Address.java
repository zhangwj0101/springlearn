package cn.nlsde.repository.jpa.entity;

/**
 * Created by zhangwj on 16/3/3.
 */

import cn.nlsde.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"id", "employee", "date"}, callSuper = false)
public class Address extends BaseEntity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;


    @Temporal(TemporalType.TIMESTAMP)
    private Date date;


    @PrePersist
    public void setDate() {
        date = new Date();
    }

    private String addressCountry;

    private String addressCity;

    @ManyToOne
    private Employee employee;

}