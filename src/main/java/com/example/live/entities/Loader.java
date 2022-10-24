package com.example.live.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="loader")
@Setter
@Getter
@NoArgsConstructor
public class Loader {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="Loder_name",nullable=false,length=100)
	private String name;
	
	@Column(name ="Email",nullable=false,length=100)
	private String email;


}
