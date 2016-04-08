package cn.nlsde.repository.jpa.dao;

import cn.nlsde.repository.jpa.entity.CorporationUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zwj on 2016/4/8.
 */
public interface CorporationUserDAO extends JpaRepository<CorporationUser, String> {
}
