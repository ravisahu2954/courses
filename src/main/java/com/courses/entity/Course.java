package com.courses.entity;

import javax.persistence.Entity;
//import javax.persistence.Table;
import javax.persistence.Id;

@Entity
//@Table(name = "courseD")
public class Course {
   
	   @Id
	   public int id;
	   public String cName;
	   public int price;
	   public Course()
	   {
		   
	   }
	public Course(int id, String cName, int price) {
		super();
		this.id = id;
		this.cName = cName;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", cName=" + cName + ", price=" + price + "]";
	}
	   
	   
	
	
}
