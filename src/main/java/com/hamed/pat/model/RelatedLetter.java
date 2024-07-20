package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "T_PAT_RELATED_LETTER")
public class RelatedLetter extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_RELATED_LET_ID")
    private Letter relatedLet;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_LET_ID")
    private Letter let;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_RELATED_LET_TYPE_ID")
    private CategoryElement relatedLetType;

    public Letter getRelatedLet() {
        return relatedLet;
    }

    public void setRelatedLet(Letter relatedLet) {
        this.relatedLet = relatedLet;
    }

    public Letter getLet() {
        return let;
    }

    public void setLet(Letter let) {
        this.let = let;
    }

    public CategoryElement getRelatedLetType() {
        return relatedLetType;
    }

    public void setRelatedLetType(CategoryElement relatedLetType) {
        this.relatedLetType = relatedLetType;
    }
}