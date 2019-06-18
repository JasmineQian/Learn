package com.example.demo.bean;

public class Type {

    private int id;
    private String name;
    private String creationdt;
    private String updatedt;
    private String creationuid;
    private String updateuid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creationdt='" + creationdt + '\'' +
                ", updatedt='" + updatedt + '\'' +
                ", creationuid='" + creationuid + '\'' +
                ", updateuid='" + updateuid + '\'' +
                '}';
    }
}

