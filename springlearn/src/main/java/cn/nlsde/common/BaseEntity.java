package cn.nlsde.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.awt.*;
import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by zhangwj on 16/3/2.
 */
public class BaseEntity implements Comparable, Serializable {


    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public int compareTo(Object o) {
        return CompareToBuilder.reflectionCompare(this, o);
    }
}
