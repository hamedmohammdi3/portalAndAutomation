package com.hamed.pat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "T_PAT_OU_CONFIG")
public class OuConfig extends BaseEntity {

    @Column(name = "C_CURRENT_ENGINE")
    private Boolean currentEngine;

    @Nationalized
    @Column(name = "C_FROM_CODE")
    private String fromCode;

    @Nationalized
    @Column(name = "C_FROM_OU")
    private String fromOu;

    @Nationalized
    @Column(name = "C_TO_CODE")
    private String toCode;

    @Nationalized
    @Column(name = "C_TO_OU")
    private String toOu;



    public Boolean getCCurrentEngine() {
        return currentEngine;
    }

    public void setCCurrentEngine(Boolean cCurrentEngine) {
        this.currentEngine = cCurrentEngine;
    }

    public String getCFromCode() {
        return fromCode;
    }

    public void setCFromCode(String cFromCode) {
        this.fromCode = cFromCode;
    }

    public String getCFromOu() {
        return fromOu;
    }

    public void setCFromOu(String cFromOu) {
        this.fromOu = cFromOu;
    }

    public String getCToCode() {
        return toCode;
    }

    public void setCToCode(String cToCode) {
        this.toCode = cToCode;
    }

    public String getCToOu() {
        return toOu;
    }

    public void setCToOu(String cToOu) {
        this.toOu = cToOu;
    }

}