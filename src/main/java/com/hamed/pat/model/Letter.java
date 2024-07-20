package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "T_PAT_LETTER")
public class Letter extends BaseEntity{
    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_ACTION_CTGE_ID")
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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_DIRECTION_ID", nullable = false)
    private CategoryElement direction;

    @Nationalized
    @Column(name = "C_DOC_FILE")
    private String docFile;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_DOC_TYPE_ID")
    private CategoryElement docType;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
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

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_LETTER_TYPE_ID")
    private CategoryElement letterType;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_PRIORITY_CTGE_ID")
    private CategoryElement priority;

    @Nationalized
    @Column(name = "C_REFERENCE", length = 4000)
    private String reference;

    @Column(name = "C_REGISTER_DATE")
    private Timestamp registerDate;

    @OneToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_SECRET_ID")
    private SecretariatInfo secret;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_SECURITY_CTGE_ID")
    private CategoryElement security;

    @Nationalized
    @Column(name = "C_SUBJECT", nullable = false, length = 4000)
    private String subject;

    @Nationalized
    @Column(name = "C_VR_CREATOR")
    private String vrCreator;

    @OneToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
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

    @Lob
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
    private Set<RelatedLetter> relatedLetter;
    @Transient
    private String additionDateTransient;
    @OneToMany(mappedBy = "receiverReferral")
    private Set<ContactPerson> receiverReferralSet;

    @OneToMany(mappedBy = "ccPerson")
    private Set<ContactPerson> ccPersonSet;

    @OneToMany(mappedBy = "bccPerson")
    private Set<ContactPerson> bccPersonSet;
    @OneToMany(mappedBy = "toPerson")
    private Set<ContactPerson> toPersonSet;
    @Transient
    private String actionType;

    @OneToMany(mappedBy = "toOrg")
    private Set<ContactPerson> toOrgSet;
    @OneToMany(mappedBy = "signerPerson")
    private Set<ContactPerson> signerPersonSet;

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Set<ContactPerson> getToOrgSet() {
        return toOrgSet;
    }

    public void setToOrgSet(Set<ContactPerson> toOrgSet) {
        this.toOrgSet = toOrgSet;
    }

    public Set<ContactPerson> getSignerPersonSet() {
        return signerPersonSet;
    }

    public void setSignerPersonSet(Set<ContactPerson> signerPersonSet) {
        this.signerPersonSet = signerPersonSet;
    }

    public Set<ContactPerson> getCcPersonSet() {
        return ccPersonSet;
    }

    public void setCcPersonSet(Set<ContactPerson> ccPersonSet) {
        this.ccPersonSet = ccPersonSet;
    }

    public Set<ContactPerson> getBccPersonSet() {
        return bccPersonSet;
    }

    public void setBccPersonSet(Set<ContactPerson> bccPersonSet) {
        this.bccPersonSet = bccPersonSet;
    }

    public Set<ContactPerson> getToPersonSet() {
        return toPersonSet;
    }

    public void setToPersonSet(Set<ContactPerson> toPersonSet) {
        this.toPersonSet = toPersonSet;
    }

    public String getAdditionDateTransient() {
        return additionDateTransient;
    }

    public void setAdditionDateTransient(String additionDateTransient) {
        this.additionDateTransient = additionDateTransient;
    }

    public Set<ContactPerson> getReceiverReferralSet() {
        return receiverReferralSet;
    }

    public void setReceiverReferralSet(Set<ContactPerson> receiverReferralSet) {
        this.receiverReferralSet = receiverReferralSet;
    }

    public String getCheckAttach() {
        return checkAttach;
    }

    public void setCheckAttach(String checkAttach) {
        this.checkAttach = checkAttach;
    }

    public Set<RelatedLetter> getRelatedLetter() {
        return relatedLetter;
    }

    public void setRelatedLetter(Set<RelatedLetter> relatedLetter) {
        this.relatedLetter = relatedLetter;
    }

    public Set<Attachment> getAttachmentSet() {
        return attachmentSet;
    }

    public void setAttachmentSet(Set<Attachment> attachmentSet) {
        attachmentSet = attachmentSet;
    }

    public CategoryElement getForAction() {
        return forAction;
    }

    public void setForAction(CategoryElement forAction) {
        this.forAction = forAction;
    }

    public String getBody2() {
        return body2;
    }

    public void setBody2(String body2) {
        this.body2 = body2;
    }

    public String getBodyFile() {
        return bodyFile;
    }

    public void setBodyFile(String bodyFile) {
        this.bodyFile = bodyFile;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public CategoryElement getDirection() {
        return direction;
    }

    public void setDirection(CategoryElement direction) {
        this.direction = direction;
    }

    public String getDocFile() {
        return docFile;
    }

    public void setDocFile(String docFile) {
        this.docFile = docFile;
    }

    public CategoryElement getDocType() {
        return docType;
    }

    public void setDocType(CategoryElement docType) {
        this.docType = docType;
    }

    public ContactPerson getFromPerson() {
        return fromPerson;
    }

    public void setFromPerson(ContactPerson fromPerson) {
        this.fromPerson = fromPerson;
    }

    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean template) {
        isTemplate = template;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getLetterNo() {
        return letterNo;
    }

    public void setLetterNo(String letterNo) {
        this.letterNo = letterNo;
    }

    public CategoryElement getLetterType() {
        return letterType;
    }

    public void setLetterType(CategoryElement letterType) {
        this.letterType = letterType;
    }

    public CategoryElement getPriority() {
        return priority;
    }

    public void setPriority(CategoryElement priority) {
        this.priority = priority;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }

    public SecretariatInfo getSecret() {
        return secret;
    }

    public void setSecret(SecretariatInfo secret) {
        this.secret = secret;
    }

    public CategoryElement getSecurity() {
        return security;
    }

    public void setSecurity(CategoryElement security) {
        this.security = security;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getVrCreator() {
        return vrCreator;
    }

    public void setVrCreator(String vrCreator) {
        this.vrCreator = vrCreator;
    }

    public ContactPerson getSigner() {
        return signer;
    }

    public void setSigner(ContactPerson signer) {
        this.signer = signer;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getVrToDraft() {
        return vrToDraft;
    }

    public void setVrToDraft(String vrToDraft) {
        this.vrToDraft = vrToDraft;
    }

    public String getOldLetterNo() {
        return oldLetterNo;
    }

    public void setOldLetterNo(String oldLetterNo) {
        this.oldLetterNo = oldLetterNo;
    }

    public String getBodyOld() {
        return bodyOld;
    }

    public void setBodyOld(String bodyOld) {
        this.bodyOld = bodyOld;
    }

    public Boolean getIsSubmit() {
        return isSubmit;
    }

    public void setIsSubmit(Boolean submit) {
        isSubmit = submit;
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo;
    }

    public String getAddtionData() {
        return addtionData;
    }

    public void setAddtionData(String addtionData) {
        this.addtionData = addtionData;
    }

    public Boolean getMinutes() {
        return minutes;
    }

    public void setMinutes(Boolean minutes) {
        this.minutes = minutes;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}