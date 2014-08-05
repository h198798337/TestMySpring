package com.test.springstrategy1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class RepertoryDao {

	public List<Apple> getSomeApples() {
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(new Apple("small apple", "", 20));
		apples.add(new Apple("middle apple", "", 30));
		apples.add(new Apple("big apple", "", 40));
		return apples;
	}
	
}
