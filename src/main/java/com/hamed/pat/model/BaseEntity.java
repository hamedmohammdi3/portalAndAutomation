package com.hamed.pat.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable {
    @Id
    @Column(name = "C_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "C_ACTIVE")
    private Boolean active = true;

    @Column(name = "C_VERSION", nullable = false)
    @Version
    private long version;

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

}

