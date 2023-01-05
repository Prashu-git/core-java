package com.weapons.DTOTester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.weapons.app.DTOClass.Type;
import com.weapons.app.DTOClass.Weapons;


public class WeaponsDTOTester {
	public static void main(String[] args) {

		Weapons weapons = new Weapons("Powertrac 439 RDX", "United States", 560000, Type.Grenade);
		Weapons weapons1 = new Weapons("Beretta M9 Pistol", "Italy", 28000, Type.Pistol);
		Weapons weapons2 = new Weapons("AK-47", "Russian", 2477836.50, Type.Assault);
		Weapons weapons3 = new Weapons("m249", "United States", 337563.93, Type.Assault);
		Weapons weapons4 = new Weapons("AWM", "United Kingdom", 850000.00, Type.sniper);
		Weapons weapons5 = new Weapons("UZI", "Arab-Israeli", 70000.00, Type.SMG);
		Weapons weapons6 = new Weapons("UMP45", "Germany", 45623.00, Type.SMG);
		Weapons weapons7 = new Weapons("AK-630 ", " India", 12364894.00, Type.Assault);
		Weapons weapons8 = new Weapons("S12K", "United States", 7895.00, Type.Shotgun);
		Weapons weapons9 = new Weapons("Kar98", "German ", 789563.01, Type.sniper);
		Weapons weapons10 = new Weapons("Crossbow", "Pubg", 7896.00, Type.Bowarrow);
		Weapons weapons11 = new Weapons("DP-28", "Russian", 456932.00, Type.Assault);
		Weapons weapons12 = new Weapons("Aruval ", "India", 486936.00, Type.Swords);
		Weapons weapons13 = new Weapons("Tulwar", "India", 78965.00, Type.Swords);
		Weapons weapons14 = new Weapons("QBZ", "Pubg", 78965.00, Type.Shotgun);
		Weapons weapons15 = new Weapons("M762", "Pubg", 45693.00, Type.Assault);
		Weapons weapons16 = new Weapons("Groza", "Pubg", 45693.00, Type.Assault);
		Weapons weapons17 = new Weapons("Flare Gun", "Pubg", 10023658.00, Type.Pistol);
		Weapons weapons18 = new Weapons("Insas Rifle", "United States", 789623.00, Type.Assault);
		Weapons weapons19 = new Weapons("IMI Galil", "Russian", 4862.00, Type.sniper);

		Collection<Weapons> weap = new LinkedList<Weapons>();
		weap.add(weapons19);		
		weap.add(weapons18);
		weap.add(weapons17);
		weap.add(weapons16);
		weap.add(weapons15);
		weap.add(weapons14);
		weap.add(weapons13);
		weap.add(weapons12);
		weap.add(weapons11);
		weap.add(weapons10);
		weap.add(weapons9);
		weap.add(weapons8);
		weap.add(weapons7);
		weap.add(weapons6);
		weap.add(weapons5);
		weap.add(weapons4);
		weap.add(weapons3);
		weap.add(weapons2);
		weap.add(weapons1);
		weap.add(weapons);
		
	//	Comparator<Weapons> comparator = (a1,a2)->Double.compare(a1.getPrice() , a2.getPrice());
		System.out.println("------------------------Weapons Price greater than 50000.00----------------------------"+"\n");
		weap
		.stream()		
		.filter(e->e.getPrice()>50000.00)
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));

		System.out.println("------------------------Weapons made by India are----------------------------"+"\n");

weap.stream().filter(a -> a.getMadeBy().contains("India")).forEach(e->System.out.println(e));

System.out.println("------------------------Weapons name in descending order----------------------------"+"\n");

weap.stream().sorted((n1,n2)->n2.getName().compareTo(n1.getName())).forEach(w->System.out.println(w));

System.out.println("------------------------Weapons sorted by price/ ascending order----------------------------"+"\n");
weap.stream().sorted((p1,p2)->Double.compare(p1.getPrice(), p2.getPrice())).forEach(a->System.out.println(a));

System.out.println("------------------------Weapons sorted by price/ descending order----------------------------"+"\n");
weap.stream().sorted((p1,p2)->Double.compare(p2.getPrice(), p1.getPrice())).forEach(a->System.out.println(a));

System.out.println("------------------------Weapons made by descending order----------------------------"+"\n");
weap.stream().sorted((q1,q2)->q2.getMadeBy().compareTo(q1.getMadeBy())).forEach(q->System.out.println(q));

System.out.println("------------------------Weapons made by ascending order----------------------------"+"\n");
weap.stream().sorted((q1,q2)->q1.getMadeBy().compareTo(q2.getMadeBy())).forEach(q->System.out.println(q));



System.out.println("------------------------Weapons madeby and name in descending order----------------------------"+"\n");
weap.stream().sorted((n1,n2)->n2.getName().compareTo(n1.getName())).forEach(a->System.out.println(a.getMadeBy()+ "\n"+a.getName()));


		
	}

}
