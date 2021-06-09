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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Customer_tbl")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "password")
	@NotNull
	@Size(min = 6, message = " Password should have mininum 2 characters!!")
	private String Password;
	@Column(name = "name")
	@NotNull
	@Size(min = 2, message = "Name should have mininum 2 characters!!")
	private String Name;
	@Column(name = "email")
	@Email(message = "Enter a valid email address!!")
	private String email;
	private String address;
	@Column(name = "town")
//	@Email(message = "Enter a valid town!!")
	private String Town;
	@Column(name = "postal_code")
	@NotNull
//	@Size(min=6, message="Postal code should be of six numerical numbers")
	private long PostalCode;
	@Column(name = "contact_number")
//	@Pattern(regexp = "[9-7]{9}")
	private long Contact;

	/*@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk", referencedColumnName = "id")
	private List<Product> products;*/

}