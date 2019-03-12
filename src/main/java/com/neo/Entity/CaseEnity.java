package com.neo.Entity;

public class CaseEnity {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCasename() {
        return casename;
    }

    public void setCasename(String casename) {
        this.casename = casename;
    }

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename;
    }

    public String getElename() {
        return elename;
    }

    public void setElename(String elename) {
        this.elename = elename;
    }

    public String getDoname() {
        return doname;
    }

    public void setDoname(String doname) {
        this.doname = doname;
    }

    public String getSendinfo() {
        return sendinfo;
    }

    public void setSendinfo(String sendinfo) {
        this.sendinfo = sendinfo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int id;
    public String casename;
    public String pagename;
    public String elename;
    public String doname;
    public String sendinfo;
    public String url;

    public String toString(){
        return "id:"+id+"caseneme:"+casename+"pagename:"+pagename+"elename:"+elename+"doname:"+doname+"sendinfo:"+sendinfo+"url:"+url;
    }
}
