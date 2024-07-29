package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "T_PAT_FOLDER")
public class Folder  extends  BaseEntity{

    @Nationalized
    @Column(name = "C_CODE", nullable = false)
    private String code;

    @Nationalized
    @Column(name = "C_NAME")
    private String name;

    @Nationalized
    @Column(name = "C_VR_PERSON")
    private String vrPerson;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "F_PARENT_FOLDER_ID")
    private Folder parentFolder;

    @OneToMany(mappedBy = "parentFolder")
    private Set<Folder> folders = new LinkedHashSet<>();

    @OneToMany(mappedBy = "folder")
    private Set<FolderDetail> folderDetails = new LinkedHashSet<>();


    public String getCCode() {
        return code;
    }

    public void setCCode(String cCode) {
        this.code = cCode;
    }

    public String getCName() {
        return name;
    }

    public void setCName(String cName) {
        this.name = cName;
    }

    public String getCVrPerson() {
        return vrPerson;
    }

    public void setCVrPerson(String cVrPerson) {
        this.vrPerson = cVrPerson;
    }

    public Folder getFParentFolder() {
        return parentFolder;
    }

    public void setFParentFolder(Folder fParentFolder) {
        this.parentFolder = fParentFolder;
    }

    public Set<Folder> getTPatFolders() {
        return folders;
    }

    public void setTPatFolders(Set<Folder> folders) {
        this.folders = folders;
    }

    public Set<FolderDetail> getTPatFolderDetails() {
        return folderDetails;
    }

    public void setTPatFolderDetails(Set<FolderDetail> folderDetails) {
        this.folderDetails = folderDetails;
    }

}