package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "T_PAT_RESERVED_NUMBERS")
public class ReservedNumber extends BaseEntity {

    @Nationalized
    @Column(name = "C_NO")
    private String no;
    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "F_RESERVED_ID")
    private Secretariat reserved;

    public String getCNo() {
        return no;
    }

    public void setCNo(String cNo) {
        this.no = cNo;
    }

    public Secretariat getFReserved() {
        return reserved;
    }

    public void setFReserved(Secretariat fReserved) {
        this.reserved = fReserved;
    }

}