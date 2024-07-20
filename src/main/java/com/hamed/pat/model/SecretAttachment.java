package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "T_PAT_SECRET_ATTACHMENT")
public class SecretAttachment extends BaseEntity{
    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_ATTACH_ID")
    private SecretariatInfo attach;

    @Nationalized
    @Column(name = "C_DESCRIPTION", length = 1000)
    private String description;

    @Nationalized
    @Column(name = "C_VR_ATTACHMENT_DOCUMENT")
    private String vrAttachmentDocument;

    public SecretariatInfo getAttach() {
        return attach;
    }

    public void setAttach(SecretariatInfo attach) {
        this.attach = attach;
    }

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
}