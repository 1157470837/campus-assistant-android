package com.techthinker.CAAndroid.Entity;

import java.sql.Timestamp;

public class Message implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8724105688894372911L;
	private Integer messageId;
	private User userByUserId;
	private User userByTouserId;
	private Chatroom chatroom;
	private String content;
	private Timestamp pubdate;
	private Integer totype;

	public Message() {
	}

	public Message(User userByUserId, User userByTouserId, Chatroom chatroom,
			String content, Timestamp pubdate, Integer totype) {
		this.userByUserId = userByUserId;
		this.userByTouserId = userByTouserId;
		this.chatroom = chatroom;
		this.content = content;
		this.pubdate = pubdate;
		this.totype = totype;
	}

	public Integer getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public User getUserByUserId() {
		return this.userByUserId;
	}

	public void setUserByUserId(User userByUserId) {
		this.userByUserId = userByUserId;
	}

	public User getUserByTouserId() {
		return this.userByTouserId;
	}

	public void setUserByTouserId(User userByTouserId) {
		this.userByTouserId = userByTouserId;
	}

	public Chatroom getChatroom() {
		return this.chatroom;
	}

	public void setChatroom(Chatroom chatroom) {
		this.chatroom = chatroom;
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

	public Integer getTotype() {
		return this.totype;
	}

	public void setTotype(Integer totype) {
		this.totype = totype;
	}

}