package cn.nlsde.db.dao;

import cn.nlsde.db.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhangwj on 16/3/5.
 */
public interface AddressDAO extends JpaRepository<Address, String> {
}
