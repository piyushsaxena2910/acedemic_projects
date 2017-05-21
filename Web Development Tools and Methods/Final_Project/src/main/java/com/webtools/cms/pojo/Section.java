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
@Table(name="section")
public class Section {
Section(){}

public Section(String section){
	this.section = section;
}

@Id
@GeneratedValue
@Column(name = "sectionID", unique = true, nullable = false)
private int sectionID;


@Column(name = "section")
private String section;

public int getSectionID() {
	return sectionID;
}

public void setSectionID(int sectionID) {
	this.sectionID = sectionID;
}


public String getSection() {
	return section;
}

public void setSection(String section) {
	this.section = section;
}
@Override
public String toString() {
	return section;
}

}
