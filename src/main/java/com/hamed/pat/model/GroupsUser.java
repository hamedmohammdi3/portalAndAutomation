package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "T_PAT_GROUPS_USER")
public class GroupsUser extends BaseEntity{

    @Nationalized
    @Column(name = "C_TITLE")
    private String title;

    @Nationalized
    @Column(name = "C_PERSONAL_CODE")
    private String personalCode;

    @Column(name = "C_RECEIVER_REFERRAL")
    private Boolean receiverReferral;

    @OneToMany(mappedBy = "member")
    private Set<ContactPerson> contactPeople = new LinkedHashSet<>();



    public String getCTitle() {
        return title;
    }

    public void setCTitle(String cTitle) {
        this.title = cTitle;
    }

    public String getCPersonalCode() {
        return personalCode;
    }

    public void setCPersonalCode(String cPersonalCode) {
        this.personalCode = cPersonalCode;
    }

    public Boolean getCReceiverReferral() {
        return receiverReferral;
    }

    public void setCReceiverReferral(Boolean cReceiverReferral) {
        this.receiverReferral = cReceiverReferral;
    }

    public Set<ContactPerson> getTPatContactPeople() {
        return contactPeople;
    }

    public void setTPatContactPeople(Set<ContactPerson> tPatContactPeople) {
        this.contactPeople = tPatContactPeople;
    }

}