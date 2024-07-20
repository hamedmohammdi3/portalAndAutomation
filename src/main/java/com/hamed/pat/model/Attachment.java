package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "T_PAT_ATTACHMENT")
public class Attachment extends BaseEntity{


    @Nationalized
    @Column(name = "C_DESCRIPTION", length = 1000)
    private String description;

    @Nationalized
    @Column(name = "C_VR_ATTACHMENT_DOCUMENT")
    private String vrAttachmentDocument;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_ATTACH_ID")
    private Letter attach;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_ATTCH_RECEIVER_REFERRAL_SET")
    private ContactPerson fAttchReceiverReferralSet;



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVrAttachmentDocument() {
        return vrAttachmentDocument;
    }

    public void setVrAttachmentDocument(String vrAttachmentDocument) {
        this.vrAttachmentDocument = vrAttachmentDocument;
    }

    public Letter getAttach() {
        return attach;
    }

    public void setAttach(Letter attach) {
        this.attach = attach;
    }

    public ContactPerson getFAttchReceiverReferralSet() {
        return fAttchReceiverReferralSet;
    }

    public void setFAttchReceiverReferralSet(ContactPerson fAttchReceiverReferralSet) {
        this.fAttchReceiverReferralSet = fAttchReceiverReferralSet;
    }

}