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
@Table(name="footer")
public class Footer {
Footer(){}

public Footer(String footer){
	this.footer = footer;
}

@Id
@GeneratedValue
@Column(name = "footerID", unique = true, nullable = false)
private int footerID;


@Column(name = "footer")
private String footer;

public int getFooterID() {
	return footerID;
}

public void setFooterID(int footerID) {
	this.footerID = footerID;
}



public String getFooter() {
	return footer;
}

public void setFooter(String footer) {
	this.footer = footer;
}

@Override
public String toString() {
	return footer;
}

}
