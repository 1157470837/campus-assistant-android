package com.techthinker.CAAndroid.Entity;

import java.sql.Timestamp;

public class Campusnews implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5225247238218099528L;
	private Integer campusnewId;
	private User user;
	private College college;
	private Major major;
	private Integer newstype;
	private String content;
	private Timestamp pubdate;
	private Integer level;

	public Campusnews() {
	}

	public Campusnews(College college, Major major, Integer newstype,
			String content, Timestamp pubdate, Integer level) {
		this.college = college;
		this.major = major;
		this.newstype = newstype;
		this.content = content;
		this.pubdate = pubdate;
		this.level = level;
	}

	public Campusnews(User user, College college, Major major,
			Integer newstype, String content, Timestamp pubdate, Integer level) {
		this.user = user;
		this.college = college;
		this.major = major;
		this.newstype = newstype;
		this.content = content;
		this.pubdate = pubdate;
		this.level = level;
	}

	public Integer getCampusnewId() {
		return this.campusnewId;
	}

	public void setCampusnewId(Integer campusnewId) {
		this.campusnewId = campusnewId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public College getCollege() {
		return this.college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Major getMajor() {
		return this.major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Integer getNewstype() {
		return this.newstype;
	}

	public void setNewstype(Integer newstype) {
		this.newstype = newstype;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getPubdate() {
		return this.pubdate;
	}

	public void setPubdate(Timestamp pubdate) {
		this.pubdate = pubdate;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

}