package com.techthinker.CAAndroid.Entity;


public class Relation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6622748992931108527L;
	private Integer relationId;
	private User userByUserId2;
	private User userByUserId1;

	public Relation() {
	}

	public Relation(User userByUserId2, User userByUserId1) {
		this.userByUserId2 = userByUserId2;
		this.userByUserId1 = userByUserId1;
	}

	public Integer getRelationId() {
		return this.relationId;
	}

	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}

	public User getUserByUserId2() {
		return this.userByUserId2;
	}

	public void setUserByUserId2(User userByUserId2) {
		this.userByUserId2 = userByUserId2;
	}

	public User getUserByUserId1() {
		return this.userByUserId1;
	}

	public void setUserByUserId1(User userByUserId1) {
		this.userByUserId1 = userByUserId1;
	}

}