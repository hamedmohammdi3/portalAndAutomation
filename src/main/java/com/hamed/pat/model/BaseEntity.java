package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @Id
    @Column(name = "C_ID", nullable = false)
    private Long id;
    @Column(name = "C_ACTIVE")
    private Boolean active = true;

    @Column(name = "C_VERSION", nullable = false)
    private Long version;

    @Column(name = "C_INSERTTIME")
    private Timestamp insertTime;

    @Column(name = "C_UPDATETIME")
    private Timestamp updateTime;

    @Nationalized
    @Column(name = "C_INSERTUSER")
    private String insertingUser;

    @Nationalized
    @Column(name = "C_UPDATEUSER")
    private String updatingUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getInsertingUser() {
        return insertingUser;
    }

    public void setInsertingUser(String insertingUser) {
        this.insertingUser = insertingUser;
    }

    public String getUpdatingUser() {
        return updatingUser;
    }

    public void setUpdatingUser(String updatingUser) {
        this.updatingUser = updatingUser;
    }


    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Timestamp getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Timestamp insertTime) {
        this.insertTime = insertTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}

