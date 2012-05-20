package com.techthinker.CAAndroid.Entity;

import java.util.HashSet;
import java.util.Set;

public class Major implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6699038731655776667L;
	private Integer majorId;
	private College college;
	private String majorName;
	private String description;
	private String image;
	private Set<Campusnews> campusnewses = new HashSet<Campusnews>(0);
	private Set<User> users = new HashSet<User>(0);
	private Set<Grade> grades = new HashSet<Grade>(0);
	private Set<Chatroom> chatrooms = new HashSet<Chatroom>(0);

	public Major() {
	}

	public Major(College college, String majorName, String description) {
		this.college = college;
		this.majorName = majorName;
		this.description = description;
	}

	public Major(College college, String majorName, String description,
			String image, Set<Campusnews> campusnewses, Set<User> users,
			Set<Grade> grades, Set<Chatroom> chatrooms) {
		this.college = college;
		this.majorName = majorName;
		this.description = description;
		this.image = image;
		this.campusnewses = campusnewses;
		this.users = users;
		this.grades = grades;
		this.chatrooms = chatrooms;
	}

	public Integer getMajorId() {
		return this.majorId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	public College getCollege() {
		return this.college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public String getMajorName() {
		return this.majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
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

	public Set<Campusnews> getCampusnewses() {
		return this.campusnewses;
	}

	public void setCampusnewses(Set<Campusnews> campusnewses) {
		this.campusnewses = campusnewses;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Grade> getGrades() {
		return this.grades;
	}

	public void setGrades(Set<Grade> grades) {
		this.grades = grades;
	}

	public Set<Chatroom> getChatrooms() {
		return this.chatrooms;
	}

	public void setChatrooms(Set<Chatroom> chatrooms) {
		this.chatrooms = chatrooms;
	}

}