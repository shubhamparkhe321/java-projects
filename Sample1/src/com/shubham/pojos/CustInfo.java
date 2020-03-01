package com.shubham.pojos;

public class CustInfo {

	int id;
	String name;

	public CustInfo(int id, String name) {

		this.id = id;
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "CustInfo [id=" + id + ", name=" + name + "]";
	}

}
