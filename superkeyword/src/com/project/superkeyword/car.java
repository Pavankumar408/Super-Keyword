package com.project.superkeyword;

public class car {
	String name;
	String model;
	String color;
	double cost;
	boolean isprovidedairbag;
public car(){
	
		
		
}
	@Override
	public String toString() {
		return "car [name=" + name + ", model=" + model + ", color=" + color + ", cost=" + cost + ", isprovidedairbag="
				+ isprovidedairbag + "]";
	}
	public car(String name, String model, String color, double cost, boolean isprovidedairbag) {
		super();
		this.name = name;
		this.model = model;
		this.color = color;
		this.cost = cost;
		this.isprovidedairbag = isprovidedairbag;
	}

}
