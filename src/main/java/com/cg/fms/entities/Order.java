package com.cg.fms.entities;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                                      
@NoArgsConstructor                        
@Entity                                   
@Table(name = "Order_tbl")             
public class Order {
	
	@Id                                
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")   
	private Integer id;
	
	@Column(name = "deliveryplace")       
	@NotNull
	private String deliveryplace;
	
	@Column(name = "deliverydate")
	@NotNull
	private String deliverydate;
	
	@Column(name = "quantity")
	@NotNull
	private String quantity;
	
	
	//@OneToMany(targetEntity = Contract.class, cascade = CascadeType.ALL)
	//@JoinColumn(name = "occ_fk", referencedColumnName = "id")
	// List<Contract> contracts;
	
	//@OneToMany(targetEntity = Scheduler.class, cascade = CascadeType.ALL)
	//@JoinColumn(name = "cc_fk", referencedColumnName = "id")
	//private List<Scheduler> schedulers;
	
	//@OneToMany(targetEntity = Customer.class, cascade = CascadeType.ALL)
	//@JoinColumn(name = "oc_fk", referencedColumnName = "id")
	//private List<Customer> customers;

	
}