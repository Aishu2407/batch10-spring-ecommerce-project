package com.te.ecommerce.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;
import javax.persistence.Column;

@Data
@Entity
@Table(name = "admin")

@XmlRootElement(name = "admin-info")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("admin_info")
public class Admin {

	@Id
	@Column
	private int id;

	@Column
	private String password;
}
