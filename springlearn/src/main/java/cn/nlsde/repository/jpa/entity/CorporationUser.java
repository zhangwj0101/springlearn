package cn.nlsde.repository.jpa.entity;

import cn.nlsde.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by zwj on 2016/4/8.
 */

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"id", "user"}, callSuper = false)
public class CorporationUser extends BaseEntity {


    @Id
    private String id;

    @MapsId
    @OneToOne
    private User user;

    private String copInfo;
}
