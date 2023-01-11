package com.autowireds.app.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwearEngineer {

	@Autowired
	@Qualifier("engineerName")
	private String name;
	@Autowired
	@Qualifier("salary")
	private double salary;
	@Autowired
	@Qualifier("companyName")
	private String companyName;
	@Autowired
	@Qualifier("experiance")
	private int experiance;

	public SoftwearEngineer() {
		System.out.println("inside SoftwearEngineer()");

	}

	@Override
	public String toString() {
		return "SoftwearEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ ", experiance=" + experiance + "]";
	}

}
