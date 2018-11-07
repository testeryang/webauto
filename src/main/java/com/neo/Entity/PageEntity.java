package com.neo.Entity;

public class PageEntity {
	public String getPagename() {
		return pagename;
	}
	public void setPagename(String pagename) {
		this.pagename = pagename;
	}
	public int getEleid() {
		return eleid;
	}
	public void setEleid(int eleid) {
		this.eleid = eleid;
	}
	public String getElename() {
		return elename;
	}
	public void setElename(String elename) {
		this.elename = elename;
	}
	public String getEleby() {
		return eleby;
	}
	public void setEleby(String eleby) {
		this.eleby = eleby;
	}
	public String getEletype() {
		return eletype;
	}
	public void setEletype(String eletype) {
		this.eletype = eletype;
	}
	public String pagename;
	public int eleid;
	public String elename;
	public String eleby;
	public String eletype;
	
	public String toString(){
		return "pagename:"+pagename+"elename:"+elename+"eleby:"+eleby+"eletype:"+eletype;
		
	}

	
}
