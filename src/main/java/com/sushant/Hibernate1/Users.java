package com.sushant.Hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
public String id;
	public String name;
	public String address;
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
public Users(String id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public Users() {
	super();
}

}
