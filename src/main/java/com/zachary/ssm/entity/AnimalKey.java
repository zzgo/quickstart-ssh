package com.zachary.ssm.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
/**
 * 演示复合主键
 * 实现 序列化接口
 * 使用Embeddable注解
 * **/
@Embeddable
public class AnimalKey implements Serializable {
    private String userId;
    private String orgId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnimalKey animalKey = (AnimalKey) o;

        if (userId != null ? !userId.equals(animalKey.userId) : animalKey.userId != null) return false;
        return orgId != null ? orgId.equals(animalKey.orgId) : animalKey.orgId == null;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (orgId != null ? orgId.hashCode() : 0);
        return result;
    }
}
