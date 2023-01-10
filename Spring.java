package com.springmaven.app.confo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.springs.app")
public class Spring {

	@Bean
	public String toWorkHard() {
		System.out.println("Inside toWorkHard method");
	//	String string = new String("inAllFormates");
		return "dgjgv";
	}

	@Bean
	public String toStudy() {
		System.out.println("Inside toStudy method");
		return "run";
	}

	@Bean
	public String toWork() {
		System.out.println("inside toWork method");
		return "AllZWell";

	}

	@Bean
	public String toFocus() {
		System.out.println("inside toFocus method");
		return toFocus();
	}

	@Bean
	public Double price() {

		System.out.println("inside price method");
		Double double1 = new Double(25.00);

		return double1;
	}

	@Bean
	public Double amount() {
		System.out.println("inside amount method");
		return 45.23;

	}

	@Bean
	public Double rate() {

		System.out.println("inide rate method");

		return 47.00;

	}

	@Bean
	public Boolean isAlive() {
		System.out.println("inside isAlive method");

		return true;

	}

	@Bean
	public Boolean isStudying() {
		System.out.println("inside isStudying method");
		Boolean boolean1 = new Boolean(false);
		return boolean1;

	}

	@Bean
	public Boolean taskCompleted() {
		System.out.println("inside task completed method");
		return true;

	}

	@Bean

	public StringBuffer name() {
		System.out.println("inside name method");
		StringBuffer stringBuffer = new StringBuffer();
		return stringBuffer;

	}

	@Bean
	public StringBuffer space() {
		System.out.println("inside name method");
		StringBuffer stringBuffer = new StringBuffer();
		return stringBuffer;
	}

	@Bean
	public StringBuffer java() {
		System.out.println("inside name method");
		// StringBuffer stringBuffer = new StringBuffer();
		return java();
	}

	@Bean
	public StringBuilder a1() {

		System.out.println("inside a1 method");
		return a1();
	}

	@Bean
	public StringBuilder a2() {
		System.out.println("inside a2 method");
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder;

	}

	@Bean
	public StringBuilder a3() {
		System.out.println("inside a2 method");
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder;
	}

	@Bean
	public Map hash() {

		System.out.println("inside hash()");

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("prashant", 100);
		hashMap.put("shashi", 9);
		hashMap.put("sandesh", 50);

		return hashMap;

	}

	@Bean
	public ArrayList arrayList() {

		System.out.println("inside arrayList()");

		ArrayList<Double> refrance = new ArrayList<Double>();
		refrance.add(99.02);
		refrance.add(75.78);
		refrance.add(15.32);
		return refrance;

	}

}
