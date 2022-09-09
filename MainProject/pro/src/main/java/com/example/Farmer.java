package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;


@Valid
@Entity
@Table(name="FARMER")
public class Farmer {
	@Column(name="FARMER_ID")
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    int farmerId;@NotNull (message = "Farmer name cannot be empty")
  @Size(min=8,max =12, message = "Farmer name should be atleast 8 chars and atmost 12 chars")
	@Column(name="NAME")
    String name;

    
   @Max(value=100, message="Max age cannot be more than 100")
    @Column(name="AGE")
    int age;
	@NotNull(message = "Select the gender")
  @Column(name="GENDER")
    String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getFarmerId() {
        return farmerId;
    }   
	
}
