package com.hamed.pat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "T_PAT_SECRET_CONFIG")
public class SecretConfig extends BaseEntity{
    @Nationalized
    @Column(name = "C_HOST_EMAIL", nullable = false)
    private String hostEmail;

    @Nationalized
    @Column(name = "C_PASSWORD", nullable = false)
    private String password;

    @Nationalized
    @Column(name = "C_PORT_EMAIL", nullable = false)
    private String portEmail;

    @Nationalized
    @Column(name = "C_USER_NAME", nullable = false)
    private String userName;

    @Nationalized
    @Column(name = "C_PORT_SERVER", nullable = false)
    private String cPortServer;

    @Column(name = "C_LAST_DATE")
    private Long cLastDate;

    @Nationalized
    @Column(name = "C_PROTOCOL")
    private String cProtocol;

    @Nationalized
    @Column(name = "C_SSL_TYPE")
    private String sslType;

    public String getCHostEmail() {
        return hostEmail;
    }

    public void setCHostEmail(String cHostEmail) {
        this.hostEmail = cHostEmail;
    }

    public String getCPassword() {
        return password;
    }

    public void setCPassword(String cPassword) {
        this.password = cPassword;
    }

    public String getCPortEmail() {
        return portEmail;
    }

    public void setCPortEmail(String cPortEmail) {
        this.portEmail = cPortEmail;
    }

    public String getCUserName() {
        return userName;
    }

    public void setCUserName(String cUserName) {
        this.userName = cUserName;
    }

    public String getCPortServer() {
        return cPortServer;
    }

    public void setCPortServer(String cPortServer) {
        this.cPortServer = cPortServer;
    }

    public Long getCLastDate() {
        return cLastDate;
    }

    public void setCLastDate(Long cLastDate) {
        this.cLastDate = cLastDate;
    }

    public String getCProtocol() {
        return cProtocol;
    }

    public void setCProtocol(String cProtocol) {
        this.cProtocol = cProtocol;
    }

    public String getCSslType() {
        return sslType;
    }

    public void setCSslType(String cSslType) {
        this.sslType = cSslType;
    }

}