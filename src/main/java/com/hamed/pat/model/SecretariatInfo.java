package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "T_PAT_SECRETARIAT_INFO")
public class SecretariatInfo extends BaseEntity {
    @Column(name = "C_DELIVERY_DATE")
    private Timestamp deliveryDate;

    @Nationalized
    @Column(name = "C_DELIVERY_INFO")
    private String deliveryInfo;

    @Nationalized
    @Column(name = "C_DELIVERY_RECEIPT_NO")
    private String deliveryReceiptNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "F_DEL_TYPE_ID")
    private CategoryElement deliveryType;

    @Nationalized
    @Column(name = "C_INDICATOR_NO")
    private String indicatorNo;

    @Nationalized
    @Column(name = "C_PERSON_CONTACT_INFO")
    private String personContactInfo;

    @Column(name = "C_SYSTEM_PERSON", nullable = false)
    private Boolean systemPerson = false;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "F_SENDER_ID")
    private ContactPerson sender;

    @OneToOne(mappedBy = "secret")
    private Letter letter;

    @OneToMany(mappedBy = "attach")
    private Set<SecretAttachment> secretAttachments = new LinkedHashSet<>();

    @Transient
    private String fromEmail;

    public String getFromEmail() {
        return fromEmail;
    }
    @Transient
    private String sendCode;

    public String getSendCode() {
        return sendCode;
    }

    public void setSendCode(String sendCode) {
        this.sendCode = sendCode;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(String deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public String getDeliveryReceiptNo() {
        return deliveryReceiptNo;
    }

    public void setDeliveryReceiptNo(String deliveryReceiptNo) {
        this.deliveryReceiptNo = deliveryReceiptNo;
    }

    public CategoryElement getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(CategoryElement deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getIndicatorNo() {
        return indicatorNo;
    }

    public void setIndicatorNo(String indicatorNo) {
        this.indicatorNo = indicatorNo;
    }

    public String getPersonContactInfo() {
        return personContactInfo;
    }

    public void setPersonContactInfo(String personContactInfo) {
        this.personContactInfo = personContactInfo;
    }

    public Boolean getSystemPerson() {
        return systemPerson;
    }

    public void setSystemPerson(Boolean systemPerson) {
        this.systemPerson = systemPerson;
    }

    public ContactPerson getSender() {
        return sender;
    }

    public void setSender(ContactPerson sender) {
        this.sender = sender;
    }

    public Letter getLetter() {
        return letter;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }

    public Set<SecretAttachment> getSecretAttachments() {
        return secretAttachments;
    }

    public void setSecretAttachments(Set<SecretAttachment> secretAttachments) {
        this.secretAttachments = secretAttachments;
    }
}