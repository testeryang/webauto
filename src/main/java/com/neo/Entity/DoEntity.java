package com.neo.Entity;

public class DoEntity {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDocase() {
		return docase;
	}
	public void setDocase(String docase) {
		this.docase = docase;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int id;
	public String docase;
	public String msg;
	
	public String tostring(){
		return "id:"+id+"docase:"+docase+"msg:"+msg;
		
	}
}
