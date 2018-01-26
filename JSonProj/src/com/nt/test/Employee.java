package com.nt.test;

public class Employee {
	private int eid;
	private String name;
	private String add;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", add=" + add + "]";
	}
	

}
