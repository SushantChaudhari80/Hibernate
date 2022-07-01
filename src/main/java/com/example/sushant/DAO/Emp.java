package com.example.sushant.DAO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Emp {
@Id
String id;
String name;
String address;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Emp(String id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public Emp() {
	super();
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
}

}
