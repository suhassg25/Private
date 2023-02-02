package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Hospital {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Branches> branches;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Branches> getBranches() {
		return branches;
	}
	public void setBranches(List<Branches> branches) {
		this.branches = branches;
	}
	@Override
	public String toString() {
		return "  id=" + id + ", name=" + name +"\n" + branches;
	}
	
	
}
