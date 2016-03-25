package cn.nlsde.repository.redis;

import cn.nlsde.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhangwj on 16/3/25.
 */
public class RedisTest extends BaseTest {


    @Autowired
    RedisDAO redisDAO;

    @Test
    public void test() {
        redisDAO.addLink("buaa", "www.buaa.edu.cn");
    }
}
