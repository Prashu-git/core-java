package com.assignment;

import com.assignment.wildLife.WildLife;

public class WildLifeTester {
	public static void main(String[] args) {
		WildLife wildLife = new WildLife();
		wildLife.wild();
		
		
		WildLife wildLife2 = new WildLife();
		wildLife2.name = "Bundipur National Resiover";
		wildLife2.displyInfo();
	}

}
