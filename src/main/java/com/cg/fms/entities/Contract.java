package com.cg.fms.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                                      
@NoArgsConstructor                        
@Entity                                   
@Table(name = "Contract_tbl")             
public class Contract {
	
	@Id                                
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contractnumber") 
	@NotNull
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
	
	
}