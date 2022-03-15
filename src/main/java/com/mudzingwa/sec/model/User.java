package com.mudzingwa.sec.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user")

public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bid;
	
	@Column(name="fname",unique=true,nullable=false)
	private String fname;
	
	
	@Column(name="username",unique=true,nullable=false,length=100)
	private String username;
	
	
	@Column(name="password", nullable=false, length=100)
	private String password;
	
	
	@Column(name="create_Time",nullable=false,length=100)
	private LocalDateTime createTime;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="role",nullable=false)
	private Role role;

}
