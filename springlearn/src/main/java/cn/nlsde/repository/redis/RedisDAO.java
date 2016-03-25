package cn.nlsde.repository.redis;

/**
 * Created by zhangwj on 16/3/25.
 */
public interface RedisDAO {

    public void addLink(String userId, String url);
}
