package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "T_PAT_CATEGORY")
public class Category extends BaseEntity {

    @Nationalized
    @Column(name = "C_CODE", nullable = false)
    private String code;

    @Nationalized
    @Column(name = "C_TITLE", nullable = false)
    private String title;


    @OneToMany(mappedBy = "category")
    private Set<CategoryElement> categoryElements = new LinkedHashSet<>();


    public String getCCode() {
        return code;
    }

    public void setCCode(String cCode) {
        this.code = cCode;
    }

    public String getCTitle() {
        return title;
    }

    public void setCTitle(String cTitle) {
        this.title = cTitle;
    }


    public Set<CategoryElement> getTPatCategoryElements() {
        return categoryElements;
    }

    public void setTPatCategoryElements(Set<CategoryElement> categoryElements) {
        this.categoryElements = categoryElements;
    }

}