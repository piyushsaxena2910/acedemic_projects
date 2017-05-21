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
@Table(name="article")
public class Article {

	public Article(){}
	
	public Article(String article){
		this.article = article;
	}
	
	@Id
	@GeneratedValue
	@Column(name = "articleID", unique = true, nullable = false)
	private int articleID;
	
	
	@Column(name = "article")
	private String article;

	public int getArticleID() {
		return articleID;
	}

	public void setArticleID(int articleID) {
		this.articleID = articleID;
	}

	

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return article;
	}
	
	
}
