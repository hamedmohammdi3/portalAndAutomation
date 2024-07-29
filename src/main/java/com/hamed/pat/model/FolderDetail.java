package com.hamed.pat.model;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "T_PAT_FOLDER_DETAILS")
public class FolderDetail extends BaseEntity{
    @Column(name = "C_FLOW_ID", nullable = false)
    private Long flowId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "F_FOLDER_ID", nullable = false)
    private Folder folder;


    public Long getCFlowId() {
        return flowId;
    }

    public void setCFlowId(Long cFlowId) {
        this.flowId = cFlowId;
    }

    public Folder getFFolder() {
        return folder;
    }

    public void setFFolder(Folder fFolder) {
        this.folder = fFolder;
    }


}