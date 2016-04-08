package cn.nlsde.common;

import org.apache.commons.lang3.builder.*;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by zhangwj on 16/3/2.
 */

@MappedSuperclass
public class BaseEntity implements Comparable, Serializable {


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }

    public int compareTo(Object o) {
        return CompareToBuilder.reflectionCompare(this, o);
    }
}
