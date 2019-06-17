package com.example.demo.bean;

public class Work {

    private long id;
    private int uid;
    private String record;
    private String creationdt;
    private String updatedt;
    private String creationuid;
    private String updateuid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
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

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", uid=" + uid +
                ", record='" + record + '\'' +
                ", creationdt='" + creationdt + '\'' +
                ", updatedt='" + updatedt + '\'' +
                ", creationuid='" + creationuid + '\'' +
                ", updateuid='" + updateuid + '\'' +
                '}';
    }
}
