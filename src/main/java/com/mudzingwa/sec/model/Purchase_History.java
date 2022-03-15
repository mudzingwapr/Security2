package com.mudzingwa.sec.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name="purchase_history")
public class Purchase_History {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pid",nullable=false)
	private Integer pid;
	
	
	@Column(name="username",nullable =false)
	private String username;
	
	
	@Column(name="pencilid",nullable=false)
	private String pencilid;
	
	@Column(name="price",nullable=false)
	private Double price;
	
	@Column(name="date",nullable=false)
	private LocalDateTime dateCreated;

}
