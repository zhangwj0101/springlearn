package cn.nlsde.privilege;

/**
 * 用户相关权限
 * Created by zhangwj on 16/3/5.
 */
public enum Privilege {

    USER_ADD("USER_ADD", "USER", "添加用户"),
    USER_ALTER("USER_ALTER", "USER", "修改用户"),
    USER_DELETE("USER_DELETE", "USER", "删除用户");

    private Privilege(String key, String group, String description) {
        this.key = key;
        this.description = description;
        this.group = group;
    }

    private final String key;
    private final String description;
    private final String group;

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }

    public String getGroup() {
        return group;
    }
}
