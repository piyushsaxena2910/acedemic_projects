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
@Table(name="navigator")
public class Navigator {
Navigator(){}

public Navigator(String navigator){
	this.navigator = navigator;
}

@Id
@GeneratedValue
@Column(name = "navigatorID", unique = true, nullable = false)
private int navigatorID;


@Column(name = "navigator")
private String navigator;

public int getNavigatorID() {
	return navigatorID;
}

public void setNavigatorID(int navigatorID) {
	this.navigatorID = navigatorID;
}

public String getNavigator() {
	return navigator;
}

public void setNavigator(String navigator) {
	this.navigator = navigator;
}

@Override
public String toString() {
	return navigator;
}
}
