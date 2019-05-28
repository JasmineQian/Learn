package com.example.demo.bean;

import java.io.Serializable;

public class Content implements Serializable {

    private long id;
    private int tid;
    private int uid;
    private String datetime;
    private String desc;
    private String details;
    private String creationdt;
    private String updatedt;
    private String creationuid;
    private String updateuid;

    public Content() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCreationdt() {
        return creationdt;
    }

    public void setCreationdt(String creationdt) {
        this.creationdt = creationdt;
    }

    public String getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(String updatedt) {
        this.updatedt = updatedt;
    }

    public String getCreationuid() {
        return creationuid;
    }

    public void setCreationuid(String creationuid) {
        this.creationuid = creationuid;
    }

    public String getUpdateuid() {
        return updateuid;
    }

    public void setUpdateuid(String updateuid) {
        this.updateuid = updateuid;
    }
}
