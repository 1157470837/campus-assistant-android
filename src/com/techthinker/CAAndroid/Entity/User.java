package com.techthinker.CAAndroid.Entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3827185628742460136L;
	private Integer userId;
	private Geoinfo geoinfo;
	private College college;
	private Major major;
	private Usertype usertype;
	private String username;
	private String password;
	private String sex;
	private String email;
	private String phone;
	private Integer entranceYear;
	private Timestamp birthday;
	private String description;
	private String image;
	private Set<Question> questions = new HashSet<Question>(0);
	private Set<Campusnews> campusnewses = new HashSet<Campusnews>(0);
	private Set<Spotcomment> spotcomments = new HashSet<Spotcomment>(0);
	private Set<Relation> relationsForUserId1 = new HashSet<Relation>(0);
	private Set<Message> messagesForTouserId = new HashSet<Message>(0);
	private Set<Relation> relationsForUserId2 = new HashSet<Relation>(0);
	private Set<Message> messagesForUserId = new HashSet<Message>(0);

	public User() {
	}

	public User(Usertype usertype, String username, String password,
			String sex, String email, Integer entranceYear) {
		this.usertype = usertype;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.email = email;
		this.entranceYear = entranceYear;
	}

	public User(Geoinfo geoinfo, College college, Major major,
			Usertype usertype, String username, String password, String sex,
			String email, String phone, Integer entranceYear,
			Timestamp birthday, String description, String image,
			Set<Question> questions, Set<Campusnews> campusnewses,
			Set<Spotcomment> spotcomments, Set<Relation> relationsForUserId1,
			Set<Message> messagesForTouserId,
			Set<Relation> relationsForUserId2, Set<Message> messagesForUserId) {
		this.geoinfo = geoinfo;
		this.college = college;
		this.major = major;
		this.usertype = usertype;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
		this.entranceYear = entranceYear;
		this.birthday = birthday;
		this.description = description;
		this.image = image;
		this.questions = questions;
		this.campusnewses = campusnewses;
		this.spotcomments = spotcomments;
		this.relationsForUserId1 = relationsForUserId1;
		this.messagesForTouserId = messagesForTouserId;
		this.relationsForUserId2 = relationsForUserId2;
		this.messagesForUserId = messagesForUserId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Geoinfo getGeoinfo() {
		return this.geoinfo;
	}

	public void setGeoinfo(Geoinfo geoinfo) {
		this.geoinfo = geoinfo;
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

	public Usertype getUsertype() {
		return this.usertype;
	}

	public void setUsertype(Usertype usertype) {
		this.usertype = usertype;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getEntranceYear() {
		return this.entranceYear;
	}

	public void setEntranceYear(Integer entranceYear) {
		this.entranceYear = entranceYear;
	}

	public Timestamp getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	public Set<Campusnews> getCampusnewses() {
		return this.campusnewses;
	}

	public void setCampusnewses(Set<Campusnews> campusnewses) {
		this.campusnewses = campusnewses;
	}

	public Set<Spotcomment> getSpotcomments() {
		return this.spotcomments;
	}

	public void setSpotcomments(Set<Spotcomment> spotcomments) {
		this.spotcomments = spotcomments;
	}

	public Set<Relation> getRelationsForUserId1() {
		return this.relationsForUserId1;
	}

	public void setRelationsForUserId1(Set<Relation> relationsForUserId1) {
		this.relationsForUserId1 = relationsForUserId1;
	}

	public Set<Message> getMessagesForTouserId() {
		return this.messagesForTouserId;
	}

	public void setMessagesForTouserId(Set<Message> messagesForTouserId) {
		this.messagesForTouserId = messagesForTouserId;
	}

	public Set<Relation> getRelationsForUserId2() {
		return this.relationsForUserId2;
	}

	public void setRelationsForUserId2(Set<Relation> relationsForUserId2) {
		this.relationsForUserId2 = relationsForUserId2;
	}

	public Set<Message> getMessagesForUserId() {
		return this.messagesForUserId;
	}

	public void setMessagesForUserId(Set<Message> messagesForUserId) {
		this.messagesForUserId = messagesForUserId;
	}

}