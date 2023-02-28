package com.xworkz.busStand.dto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "bus_Stand")
@NoArgsConstructor
public class BusStandEntityDTO {

	@Id
	@Column(name = "bus_Id")
	private int id;

	@Column(name = "bus_No")
	private String bus_No;

	@Column(name = "bus_depo")
	private String depo;

	@Column(name = "bus_main_Stop")
	private String main_Stop;

	@Column(name = "bus_last_Stop")
	private String last_Stop;

}
