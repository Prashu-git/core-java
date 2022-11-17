package com.assignment;

import java.util.Scanner;

import com.assignment.socialMedia.SocialMedia;

public class SocialMediaTeaster {
	public static void main(String[] args) {
		SocialMedia socialMedia = new SocialMedia();
		socialMedia.providesInfo();
		
		
		SocialMedia socialMedia2 = new SocialMedia();
		socialMedia2.name = "Instagram";
		socialMedia2.displayInfo();
	}

}
