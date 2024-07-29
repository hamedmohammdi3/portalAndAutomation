package com.hamed.pat.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "T_PAT_CATEGORY_ELEMENT")
public class CategoryElement extends BaseEntity{

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "F_CATEGORY_ID", nullable = false)
    @JsonBackReference
    private Category category;



    @Nationalized
    @Column(name = "C_CODE", nullable = false)
    private String code;

    @Nationalized
    @Column(name = "C_VALUE", nullable = false)
    private String value;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}