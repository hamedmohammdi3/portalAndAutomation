package com.hamed.pat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "T_PAT_DESCRIPTION")
public class Description extends BaseEntity{
    @Nationalized
    @Column(name = "C_DESCRIPTION")
    private String description;

    @Nationalized
    @Column(name = "C_VR_PERSON")
    private String vrPerson;


    public String getCDescription() {
        return description;
    }

    public void setCDescription(String cDescription) {
        this.description = cDescription;
    }

    public String getCVrPerson() {
        return vrPerson;
    }

    public void setCVrPerson(String cVrPerson) {
        this.vrPerson = cVrPerson;
    }


}