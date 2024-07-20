package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "T_PAT_SECRETARIAT")
public class Secretariat extends BaseEntity {
    @Column(name = "C_APPROVEMENT_FLOW_TYPE")
    private Integer approvementFlowType;

    @Nationalized
    @Column(name = "C_CODE")
    private String code;

    @Column(name = "C_IS_DEFAULT", nullable = false)
    private Boolean isDefault = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_LETTER_CTG_TYPE_ID")
    private CategoryElement letterCtgType;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_LETTER_NATION_ID")
    private CategoryElement letterNation;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_PARENT_ID")
    private Secretariat parent;

    @Nationalized
    @Column(name = "C_TITLE")
    private String title;

    @Nationalized
    @Column(name = "C_VR_INCOMING_CODE_TEMPLATE")
    private String vrIncomingCodeTemplate;

    @Nationalized
    @Column(name = "C_VR_INTERNAL_CODE_TEMPLATE")
    private String vrInternalCodeTemplate;

    @Nationalized
    @Column(name = "C_VR_ORGANIZATION_UNIT")
    private String vrOrganizationUnit;

    @Nationalized
    @Column(name = "C_VR_OUTGOING_CODE_TEMPLATE")
    private String vrOutgoingCodeTemplate;

    @Nationalized
    @Column(name = "C_VR_PARENT_ORGANIZATION_UNIT")
    private String vrParentOrganizationUnit;
    @Nationalized
    @Column(name = "C_INCOMING_PC_TITLE")
    private String incomingPcTitle;

    @Nationalized
    @Column(name = "C_INTERNAL_PC_TITLE")
    private String internalPcTitle;

    @Nationalized
    @Column(name = "C_OUTGOING_PC_TITLE")
    private String outgoingPcTitle;

    @Nationalized
    @Column(name = "C_TASK_NO_PATTERN")
    private String taskNoPattern;

    @Nationalized
    @Column(name = "C_TASK_PC_TITLE")
    private String taskPcTitle;

    @Column(name = "F_SECRET_CONFIG")
    private Long secretConfig;
    public Integer getCApprovementFlowType() {
        return approvementFlowType;
    }

    public void setCApprovementFlowType(Integer cApprovementFlowType) {
        this.approvementFlowType = cApprovementFlowType;
    }

    public String getCCode() {
        return code;
    }

    public void setCCode(String cCode) {
        this.code = cCode;
    }

    public Boolean getCIsDefault() {
        return isDefault;
    }

    public void setCIsDefault(Boolean cIsDefault) {
        this.isDefault = cIsDefault;
    }

    public CategoryElement getFLetterCtgType() {
        return letterCtgType;
    }

    public void setFLetterCtgType(CategoryElement fLetterCtgType) {
        this.letterCtgType = fLetterCtgType;
    }

    public CategoryElement getFLetterNation() {
        return letterNation;
    }

    public void setFLetterNation(CategoryElement fLetterNation) {
        this.letterNation = fLetterNation;
    }

    public Secretariat getFParent() {
        return parent;
    }

    public void setFParent(Secretariat fParent) {
        this.parent = fParent;
    }

    public String getCTitle() {
        return title;
    }

    public void setCTitle(String cTitle) {
        this.title = cTitle;
    }

    public String getCVrIncomingCodeTemplate() {
        return vrIncomingCodeTemplate;
    }

    public void setCVrIncomingCodeTemplate(String cVrIncomingCodeTemplate) {
        this.vrIncomingCodeTemplate = cVrIncomingCodeTemplate;
    }

    public String getCVrInternalCodeTemplate() {
        return vrInternalCodeTemplate;
    }

    public void setCVrInternalCodeTemplate(String cVrInternalCodeTemplate) {
        this.vrInternalCodeTemplate = cVrInternalCodeTemplate;
    }

    public String getCVrOrganizationUnit() {
        return vrOrganizationUnit;
    }

    public void setCVrOrganizationUnit(String cVrOrganizationUnit) {
        this.vrOrganizationUnit = cVrOrganizationUnit;
    }

    public String getCVrOutgoingCodeTemplate() {
        return vrOutgoingCodeTemplate;
    }

    public void setCVrOutgoingCodeTemplate(String cVrOutgoingCodeTemplate) {
        this.vrOutgoingCodeTemplate = cVrOutgoingCodeTemplate;
    }

    public String getCVrParentOrganizationUnit() {
        return vrParentOrganizationUnit;
    }

    public void setCVrParentOrganizationUnit(String cVrParentOrganizationUnit) {
        this.vrParentOrganizationUnit = cVrParentOrganizationUnit;
    }
    public String getCIncomingPcTitle() {
        return incomingPcTitle;
    }

    public void setCIncomingPcTitle(String cIncomingPcTitle) {
        this.incomingPcTitle = cIncomingPcTitle;
    }

    public String getCInternalPcTitle() {
        return internalPcTitle;
    }

    public void setCInternalPcTitle(String cInternalPcTitle) {
        this.internalPcTitle = cInternalPcTitle;
    }

    public String getCOutgoingPcTitle() {
        return outgoingPcTitle;
    }

    public void setCOutgoingPcTitle(String cOutgoingPcTitle) {
        this.outgoingPcTitle = cOutgoingPcTitle;
    }

    public String getCTaskNoPattern() {
        return taskNoPattern;
    }

    public void setCTaskNoPattern(String cTaskNoPattern) {
        this.taskNoPattern = cTaskNoPattern;
    }

    public String getCTaskPcTitle() {
        return taskPcTitle;
    }

    public void setCTaskPcTitle(String cTaskPcTitle) {
        this.taskPcTitle = cTaskPcTitle;
    }

    public Long getFSecretConfig() {
        return secretConfig;
    }

    public void setFSecretConfig(Long fSecretConfig) {
        this.secretConfig = fSecretConfig;
    }

}