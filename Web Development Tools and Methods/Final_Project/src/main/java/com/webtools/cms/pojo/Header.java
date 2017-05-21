package com.webtools.cms.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="headers")
public class Header {
Header(){}

public Header(String header){
	this.header = header;
}


@Id
@GeneratedValue
@Column(name = "headerID", unique = true, nullable = false)
private int headerID;


@Column(name = "header")
private String header;

public int getHeaderID() {
	return headerID;
}

public void setHeaderID(int headerID) {
	this.headerID = headerID;
}



public String getHeader() {
	return header;
}

public void setHeader(String header) {
	this.header = header;
}

@Override
public String toString() {
	return header;
}

}
