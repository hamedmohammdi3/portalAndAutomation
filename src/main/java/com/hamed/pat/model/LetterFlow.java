package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Entity
@Table(name = "T_PAT_LETTER_FLOW")
public class LetterFlow extends BaseEntity {
    @Nationalized
    @Column(name = "C_ACTION_TYPE")
    private String actionType;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_APPROV_RESULT_ID")
    private CategoryElement approvResult;

    @Nationalized
    @Column(name = "C_BODY", length = 4000)
    private String body;

    @Column(name = "C_IS_ORIGINAL", nullable = false)
    private Boolean isOriginal = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_LETTER_ID", nullable = false)
    private Letter letter;

    @Column(name = "C_NEED_MORE_APPROVE", nullable = false)
    private Boolean needMoreApprove = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_PARENT_FLOW_ID")
    private LetterFlow parentFlow;

    @Column(name = "C_VERIFY_DATE")
    private Instant verifyDate;

    @Nationalized
    @Column(name = "C_DESCRIPTION", length = 4000)
    private String description;

    @Column(name = "C_IS_READ", nullable = false)
    private Boolean isRead = false;

    @Column(name = "C_READ_TIME")
    private Instant readTime;



    public String getCActionType() {
        return actionType;
    }

    public void setCActionType(String cActionType) {
        this.actionType = cActionType;
    }

    public CategoryElement getFApprovResult() {
        return approvResult;
    }

    public void setFApprovResult(CategoryElement fApprovResult) {
        this.approvResult = fApprovResult;
    }

    public String getCBody() {
        return body;
    }

    public void setCBody(String cBody) {
        this.body = cBody;
    }

    public Boolean getCIsOriginal() {
        return isOriginal;
    }

    public void setCIsOriginal(Boolean cIsOriginal) {
        this.isOriginal = cIsOriginal;
    }

    public Letter getFLetter() {
        return letter;
    }

    public void setFLetter(Letter fLetter) {
        this.letter = fLetter;
    }

    public Boolean getCNeedMoreApprove() {
        return needMoreApprove;
    }

    public void setCNeedMoreApprove(Boolean cNeedMoreApprove) {
        this.needMoreApprove = cNeedMoreApprove;
    }

    public LetterFlow getFParentFlow() {
        return parentFlow;
    }

    public void setFParentFlow(LetterFlow fParentFlow) {
        this.parentFlow = fParentFlow;
    }

    public Instant getCVerifyDate() {
        return verifyDate;
    }

    public void setCVerifyDate(Instant cVerifyDate) {
        this.verifyDate = cVerifyDate;
    }

    public String getCDescription() {
        return description;
    }

    public void setCDescription(String cDescription) {
        this.description = cDescription;
    }

    public Boolean getCIsRead() {
        return isRead;
    }

    public void setCIsRead(Boolean cIsRead) {
        this.isRead = cIsRead;
    }

    public Instant getCReadTime() {
        return readTime;
    }

    public void setCReadTime(Instant cReadTime) {
        this.readTime = cReadTime;
    }

}