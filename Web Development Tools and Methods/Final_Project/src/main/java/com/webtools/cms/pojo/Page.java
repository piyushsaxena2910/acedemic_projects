package com.webtools.cms.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

@Entity
@Table(name="page")
public class Page {
	
	@Id @GeneratedValue(strategy = IDENTITY)
	@Column(name="pageID", unique = true, nullable = false)
	private int pageID;
	
	@Column(name="pageName",unique=true)
	private String pageName;

	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="header")
	private Header header;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="navigator")
	private Navigator navigator;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="section")
	private Section section;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="article")
	private Article article;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="aside")
	private Aside aside;

	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="footer")
	private Footer footer;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="applicationID")
	private Application application;
	
	@Column(name="createdOn")
	String createdOn;
	
	public Page(){
	}
	
	public Page(String pageName){
		this.pageName = pageName;
	}
	
	public void setApplication(Application application) {
		this.application = application;
	}


	public int getPageID() {
		return pageID;
	}


	public void setPageID(int pageID) {
		this.pageID = pageID;
	}


	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public Navigator getNavigator() {
		return navigator;
	}
	public void setNavigator(Navigator navigator) {
		this.navigator = navigator;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Aside getAside() {
		return aside;
	}
	public void setAside(Aside aside) {
		this.aside = aside;
	}
	public Footer getFooter() {
		return footer;
	}
	public void setFooter(Footer footer) {
		this.footer = footer;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplicationID(Application application) {
		this.application = application;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	@Override
	public String toString() {
		return pageName;
	}
}
