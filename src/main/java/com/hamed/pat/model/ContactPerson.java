package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "T_PAT_CONTACT_PERSON")
public class ContactPerson extends BaseEntity {

    @Column(name = "C_DEADLINE")
    private Timestamp deadline;

    @Nationalized
    @Column(name = "C_DESCRIPTION", length = 1000)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_FOR_ACTION_FLOW")
    private CategoryElement forActionFlow;

    @Nationalized
    @Column(name = "C_PERSON_TYPE")
    private String personType;

    @Nationalized
    @Column(name = "C_VR_PERSON")
    private String vrPerson;

    @Nationalized
    @Column(name = "C_VR_POST")
    private String vrPost;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_BCC_PERSON_ID")
    private Letter bccPerson;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_CC_PERSON_ID")
    private Letter ccPerson;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_TO_PERSON_ID")
    private Letter toPerson;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_CC_FLOW_PERSON_ID")
    private LetterFlow ccFlowPerson;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_FLOW_PERSON_ID")
    private LetterFlow flowPerson;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_FROM_SEC_PERSON_ID")
    private Secretariat fromSecPerson;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_TO_SEC_PERSON_ID")
    private Secretariat toSecPerson;

    @Column(name = "C_DELIVERY_DATE")
    private Timestamp deliveryDate;

    @Nationalized
    @Column(name = "C_DELIVERY_INFO")
    private String deliveryInfo;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_PERSON_DEL_TYPE")
    private CategoryElement personDelType;

    @Lob
    @Column(name = "C_SIGNATURE")
    private String signature;

    @Nationalized
    @Column(name = "C_VR_ORGANIZATION")
    private String vrOrganization;

    @Nationalized
    @Column(name = "C_VR_TITLE")
    private String vrTitle;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_TO_ORG_ID")
    private Letter toOrg;

    @Column(name = "C_LABOR")
    private Integer labor;

    @Nationalized
    @Column(name = "C_VR_ORGANIZATION_ID")
    private String vrOrganizationId;

    @Nationalized
    @Column(name = "C_VR_POST_ID")
    private String vrPostId;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_RECEIVER_REFERRAL_ID")
    private Letter receiverReferral;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_MEMBER_ID")
    private GroupsUser member;

    @Column(name = "C_ORDER")
    private Integer order;

    @Nationalized
    @Column(name = "C_ROW_TYPE")
    private String rowType;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_OFFICER_SECRETARIAT")
    private Secretariat officerSecretariat;

    @Nationalized
    @Column(name = "C_JOB_TITLE")
    private String jobTitle;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_REFERRALREPRIORITY")
    private CategoryElement referralrepriority;

    @Column(name = "C_ROLE_OUTSIDE_ID")
    private Long roleOutsideId;

    @Nationalized
    @Column(name = "C_ADDITIONAL_DESCRIPTION", length = 4000)
    private String additionalDescription;

    @Column(name = "C_PUBLIC_ATTACHMENT")
    private Boolean publicAttachment;

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "F_SIGNER_PERSON_ID")
    private Letter signerPerson;

    @Column(name = "C_PUBLIC_DESCRIPTION")
    private Boolean publicDescription;

    @OneToMany(mappedBy = "fAttchReceiverReferralSet")
    private Set<Attachment> patAttachments = new LinkedHashSet<>();

    @OneToMany(mappedBy = "fromPerson")
    private Set<Letter> patLetters = new LinkedHashSet<>();

    @OneToOne(mappedBy = "signer")
    private Letter patLetter;

    @OneToOne(mappedBy = "sender")
    private SecretariatInfo patSecretariatInfo;

    @Transient
    private String sign;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryElement getForActionFlow() {
        return forActionFlow;
    }

    public void setForActionFlow(CategoryElement forActionFlow) {
        this.forActionFlow = forActionFlow;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getVrPerson() {
        return vrPerson;
    }

    public void setVrPerson(String vrPerson) {
        this.vrPerson = vrPerson;
    }

    public String getVrPost() {
        return vrPost;
    }

    public void setVrPost(String vrPost) {
        this.vrPost = vrPost;
    }

    public Letter getBccPerson() {
        return bccPerson;
    }

    public void setBccPerson(Letter bccPerson) {
        this.bccPerson = bccPerson;
    }

    public Letter getCcPerson() {
        return ccPerson;
    }

    public void setCcPerson(Letter ccPerson) {
        this.ccPerson = ccPerson;
    }

    public Letter getToPerson() {
        return toPerson;
    }

    public void setToPerson(Letter toPerson) {
        this.toPerson = toPerson;
    }

    public LetterFlow getCcFlowPerson() {
        return ccFlowPerson;
    }

    public void setCcFlowPerson(LetterFlow ccFlowPerson) {
        this.ccFlowPerson = ccFlowPerson;
    }

    public LetterFlow getFlowPerson() {
        return flowPerson;
    }

    public void setFlowPerson(LetterFlow flowPerson) {
        this.flowPerson = flowPerson;
    }

    public Secretariat getFromSecPerson() {
        return fromSecPerson;
    }

    public void setFromSecPerson(Secretariat fromSecPerson) {
        this.fromSecPerson = fromSecPerson;
    }

    public Secretariat getToSecPerson() {
        return toSecPerson;
    }

    public void setToSecPerson(Secretariat toSecPerson) {
        this.toSecPerson = toSecPerson;
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

    public CategoryElement getPersonDelType() {
        return personDelType;
    }

    public void setPersonDelType(CategoryElement personDelType) {
        this.personDelType = personDelType;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getVrOrganization() {
        return vrOrganization;
    }

    public void setVrOrganization(String vrOrganization) {
        this.vrOrganization = vrOrganization;
    }

    public String getVrTitle() {
        return vrTitle;
    }

    public void setVrTitle(String vrTitle) {
        this.vrTitle = vrTitle;
    }

    public Letter getToOrg() {
        return toOrg;
    }

    public void setToOrg(Letter toOrg) {
        this.toOrg = toOrg;
    }

    public Integer getLabor() {
        return labor;
    }

    public void setLabor(Integer labor) {
        this.labor = labor;
    }

    public String getVrOrganizationId() {
        return vrOrganizationId;
    }

    public void setVrOrganizationId(String vrOrganizationId) {
        this.vrOrganizationId = vrOrganizationId;
    }

    public String getVrPostId() {
        return vrPostId;
    }

    public void setVrPostId(String vrPostId) {
        this.vrPostId = vrPostId;
    }

    public Letter getReceiverReferral() {
        return receiverReferral;
    }

    public void setReceiverReferral(Letter receiverReferral) {
        this.receiverReferral = receiverReferral;
    }

    public GroupsUser getMember() {
        return member;
    }

    public void setMember(GroupsUser member) {
        this.member = member;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getRowType() {
        return rowType;
    }

    public void setRowType(String rowType) {
        this.rowType = rowType;
    }

    public Secretariat getOfficerSecretariat() {
        return officerSecretariat;
    }

    public void setOfficerSecretariat(Secretariat officerSecretariat) {
        this.officerSecretariat = officerSecretariat;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public CategoryElement getReferralrepriority() {
        return referralrepriority;
    }

    public void setReferralrepriority(CategoryElement referralrepriority) {
        this.referralrepriority = referralrepriority;
    }

    public Long getRoleOutsideId() {
        return roleOutsideId;
    }

    public void setRoleOutsideId(Long roleOutsideId) {
        this.roleOutsideId = roleOutsideId;
    }

    public String getAdditionalDescription() {
        return additionalDescription;
    }

    public void setAdditionalDescription(String additionalDescription) {
        this.additionalDescription = additionalDescription;
    }

    public Boolean getPublicAttachment() {
        return publicAttachment;
    }

    public void setPublicAttachment(Boolean publicAttachment) {
        this.publicAttachment = publicAttachment;
    }

    public Letter getSignerPerson() {
        return signerPerson;
    }

    public void setSignerPerson(Letter signerPerson) {
        this.signerPerson = signerPerson;
    }

    public Boolean getPublicDescription() {
        return publicDescription;
    }

    public void setPublicDescription(Boolean publicDescription) {
        this.publicDescription = publicDescription;
    }

    public Set<Attachment> getPatAttachments() {
        return patAttachments;
    }

    public void setPatAttachments(Set<Attachment> patAttachments) {
        this.patAttachments = patAttachments;
    }

    public Set<Letter> getPatLetters() {
        return patLetters;
    }

    public void setPatLetters(Set<Letter> patLetters) {
        this.patLetters = patLetters;
    }

    public Letter getPatLetter() {
        return patLetter;
    }

    public void setPatLetter(Letter patLetter) {
        this.patLetter = patLetter;
    }

    public SecretariatInfo getPatSecretariatInfo() {
        return patSecretariatInfo;
    }

    public void setPatSecretariatInfo(SecretariatInfo patSecretariatInfo) {
        this.patSecretariatInfo = patSecretariatInfo;
    }
}