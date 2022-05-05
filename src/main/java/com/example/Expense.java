package com.example;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Expense")
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long expanseId;
	
	@Column(nullable = false)
	private Date expanseDate;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private String location;
	
	@Column(nullable = false)
	private Long category;

	

	public Long getExpanseId() {
		return expanseId;
	}

	public void setExpanseId(Long expanseId) {
		this.expanseId = expanseId;
	}

	public Date getExpanseDate() {
		return expanseDate;
	}

	public void setExpanseDate(Date expanseDate) {
		this.expanseDate = expanseDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getCategory() {
		return category;
	}

	public void setCategory(Long category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Expense [expanseId=" + expanseId + ", expanseDate=" + expanseDate + ", description=" + description
				+ ", location=" + location + ", category=" + category + "]";
	}	

}
