package com.techthinker.CAAndroid.Entity;

import java.sql.Timestamp;

public class Spotcomment implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3328050319539141999L;
	private Integer spotcommentId;
	private User user;
	private Scenicspot scenicspot;
	private String content;
	private Timestamp pubdate;
	private Integer rating;
	private String impression;

	public Spotcomment() {
	}

	public Spotcomment(Scenicspot scenicspot, String content,
			Timestamp pubdate, Integer rating) {
		this.scenicspot = scenicspot;
		this.content = content;
		this.pubdate = pubdate;
		this.rating = rating;
	}

	public Spotcomment(User user, Scenicspot scenicspot, String content,
			Timestamp pubdate, Integer rating, String impression) {
		this.user = user;
		this.scenicspot = scenicspot;
		this.content = content;
		this.pubdate = pubdate;
		this.rating = rating;
		this.impression = impression;
	}

	public Integer getSpotcommentId() {
		return this.spotcommentId;
	}

	public void setSpotcommentId(Integer spotcommentId) {
		this.spotcommentId = spotcommentId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Scenicspot getScenicspot() {
		return this.scenicspot;
	}

	public void setScenicspot(Scenicspot scenicspot) {
		this.scenicspot = scenicspot;
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

	public Integer getRating() {
		return this.rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getImpression() {
		return this.impression;
	}

	public void setImpression(String impression) {
		this.impression = impression;
	}

}