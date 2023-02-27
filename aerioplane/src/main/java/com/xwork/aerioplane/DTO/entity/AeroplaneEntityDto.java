package com.xwork.aerioplane.DTO.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "aeroplane")
@Data
@NoArgsConstructor
public class AeroplaneEntityDto {

	@Id
	@Column(name = "aeo_id")
	private int id;

	@Column(name = "aeo_name")
	private String name;

	@Column(name = "aeo_country")
	private String country;

	@Column(name = "aeo_batchNo")
	private String batchNo;

}
