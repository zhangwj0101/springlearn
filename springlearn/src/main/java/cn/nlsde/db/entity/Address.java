package cn.nlsde.db.entity;

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
@EqualsAndHashCode(callSuper = false)
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

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})

    private Employee employee;

}