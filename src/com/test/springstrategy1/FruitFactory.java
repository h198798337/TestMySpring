package com.test.springstrategy1;

public class FruitFactory {
	public static Fruit createFruit(int type) {
		switch (type) {
		case 0:
			return new Apple();
		case 1:
			return new Pear();
		default:
			throw new IllegalArgumentException("no such fruit");
		}
	}
}
