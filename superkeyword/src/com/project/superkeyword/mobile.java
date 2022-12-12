package com.project.superkeyword;

public class mobile {
	String name;
	String model;
	float cost;
	boolean isprovidedfacelock;
	mobile(){
		
	}
	public mobile(String name, String model, float cost, boolean isprovidedfacelock) {
		//super();
		this.name = name;
		this.model = model;
		this.cost = cost;
		this.isprovidedfacelock = isprovidedfacelock;
	}
	@Override
	public String toString() {
		return "mobile [name=" + name + ", model=" + model + ", cost=" + cost + ", isprovidedfacelock="
				+ isprovidedfacelock + "]";
	}
	
	

}
