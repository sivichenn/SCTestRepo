package com.test.domain;

import java.util.List;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//@Entity
public class Order implements Serializable{
	
	private Long id;
	private Date placedAt = new Date();
	
	private String deliveryName;
	
}