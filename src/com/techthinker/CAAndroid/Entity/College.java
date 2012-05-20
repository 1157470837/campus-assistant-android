package com.techthinker.CAAndroid.Entity;

import java.util.HashSet;
import java.util.Set;

public class College implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2213642395027306114L;
	private Integer collegeId;
	private Scenicspot scenicspot;
	private String collegeName;
	private String description;
	private Set<User> users = new HashSet<User>(0);
	private Set<Campusnews> campusnewses = new HashSet<Campusnews>(0);
	private Set<Grade> grades = new HashSet<Grade>(0);
	private Set<Chatroom> chatrooms = new HashSet<Chatroom>(0);
	private Set<Major> majors = new HashSet<Major>(0);

	public College() {
	}

	public College(Scenicspot scenicspot, String collegeName, String description) {
		this.scenicspot = scenicspot;
		this.collegeName = collegeName;
		this.description = description;
	}

	public College(Scenicspot scenicspot, String collegeName,
			String description, Set<User> users, Set<Campusnews> campusnewses,
			Set<Grade> grades, Set<Chatroom> chatrooms, Set<Major> majors) {
		this.scenicspot = scenicspot;
		this.collegeName = collegeName;
		this.description = description;
		this.users = users;
		this.campusnewses = campusnewses;
		this.grades = grades;
		this.chatrooms = chatrooms;
		this.majors = majors;
	}

	public Integer getCollegeId() {
		return this.collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public Scenicspot getScenicspot() {
		return this.scenicspot;
	}

	public void setScenicspot(Scenicspot scenicspot) {
		this.scenicspot = scenicspot;
	}

	public String getCollegeName() {
		return this.collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Campusnews> getCampusnewses() {
		return this.campusnewses;
	}

	public void setCampusnewses(Set<Campusnews> campusnewses) {
		this.campusnewses = campusnewses;
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

	public Set<Major> getMajors() {
		return this.majors;
	}

	public void setMajors(Set<Major> majors) {
		this.majors = majors;
	}

}