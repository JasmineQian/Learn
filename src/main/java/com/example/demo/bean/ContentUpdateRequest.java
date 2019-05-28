package com.example.demo.bean;

public class ContentUpdateRequest {


    private long id;
    private int tid;
    private int uid;
    private String datetime;
    private String desc;
    private String details;


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


    @Override
    public String toString() {
        return "ContentUpdateRequest{" +
                "id=" + id +
                ", tid=" + tid +
                ", uid=" + uid +
                ", datetime='" + datetime + '\'' +
                ", desc='" + desc + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
