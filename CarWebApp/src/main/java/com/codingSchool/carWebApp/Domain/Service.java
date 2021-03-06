package com.codingSchool.carWebApp.Domain;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table (name="service")
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceid;

    @Column(nullable = false, name = "cost")
    private double cost;

    @Column(nullable = false, name = "datetime")
    private String datetime;

    @Column(nullable = false, name = "status")
    private String status;

    @Column(nullable = false, name = "type")
    private boolean type;

    @Column(nullable = false, name = "freetext")
    private String freetext;

    @ManyToOne(optional = false)
    @JoinColumn(name="userid", referencedColumnName = "userid")
    private User user;

    public Service() {
    }

    public Service(Long serviceid, double cost, String datetime, String status, boolean type, String freetext, User user) {
        this.serviceid = serviceid;
        this.cost = cost;
        this.datetime = datetime;
        this.status = status;
        this.type = type;
        this.freetext = freetext;
        this.user = user;
    }

    public Long getServiceid() {
        return serviceid;
    }

    public void setServiceid(Long serviceid) {
        this.serviceid = serviceid;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public String getFreetext() {
        return freetext;
    }

    public void setFreetext(String freetext) {
        this.freetext = freetext;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}