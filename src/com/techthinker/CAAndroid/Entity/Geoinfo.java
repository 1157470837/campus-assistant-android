package com.techthinker.CAAndroid.Entity;

import java.util.HashSet;
import java.util.Set;

public class Geoinfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8071657309774704295L;
	private Integer geoinfoId;
	private Double longtitude1;
	private Double longtitude2;
	private Double longtitude3;
	private Double longtitude4;
	private Double latitude1;
	private Double latitude2;
	private Double latitude3;
	private Double latitude4;
	private Boolean availabe;
	private Set<Scenicspot> scenicspots = new HashSet<Scenicspot>(0);
	private Set<User> users = new HashSet<User>(0);

	public Geoinfo() {
	}

	public Geoinfo(Double longtitude1, Double longtitude2, Double longtitude3,
			Double longtitude4, Double latitude1, Double latitude2,
			Double latitude3, Double latitude4, Boolean availabe) {
		this.longtitude1 = longtitude1;
		this.longtitude2 = longtitude2;
		this.longtitude3 = longtitude3;
		this.longtitude4 = longtitude4;
		this.latitude1 = latitude1;
		this.latitude2 = latitude2;
		this.latitude3 = latitude3;
		this.latitude4 = latitude4;
		this.availabe = availabe;
	}

	public Geoinfo(Double longtitude1, Double longtitude2, Double longtitude3,
			Double longtitude4, Double latitude1, Double latitude2,
			Double latitude3, Double latitude4, Boolean availabe,
			Set<Scenicspot> scenicspots, Set<User> users) {
		this.longtitude1 = longtitude1;
		this.longtitude2 = longtitude2;
		this.longtitude3 = longtitude3;
		this.longtitude4 = longtitude4;
		this.latitude1 = latitude1;
		this.latitude2 = latitude2;
		this.latitude3 = latitude3;
		this.latitude4 = latitude4;
		this.availabe = availabe;
		this.scenicspots = scenicspots;
		this.users = users;
	}

	public Integer getGeoinfoId() {
		return this.geoinfoId;
	}

	public void setGeoinfoId(Integer geoinfoId) {
		this.geoinfoId = geoinfoId;
	}

	public Double getLongtitude1() {
		return this.longtitude1;
	}

	public void setLongtitude1(Double longtitude1) {
		this.longtitude1 = longtitude1;
	}

	public Double getLongtitude2() {
		return this.longtitude2;
	}

	public void setLongtitude2(Double longtitude2) {
		this.longtitude2 = longtitude2;
	}

	public Double getLongtitude3() {
		return this.longtitude3;
	}

	public void setLongtitude3(Double longtitude3) {
		this.longtitude3 = longtitude3;
	}

	public Double getLongtitude4() {
		return this.longtitude4;
	}

	public void setLongtitude4(Double longtitude4) {
		this.longtitude4 = longtitude4;
	}

	public Double getLatitude1() {
		return this.latitude1;
	}

	public void setLatitude1(Double latitude1) {
		this.latitude1 = latitude1;
	}

	public Double getLatitude2() {
		return this.latitude2;
	}

	public void setLatitude2(Double latitude2) {
		this.latitude2 = latitude2;
	}

	public Double getLatitude3() {
		return this.latitude3;
	}

	public void setLatitude3(Double latitude3) {
		this.latitude3 = latitude3;
	}

	public Double getLatitude4() {
		return this.latitude4;
	}

	public void setLatitude4(Double latitude4) {
		this.latitude4 = latitude4;
	}

	public Boolean getAvailabe() {
		return this.availabe;
	}

	public void setAvailabe(Boolean availabe) {
		this.availabe = availabe;
	}

	public Set<Scenicspot> getScenicspots() {
		return this.scenicspots;
	}

	public void setScenicspots(Set<Scenicspot> scenicspots) {
		this.scenicspots = scenicspots;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}