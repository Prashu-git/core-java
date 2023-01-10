package com.springmaven.app.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springmaven.app.comp.Notes;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext refrance = new AnnotationConfigApplicationContext(Notes.class);

		/*
		 * String [] ele = ref.getBeanDefinitionNames();
		 * System.out.println(Arrays.toString(ele));
		 * 
		 * 
		 * Notes refrence = ref.getBean(Notes.class); System.out.println(refrence);
		 */

		String string = refrance.getBean("toWorkHard", String.class);
		System.out.println(string.hashCode());

		String string1 = refrance.getBean("toStudy", String.class);
		System.out.println(string1.hashCode());

		String string2 = refrance.getBean("toWork", String.class);
		System.out.println(string2.hashCode());

		String string3 = refrance.getBean("toFocus", String.class);
		System.out.println(string3.hashCode());

		System.out.println("\n");

		System.out.println("------------------------------" + "\n");

		Double double1 = refrance.getBean("price", Double.class);
		System.out.println(double1.hashCode());

		Double double2 = refrance.getBean("amount", Double.class);
		System.out.println(double2.hashCode());

		Double double3 = refrance.getBean("rate", Double.class);
		System.out.println(double3.hashCode());

		System.out.println("\n");

		System.out.println("------------------------------" + "\n");

		Boolean boolean1 = refrance.getBean("isAlive", Boolean.class);
		System.out.println(boolean1.hashCode());

		Boolean boolean2 = refrance.getBean("isStudying", Boolean.class);
		System.out.println(boolean2.hashCode());

		Boolean boolean3 = refrance.getBean("taskCompleted", Boolean.class);
		System.out.println(boolean3.hashCode());

		System.out.println("\n");

		System.out.println("------------------------------" + "\n");

		StringBuffer stringBuffer = refrance.getBean("name", StringBuffer.class);
		System.out.println(stringBuffer.hashCode());

		StringBuffer stringBuffer1 = refrance.getBean("space", StringBuffer.class);
		System.out.println(stringBuffer1.hashCode());

		StringBuffer stringBuffer2 = refrance.getBean("java", StringBuffer.class);
		System.out.println(stringBuffer2.hashCode());

		System.out.println("\n");

		System.out.println("------------------------------" + "\n");

		StringBuilder stringBuilder = refrance.getBean("a1", StringBuilder.class);
		System.out.println(stringBuilder.hashCode());

		StringBuilder stringBuilder1 = refrance.getBean("a2", StringBuilder.class);
		System.out.println(stringBuilder1.hashCode());

		StringBuilder stringBuilder2 = refrance.getBean("a3", StringBuilder.class);
		System.out.println(stringBuilder2.hashCode());

		System.out.println("\n");

		System.out.println("------------------------------" + "\n");

		ArrayList arrayList = refrance.getBean("arrayList", ArrayList.class);
		System.out.println(arrayList.hashCode());

		System.out.println("\n");

		System.out.println("------------------------------" + "\n");

		Map map = refrance.getBean("hash", HashMap.class);
		System.out.println(map.hashCode());

		String[] strings = refrance.getBeanDefinitionNames();
		System.out.println(Arrays.toString(strings));

	}

}
