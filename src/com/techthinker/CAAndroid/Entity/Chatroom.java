package com.techthinker.CAAndroid.Entity;

import java.util.HashSet;
import java.util.Set;

public class Chatroom implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6158047101968137549L;
	private Integer chatroomId;
	private Grade grade;
	private College college;
	private Major major;
	private String chatroomName;
	private Integer parentroomId;
	private String image;
	private Integer level;
	private Set<Message> messages = new HashSet<Message>(0);

	public Chatroom() {
	}

	public Chatroom(Grade grade, College college, Major major,
			String chatroomName, Integer parentroomId, Integer level) {
		this.grade = grade;
		this.college = college;
		this.major = major;
		this.chatroomName = chatroomName;
		this.parentroomId = parentroomId;
		this.level = level;
	}

	public Chatroom(Grade grade, College college, Major major,
			String chatroomName, Integer parentroomId, String image,
			Integer level, Set<Message> messages) {
		this.grade = grade;
		this.college = college;
		this.major = major;
		this.chatroomName = chatroomName;
		this.parentroomId = parentroomId;
		this.image = image;
		this.level = level;
		this.messages = messages;
	}

	public Integer getChatroomId() {
		return this.chatroomId;
	}

	public void setChatroomId(Integer chatroomId) {
		this.chatroomId = chatroomId;
	}

	public Grade getGrade() {
		return this.grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
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

	public String getChatroomName() {
		return this.chatroomName;
	}

	public void setChatroomName(String chatroomName) {
		this.chatroomName = chatroomName;
	}

	public Integer getParentroomId() {
		return this.parentroomId;
	}

	public void setParentroomId(Integer parentroomId) {
		this.parentroomId = parentroomId;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

}