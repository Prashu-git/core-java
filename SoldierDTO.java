package com.template.app.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO {

	@NonNull
	@NotNull
	@NotBlank
	@Size(min = 2, max = 20)
	private String name;

	@Min(value = 0, message = "Id must be greater than zero")
	@Max(10000)
	private int id;

	@NotNull
	@NotBlank
	@Size(min = 5, max = 30)
	private String rank;

	@NotNull
	@NotBlank
	@Size(min = 5, max = 40)
	private String batallion;

	@NotNull
	@NotBlank
	@Size(min = 3, max = 200)
	private String country;

}
