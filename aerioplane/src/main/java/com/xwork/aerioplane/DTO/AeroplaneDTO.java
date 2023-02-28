package com.xwork.aerioplane.DTO;

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
public class AeroplaneDTO {

	private int id;

	@Size( min = 2,max = 30, message = "The name size should be greater than 3 and lesser than 25")
	private String name;
	
	@NotBlank(message = "country should be selected")
	private String country;
	
	@NotBlank(message = "batchNo should be selected")
	private String batchNo;

}
