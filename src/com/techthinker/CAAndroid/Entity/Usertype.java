package com.techthinker.CAAndroid.Entity;

import java.util.HashSet;
import java.util.Set;


public class Usertype implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1215321765441684562L;
	private Integer usertypeId;
	private Integer usertypeName;
	private Set<User> users = new HashSet<User>(0);


	public Usertype() {
	}

	public Usertype(Integer usertypeName) {
		this.usertypeName = usertypeName;
	}

	public Usertype(Integer usertypeName, Set<User> users) {
		this.usertypeName = usertypeName;
		this.users = users;
	}

	public Integer getUsertypeId() {
		return this.usertypeId;
	}

	public void setUsertypeId(Integer usertypeId) {
		this.usertypeId = usertypeId;
	}

	public Integer getUsertypeName() {
		return this.usertypeName;
	}

	public void setUsertypeName(Integer usertypeName) {
		this.usertypeName = usertypeName;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}