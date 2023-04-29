package com.sanjuan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "pro_code")
	private String code;
	
	@Column(name = "pro_name")
	private String name;
	
	@Column(name = "pro_description")
	private String description;
	
	/* @ManyToOne
	@JoinColumn(name = "category_code")
	private Category category; */
	@Column(name = "category_code")
	private String category;
}
