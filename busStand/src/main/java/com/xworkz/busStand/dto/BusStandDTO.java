package com.xworkz.busStand.dto;

import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@ToString

public class BusStandDTO {

	private int id;

	@NotBlank(message = "should be entred")
	private String bus_No;

	@Size(min = 3, max = 20, message = "The Bus depo should contain minum 3 and maximam 20")
	private String depo;

	@Size(min = 3, max = 20, message = "The Bus main_Stop should contain minum 3 and maximam 20")
	private String main_Stop;

	@Size(min = 3, max = 20, message = "The Bus last_Stop should contain minum 3 and maximam 20")
	private String last_Stop;

}
