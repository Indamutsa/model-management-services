package com.arsene.modeltransformation.DTO;

public class SimpleMetric extends Metric{
	private String value;

	public SimpleMetric() {
	}
	public SimpleMetric(String name, String value) {
		this.setName(name);
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
