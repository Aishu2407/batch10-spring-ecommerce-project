package com.te.ecommerce.bean;



	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import lombok.Data;

	@Data
	@Entity
	@Table(name = "admin")
	public class Admin {

		@Id
		@Column
		private int id;
		
		@Column
		private String password;
	}

