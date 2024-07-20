package com.hamed.pat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_PAT_SYSTEM_CONFIG")
public class SystemConfig  extends BaseEntity{
    @Column(name = "C_DIRECTION", nullable = false)
    private Boolean direction = false;

    public Boolean getCDirection() {
        return direction;
    }

    public void setCDirection(Boolean cDirection) {
        this.direction = cDirection;
    }

}