package cn.nlsde.entity;

/**
 * Created by zhangwj on 16/3/3.
 */

import cn.nlsde.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Employee extends BaseEntity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    private String employeeName;


    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @PrePersist
    public void setDate() {
        date = new Date();
    }


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Address> addresses = new ArrayList<>();
//    private Address addresses;

}