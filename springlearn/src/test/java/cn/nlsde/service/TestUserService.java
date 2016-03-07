package cn.nlsde.service;

import cn.nlsde.entity.User;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * Created by zhangwj on 16/2/27.
 */
public class TestUserService extends BaseTest {

    private static final Logger logger = Logger.getLogger(TestUserService.class);
    @Resource
    UserService userService;

    @Test
    public void testName() throws Exception {

        User s = new User();
//        s.setId("");
        s.setPassword("dfds");
        s.setUserName("dsfds");
        userService.save();
        logger.info("OK");
    }
}
