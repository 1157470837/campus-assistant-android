package com.techthinker.CAAndroid.Entity;

import java.util.HashSet;
import java.util.Set;

public class Scenicspot implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3713213732354977512L;
	private Integer scenicspotId;
	private Geoinfo geoinfo;
	private String spotname;
	private String description;
	private Double rateMean;
	private Integer rateNum;
	private String image;
	private Set<Spotcomment> spotcomments = new HashSet<Spotcomment>(0);
	private Set<College> colleges = new HashSet<College>(0);

	public Scenicspot() {
	}

	public Scenicspot(String spotname, String description) {
		this.spotname = spotname;
		this.description = description;
	}

	public Scenicspot(Geoinfo geoinfo, String spotname, String description,
			Double rateMean, Integer rateNum, String image,
			Set<Spotcomment> spotcomments, Set<College> colleges) {
		this.geoinfo = geoinfo;
		this.spotname = spotname;
		this.description = description;
		this.rateMean = rateMean;
		this.rateNum = rateNum;
		this.image = image;
		this.spotcomments = spotcomments;
		this.colleges = colleges;
	}

	public Integer getScenicspotId() {
		return this.scenicspotId;
	}

	public void setScenicspotId(Integer scenicspotId) {
		this.scenicspotId = scenicspotId;
	}

	public Geoinfo getGeoinfo() {
		return this.geoinfo;
	}

	public void setGeoinfo(Geoinfo geoinfo) {
		this.geoinfo = geoinfo;
	}

	public String getSpotname() {
		return this.spotname;
	}

	public void setSpotname(String spotname) {
		this.spotname = spotname;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getRateMean() {
		return this.rateMean;
	}

	public void setRateMean(Double rateMean) {
		this.rateMean = rateMean;
	}

	public Integer getRateNum() {
		return this.rateNum;
	}

	public void setRateNum(Integer rateNum) {
		this.rateNum = rateNum;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<Spotcomment> getSpotcomments() {
		return this.spotcomments;
	}

	public void setSpotcomments(Set<Spotcomment> spotcomments) {
		this.spotcomments = spotcomments;
	}

	public Set<College> getColleges() {
		return this.colleges;
	}

	public void setColleges(Set<College> colleges) {
		this.colleges = colleges;
	}

}