package cn.nlsde.repository.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.cache.RedisCachePrefix;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;

/**
 * Created by zhangwj on 16/3/25.
 */
@Repository
public class RedisDAOImpl implements RedisDAO {
    @Autowired
    private RedisTemplate<String, String> template; // inject the template as ListOperations

    @Resource(name = "redisTemplate")
    private ListOperations<String, String> listOps;

    public void addLink(String userId, String url) {
        listOps.leftPush(userId, url);
    }
}
