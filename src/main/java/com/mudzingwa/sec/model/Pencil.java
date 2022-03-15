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
@Table(name="pencil")
public class Pencil {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pid;
	@Column(name="title",nullable= false,length=100)
	private String title;
	@Column(name="author",nullable=false,length=100)
	private String author;
	@Column(name="description",nullable=false, length= 200)
	private String description;
	@Column(name="price",nullable=false)
	private Double price;
	@Column(name="createdate",nullable=false)
	private LocalDateTime dateCreated;

}
