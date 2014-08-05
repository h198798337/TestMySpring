package com.test.springstrategy1;

public class SequenceGenerator {
	private String prefix;
	private String suffix;
	private int initial;
	private int counter;

	public SequenceGenerator() {
	}

	public SequenceGenerator(String prefix, String suffix, int initial,
			int counter) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
		this.counter = counter;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public int getInitial() {
		return initial;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
