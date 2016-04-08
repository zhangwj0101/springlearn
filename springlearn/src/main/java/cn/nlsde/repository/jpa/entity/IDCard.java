package cn.nlsde.repository.jpa.entity;

import cn.nlsde.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by zwj on 2016/4/8.
 */
@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"id"}, callSuper = false)

public class IDCard extends BaseEntity {

    @Id
    private String id;

    @MapsId
    @OneToOne
    private Person person;

    private String card;


}
