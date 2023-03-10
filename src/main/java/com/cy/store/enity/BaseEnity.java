package com.cy.store.enity;

import java.io.Serializable;
import java.util.Date;

//作为实体类的基类
public class BaseEnity implements Serializable {
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEnity)) return false;

        BaseEnity baseEnity = (BaseEnity) o;

        if (getCreatedUser() != null ? !getCreatedUser().equals(baseEnity.getCreatedUser()) : baseEnity.getCreatedUser() != null)
            return false;
        if (getCreatedTime() != null ? !getCreatedTime().equals(baseEnity.getCreatedTime()) : baseEnity.getCreatedTime() != null)
            return false;
        if (getModifiedUser() != null ? !getModifiedUser().equals(baseEnity.getModifiedUser()) : baseEnity.getModifiedUser() != null)
            return false;
        return getModifiedTime() != null ? getModifiedTime().equals(baseEnity.getModifiedTime()) : baseEnity.getModifiedTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getCreatedUser() != null ? getCreatedUser().hashCode() : 0;
        result = 31 * result + (getCreatedTime() != null ? getCreatedTime().hashCode() : 0);
        result = 31 * result + (getModifiedUser() != null ? getModifiedUser().hashCode() : 0);
        result = 31 * result + (getModifiedTime() != null ? getModifiedTime().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BaseEnity{" +
                "createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
