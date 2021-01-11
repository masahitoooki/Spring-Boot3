package com.example.demo.model;

import java.io.Serializable;

public class Member implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = -2907925503439661273L;

	private String name;

	private String address;

	private String telno;

	public Member() {

	}

	public Member(String name, String address, String telno) {
		this.name= name;
		this.address= address;
		this.telno= telno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelno(){
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}
}
