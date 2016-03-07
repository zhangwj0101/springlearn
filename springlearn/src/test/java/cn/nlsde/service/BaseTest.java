package cn.nlsde.service;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * Created by zhangwj on 16/2/27.
 */
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/ApplicationContext.xml"})
public class BaseTest extends AbstractJUnit4SpringContextTests {

}
