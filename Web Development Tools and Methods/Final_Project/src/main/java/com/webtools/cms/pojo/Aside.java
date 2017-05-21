package com.webtools.cms.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="aside")
public class Aside {
Aside(){}

public Aside(String aside){
	this.aside = aside;
}

@Id
@GeneratedValue
@Column(name = "asideID", unique = true, nullable = false)
private int asideID;


@Column(name = "aside")
private String aside;

public int getAsideID() {
	return asideID;
}

public void setAsideID(int asideID) {
	this.asideID = asideID;
}



public String getAside() {
	return aside;
}

public void setAside(String aside) {
	this.aside = aside;
}

@Override
public String toString() {
	return aside;
}
}
