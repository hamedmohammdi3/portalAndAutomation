package com.hamed.pat.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "T_PAT_LETTER")
@Setter
@Getter
public class Letter extends BaseEntity{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "F_ACTION_CTGE_ID")
    @JsonManagedReference
    private CategoryElement forAction;

    @OneToMany(mappedBy = "attach")
    private Set<Attachment> attachmentSet;
    @Nationalized
    @Column(name = "C_BODY2", length = 4000)
    private String body2;

    @Nationalized
    @Column(name = "C_BODY_FILE", nullable = false)
    private String bodyFile;

    @Column(name = "C_DATE")
    private Timestamp date;

    @Column(name = "C_DEADLINE")
    private Timestamp deadline;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "F_DIRECTION_ID", nullable = false)
    @JsonManagedReference
    @ToString.Include
    private CategoryElement direction;

    @Nationalized
    @Column(name = "C_DOC_FILE")
    private String docFile;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "F_DOC_TYPE_ID")
    private CategoryElement docType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "F_FROM_PERSON_ID")
    private ContactPerson fromPerson;

    @Column(name = "C_IS_TEMPLATE", nullable = false)
    private Boolean isTemplate = false;

    @Nationalized
    @Column(name = "C_KEYWORDS")
    private String keywords;

    @Nationalized
    @Column(name = "C_LETTER_NO")
    private String letterNo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "F_LETTER_TYPE_ID")
    private CategoryElement letterType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "F_PRIORITY_CTGE_ID")
    private CategoryElement priority;

    @Nationalized
    @Column(name = "C_REFERENCE", length = 4000)
    private String reference;

    @Column(name = "C_REGISTER_DATE")
    private Timestamp registerDate;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "F_SECRET_ID")
    private SecretariatInfo secret;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "F_SECURITY_CTGE_ID")
    private CategoryElement security;

    @Nationalized
    @Column(name = "C_SUBJECT", nullable = false, length = 4000)
    private String subject;

    @Nationalized
    @Column(name = "C_VR_CREATOR")
    private String vrCreator;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "F_SIGNER_ID")
    private ContactPerson signer;

    @Column(name = "C_TEMPLATE_ID")
    private Long templateId;

    @Nationalized
    @Column(name = "C_VR_TO_DRAFT")
    private String vrToDraft;

    @Nationalized
    @Column(name = "C_OLD_LETTER_NO")
    private String oldLetterNo;

    @Lob
    @Column(name = "C_BODY_OLD")
    private String bodyOld;

    @Column(name = "C_IS_SUBMIT", nullable = false)
    private Boolean isSubmit = false;

    @Nationalized
    @Column(name = "C_TASK_NO")
    private String taskNo;

    @Column(name = "C_ADDTION_DATA")
    private String addtionData;

    @Column(name = "C_MINUTES", nullable = false)
    private Boolean minutes = false;

    @Lob
    @Column(name = "C_BODY")
    private String body;
    @Transient
    private String checkAttach;
    @OneToMany(mappedBy = "relatedLet")
    @ToString.Exclude
    private Set<RelatedLetter> relatedLetter;
    @Transient
    private String additionDateTransient;
    @OneToMany(mappedBy = "receiverReferral")
    @ToString.Exclude
    private Set<ContactPerson> receiverReferralSet;

    @OneToMany(mappedBy = "ccPerson")
    @ToString.Exclude
    private Set<ContactPerson> ccPersonSet;

    @OneToMany(mappedBy = "bccPerson")
    @ToString.Exclude
    private Set<ContactPerson> bccPersonSet;
    @OneToMany(mappedBy = "toPerson")
    @ToString.Exclude
    private Set<ContactPerson> toPersonSet;
    @Transient
    private String actionType;

    @OneToMany(mappedBy = "toOrg")
    @ToString.Exclude
    private Set<ContactPerson> toOrgSet;
    @OneToMany(mappedBy = "signerPerson")
    @ToString.Exclude
    private Set<ContactPerson> signerPersonSet;
}