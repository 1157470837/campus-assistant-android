package com.techthinker.CAAndroid.Entity;

import java.util.HashSet;
import java.util.Set;

public class Grade implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 170217159775932957L;
	private Integer gradeId;
	private College college;
	private Major major;
	private String gradeName;
	private String description;
	private String image;
	private Set<Chatroom> chatrooms = new HashSet<Chatroom>(0);

	public Grade() {
	}

	public Grade(College college, Major major, String gradeName,
			String description) {
		this.college = college;
		this.major = major;
		this.gradeName = gradeName;
		this.description = description;
	}

	public Grade(College college, Major major, String gradeName,
			String description, String image, Set<Chatroom> chatrooms) {
		this.college = college;
		this.major = major;
		this.gradeName = gradeName;
		this.description = description;
		this.image = image;
		this.chatrooms = chatrooms;
	}

	public Integer getGradeId() {
		return this.gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
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

	public String getGradeName() {
		return this.gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
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

	public Set<Chatroom> getChatrooms() {
		return this.chatrooms;
	}

	public void setChatrooms(Set<Chatroom> chatrooms) {
		this.chatrooms = chatrooms;
	}

}