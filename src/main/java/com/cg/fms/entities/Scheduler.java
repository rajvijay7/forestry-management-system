package com.cg.fms.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "Schdl_tbl")
public class Scheduler{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@NotNull
	private int id;
	
	@Column(name = "schdlname")
	@NotNull
	private String schedulerName;
	
	@Column(name = "scdlcontract")
	@NotNull
	private long schedulerContact;
	
	@Column(name = "trucknumber")
	@NotNull
	private String truckNumber;
	
}