package org.newspringautowired.app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Engine {

	private String enginName;
	private String enginType;
	@Value("KA02AC3456")
	private String no;
	@Value("4.1")
	private Double version;
	private String company;
	private String stroke;

	@Autowired
	public Engine(@Qualifier("enginName") String enginName, @Qualifier("enginType") String enginType,
			@Qualifier("enginCompany") String company) {
		super();
		this.enginName = enginName;
		this.enginType = enginType;
		this.company = company;
	}

	@Autowired
	@Qualifier("stroke")
	public void setEstroke(String stroke) {
		this.stroke = stroke;
	}

	@Override
	public String toString() {
		return "Engine [enginName=" + enginName + ", enginType=" + enginType + ", no=" + no + ", version=" + version
				+ ", company=" + company + ", stroke=" + stroke + "]";
	}

}
