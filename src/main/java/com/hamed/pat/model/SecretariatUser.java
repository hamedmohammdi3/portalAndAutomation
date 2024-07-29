package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "T_PAT_SECRETARIAT_USER")
public class SecretariatUser extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "F_SEC_USER_ID")
    private Secretariat secUser;

    @Column(name = "C_ORG_TYPE")
    private Integer orgType;

    @Nationalized
    @Column(name = "C_SERIES")
    private String series;

    @Column(name = "C_USER_TYPE")
    private Integer userType;

    @Nationalized
    @Column(name = "C_VR_ORG_UNIT")
    private String vrOrgUnit;

    @Nationalized
    @Column(name = "C_VR_USER")
    private String vrUser;

    public Secretariat getFSecUser() {
        return secUser;
    }

    public void setFSecUser(Secretariat fSecUser) {
        this.secUser = fSecUser;
    }

    public Integer getCOrgType() {
        return orgType;
    }

    public void setCOrgType(Integer cOrgType) {
        this.orgType = cOrgType;
    }

    public String getCSeries() {
        return series;
    }

    public void setCSeries(String cSeries) {
        this.series = cSeries;
    }

    public Integer getCUserType() {
        return userType;
    }

    public void setCUserType(Integer cUserType) {
        this.userType = cUserType;
    }

    public String getCVrOrgUnit() {
        return vrOrgUnit;
    }

    public void setCVrOrgUnit(String cVrOrgUnit) {
        this.vrOrgUnit = cVrOrgUnit;
    }

    public String getCVrUser() {
        return vrUser;
    }

    public void setCVrUser(String cVrUser) {
        this.vrUser = cVrUser;
    }
}