package com.springValue.app.component;

import org.springframework.beans.factory.annotation.Value;

public class Season {	
	
		private String name;
		private String duration;
		private String startingMonth;

		public Season() {
			System.out.println("Creating Season using default const by Spring");
		}

		@Value("Winter")
		public void setName(String name) {
			this.name = name;
		}

		@Value("Nov to Feb")
		public void setDuration(String duration) {
			this.duration = duration;
		}

		@Value("November")
		public void setStartingMonth(String startingMonth) {
			this.startingMonth = startingMonth;
		}

		public String getName() {
			return name;
		}

		public String getDuration() {
			return duration;
		}

		public String getStartingMonth() {
			return startingMonth;
		}
	}

}
