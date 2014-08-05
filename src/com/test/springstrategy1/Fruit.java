package com.test.springstrategy1;

public class Fruit {
	private String name;
	private String nutrition;
	private int pay;

	public Fruit(String name, String nutrition, int pay) {
		super();
		this.name = name;
		this.nutrition = nutrition;
		this.pay = pay;
		System.out.println("fruit create");
	}
	
	/*public Fruit(String name, String nutrition, String pay) {
		super();
		this.name = name;
		this.nutrition = nutrition;
		this.pay = Integer.valueOf(pay);
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNutrition() {
		return nutrition;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
}
