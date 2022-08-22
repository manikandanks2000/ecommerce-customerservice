package com.mani.ecommerce.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Customer {
	@Id
	@GeneratedValue
	private Long customerId;
	
	@NotNull
	@Size(min=2, message="Name should have atleast 2 characters")
	private String customerName;

	@NotNull
	@Size(min=2, message="customerEmail should have atleast 2 characters")
	private String customerEmail;


	@NotNull
	@Size(min=10, message="customerPhone should have atleast 10 characters")
	private Long customerPhone;

	
	
	
	public Customer(Long id, @NotNull @Size(min = 2, message = "Name should have atleast 2 characters") String name,
			@NotNull @Size(min = 2, message = "customerEmail should have atleast 2 characters") String email,
			@NotNull @Size(min = 10, message = "customerPhone should have atleast 10 characters") Long phone) {
		super();
		this.customerId = id;
		this.customerName = name;
		this.customerEmail = email;
		this.customerPhone = phone;
	}

	public String getEmail() {
		return customerEmail;
	}

	public void setEmail(String email) {
		this.customerEmail = email;
	}
	public Long getPhone() {
		return customerPhone;
	}

	public void setPhone(Long phone) {
		this.customerPhone = phone;
	}

	

	
	public Customer() {
		super();
	}


	public Long getId() {
		return customerId;
	}
	public void setId(Long id) {
		this.customerId = id;
	}
	public String getName() {
		return customerName;
	}
	public void setName(String name) {
		this.customerName = name;
	}

		
}
