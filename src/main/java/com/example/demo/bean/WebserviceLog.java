package com.example.demo.bean;

import java.util.Date;

public class WebserviceLog {

    private int id;
    private String sessionid;
    private String remoteipaddr;
    private String requesturl;
    private Date start_dt;
    private Date end_dt;
    private String clienthost;
    private String useragent;
    private String method;
    private String params;
    private String paramsvalue;
    private String return_msg;
    private String exception;
    private Date creation_dt;
    private Date update_dt;
    private String creationuid;
    private String updateuid;
    private String name;
    private String return_code;
    private String return_message;
    private String source;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getRemoteipaddr() {
        return remoteipaddr;
    }

    public void setRemoteipaddr(String remoteipaddr) {
        this.remoteipaddr = remoteipaddr;
    }

    public String getRequesturl() {
        return requesturl;
    }

    public void setRequesturl(String requesturl) {
        this.requesturl = requesturl;
    }

    public Date getStart_dt() {
        return start_dt;
    }

    public void setStart_dt(Date start_dt) {
        this.start_dt = start_dt;
    }

    public Date getEnd_dt() {
        return end_dt;
    }

    public void setEnd_dt(Date end_dt) {
        this.end_dt = end_dt;
    }

    public String getClienthost() {
        return clienthost;
    }

    public void setClienthost(String clienthost) {
        this.clienthost = clienthost;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getParamsvalue() {
        return paramsvalue;
    }

    public void setParamsvalue(String paramsvalue) {
        this.paramsvalue = paramsvalue;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public Date getCreation_dt() {
        return creation_dt;
    }

    public void setCreation_dt(Date creation_dt) {
        this.creation_dt = creation_dt;
    }

    public Date getUpdate_dt() {
        return update_dt;
    }

    public void setUpdate_dt(Date update_dt) {
        this.update_dt = update_dt;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_message() {
        return return_message;
    }

    public void setReturn_message(String return_message) {
        this.return_message = return_message;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "WebserviceLog{" +
                "id=" + id +
                ", sessionid='" + sessionid + '\'' +
                ", remoteipaddr='" + remoteipaddr + '\'' +
                ", requesturl='" + requesturl + '\'' +
                ", start_dt=" + start_dt +
                ", end_dt=" + end_dt +
                ", clienthost='" + clienthost + '\'' +
                ", useragent='" + useragent + '\'' +
                ", method='" + method + '\'' +
                ", params='" + params + '\'' +
                ", paramsvalue='" + paramsvalue + '\'' +
                ", return_msg='" + return_msg + '\'' +
                ", exception='" + exception + '\'' +
                ", creation_dt=" + creation_dt +
                ", update_dt=" + update_dt +
                ", creationuid='" + creationuid + '\'' +
                ", updateuid='" + updateuid + '\'' +
                ", name='" + name + '\'' +
                ", return_code='" + return_code + '\'' +
                ", return_message='" + return_message + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
