package com.neo.Entity;

import java.io.Serializable;

public class Result implements Serializable{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResultinfo() {
		return resultinfo;
	}
	public void setResultinfo(String resultinfo) {
		this.resultinfo = resultinfo;
	}
	private int id;
	private String date;
	private String name;
	private String resultinfo;
	@Override
	public String toString() {
		return "Result [id=" + id + ", date=" + date + ", name=" + name
				+ ", resultinfo=" + resultinfo + "]";
	}

}
