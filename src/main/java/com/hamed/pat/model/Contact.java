package com.hamed.pat.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "T_PAT_CONTACTS")
public class Contact {
    @Id
    @Column(name = "C_ID", nullable = false)
    private Long id;

    @Nationalized
    @Column(name = "C_CREATOR")
    private String cCreator;

    @Nationalized
    @Column(name = "C_VR_ORGANIZATION")
    private String cVrOrganization;

    @Nationalized
    @Column(name = "C_VR_PERSON")
    private String cVrPerson;

    @Column(name = "C_ACTIVE")
    private Boolean cActive;

    @OneToMany
    private Set<ContactsDetail> contactsDetail;
    @Column(name = "C_VERSION", nullable = false)
    private Long cVersion;

    @Column(name = "C_INSERTTIME")
    private Instant cInserttime;

    @Column(name = "C_UPDATETIME")
    private Instant cUpdatetime;

    @Nationalized
    @Column(name = "C_INSERTUSER")
    private String cInsertuser;

    @Nationalized
    @Column(name = "C_UPDATEUSER")
    private String cUpdateuser;

    @Column(name = "C_INTER_ENGINE_LETTER")
    private Boolean cInterEngineLetter;

    @Nationalized
    @Column(name = "C_VR_LABOR")
    private String cVrLabor;

}