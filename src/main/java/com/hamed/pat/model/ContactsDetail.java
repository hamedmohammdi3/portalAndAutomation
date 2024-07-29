package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "T_PAT_CONTACTS_DETIALS")
public class ContactsDetail extends BaseEntity {
    @Nationalized
    @Column(name = "C_ADDRESS", length = 4000)
    private String address;

    @Nationalized
    @Column(name = "C_BUSSINESS_REGISTRATION")
    private String bussinessRegistration;

    @Nationalized
    @Column(name = "C_CREATOR")
    private String creator;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "F_DETIALS", nullable = false)
    private Contact detials;

    @Nationalized
    @Column(name = "C_EMAIL")
    private String email;

    @Nationalized
    @Column(name = "C_FAX")
    private String fax;

    @Nationalized
    @Column(name = "C_JOB_TITLE")
    private String jobTitle;

    @Nationalized
    @Column(name = "C_NAME_PREFIX")
    private String namePrefix;

    @Nationalized
    @Column(name = "C_NATIONAL_CODE")
    private String nationalCode;

    @Nationalized
    @Column(name = "C_NATIONAL_ID")
    private String nationalId;

    @Nationalized
    @Column(name = "C_PHONE")
    private String phone;

    @Nationalized
    @Column(name = "C_VR_ORG_OF_PERSON")
    private String vrOrgOfPerson;

    @Nationalized
    @Column(name = "C_WEBSITE")
    private String website;
    @Column(name = "C_IS_AUTOMATION")
    private Boolean isAutomation;

    @Column(name = "C_SEND_OF_ECE")
    private Boolean sendOfEce;

    @Nationalized
    @Column(name = "C_UNIT_TITLE")
    private String unitTitle;

    public String getCAddress() {
        return address;
    }

    public void setCAddress(String cAddress) {
        this.address = cAddress;
    }

    public String getCBussinessRegistration() {
        return bussinessRegistration;
    }

    public void setCBussinessRegistration(String cBussinessRegistration) {
        this.bussinessRegistration = cBussinessRegistration;
    }

    public String getCCreator() {
        return creator;
    }

    public void setCCreator(String cCreator) {
        this.creator = cCreator;
    }

    public Contact getFDetials() {
        return detials;
    }

    public void setFDetials(Contact fDetials) {
        this.detials = fDetials;
    }

    public String getCEmail() {
        return email;
    }

    public void setCEmail(String cEmail) {
        this.email = cEmail;
    }

    public String getCFax() {
        return fax;
    }

    public void setCFax(String cFax) {
        this.fax = cFax;
    }

    public String getCJobTitle() {
        return jobTitle;
    }

    public void setCJobTitle(String cJobTitle) {
        this.jobTitle = cJobTitle;
    }

    public String getCNamePrefix() {
        return namePrefix;
    }

    public void setCNamePrefix(String cNamePrefix) {
        this.namePrefix = cNamePrefix;
    }

    public String getCNationalCode() {
        return nationalCode;
    }

    public void setCNationalCode(String cNationalCode) {
        this.nationalCode = cNationalCode;
    }

    public String getCNationalId() {
        return nationalId;
    }

    public void setCNationalId(String cNationalId) {
        this.nationalId = cNationalId;
    }

    public String getCPhone() {
        return phone;
    }

    public void setCPhone(String cPhone) {
        this.phone = cPhone;
    }

    public String getCVrOrgOfPerson() {
        return vrOrgOfPerson;
    }

    public void setCVrOrgOfPerson(String cVrOrgOfPerson) {
        this.vrOrgOfPerson = cVrOrgOfPerson;
    }

    public String getCWebsite() {
        return website;
    }

    public void setCWebsite(String cWebsite) {
        this.website = cWebsite;
    }

    public Boolean getCIsAutomation() {
        return isAutomation;
    }

    public void setCIsAutomation(Boolean cIsAutomation) {
        this.isAutomation = cIsAutomation;
    }

    public Boolean getCSendOfEce() {
        return sendOfEce;
    }

    public void setCSendOfEce(Boolean cSendOfEce) {
        this.sendOfEce = cSendOfEce;
    }

    public String getCUnitTitle() {
        return unitTitle;
    }

    public void setCUnitTitle(String cUnitTitle) {
        this.unitTitle = cUnitTitle;
    }

}