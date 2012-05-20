package com.techthinker.CAAndroid.Entity;


public class Question implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6514564222109253769L;
	private Integer questionId;
	private User user;
	private String content;
	private String answer;
	private Boolean checked;

	public Question() {
	}

	public Question(String content, String answer, Boolean checked) {
		this.content = content;
		this.answer = answer;
		this.checked = checked;
	}

	public Question(User user, String content, String answer, Boolean checked) {
		this.user = user;
		this.content = content;
		this.answer = answer;
		this.checked = checked;
	}

	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Boolean getChecked() {
		return this.checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

}