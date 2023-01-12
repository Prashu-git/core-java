package org.newspringautowired.app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Ghost {

	@Value("Mohini")
	private String ghostName;
	@Value("5.5")
	private Float ghostHight;
	private Boolean isghostAlive;
	@Value("3")
	private Integer noOfGhost;
	@Value("Kalpana")
	private String ghostFriend;
	@Value("White")
	private String ghostDress;
	@Value("Black")
	private String ghostColour;
	private String ghostEducation;
	private Boolean isGostMarried;
	@Value("Shashi")
	private String ghostHusband;
	@Value("Dabaspete")
	private String gostPlace;
	private Boolean gostKnowJava;
	@Value("80")
	private Integer ghostSSLCScore;
	@Value("NotDisclosed")
	private String gostGender;
	private String ghostHouse;
	private Double ghostSalary;
	private String ghostBikeName;
	private String ghostCarName;
	private Boolean isGhostVeg;
	private Boolean isGhostNonVeg;

	@Autowired
	public Ghost(Boolean isghostAlive, @Qualifier("education") String ghostEducation, Boolean isGostMarried,
			Boolean gostKnowJava, @Qualifier("house") String ghostHouse, @Qualifier("salary") Double ghostSalary,
			@Qualifier("bike") String ghostBikeName, @Qualifier("car") String ghostCarName, Boolean isGhostVeg,
			Boolean isGhostNonVeg) {
		super();
		this.isghostAlive = isghostAlive;
		this.ghostEducation = ghostEducation;
		this.isGostMarried = isGostMarried;
		this.gostKnowJava = gostKnowJava;
		this.ghostHouse = ghostHouse;
		this.ghostSalary = ghostSalary;
		this.ghostBikeName = ghostBikeName;
		this.ghostCarName = ghostCarName;
		this.isGhostVeg = isGhostVeg;
		this.isGhostNonVeg = isGhostNonVeg;
	}

	@Override
	public String toString() {
		return "Ghost [ghostName=" + ghostName + ", ghostHight=" + ghostHight + ", isghostAlive=" + isghostAlive
				+ ", noOfGhost=" + noOfGhost + ", ghostFriend=" + ghostFriend + ", ghostDress=" + ghostDress
				+ ", ghostColour=" + ghostColour + ", ghostEducation=" + ghostEducation + ", isGostMarried="
				+ isGostMarried + ", ghostHusband=" + ghostHusband + ", gostPlace=" + gostPlace + ", gostKnowJava="
				+ gostKnowJava + ", ghostSSLCScore=" + ghostSSLCScore + ", gostGender=" + gostGender + ", ghostHouse="
				+ ghostHouse + ", ghostSalary=" + ghostSalary + ", ghostBikeName=" + ghostBikeName + ", ghostCarName="
				+ ghostCarName + ", isGhostVeg=" + isGhostVeg + ", isGhostNonVeg=" + isGhostNonVeg + "]";
	}

}
