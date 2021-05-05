package com.te.ecommerce.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;




@XmlRootElement(name="Item-info")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("item_info")

@Data
@Entity
@Table(name = "items")
public class Item {

	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int quantity;
	
	@Column
	private double price;
}