package com.vr.domain;
// Generated 2017-7-20 15:29:22 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonView;
import com.vr.view.MessageLeavingView;

/**
 * MessageLeaving generated by hbm2java
 */
public class MessageLeaving implements java.io.Serializable {
	@JsonView(MessageLeavingView.Tag.class)
	private Integer id;
	@JsonView(MessageLeavingView.Tag.class)
	private User user;
	@JsonView(MessageLeavingView.Tag.class)
	private String message;
	@JsonView(MessageLeavingView.Tag.class)
	private Integer upvote;
	@JsonView(MessageLeavingView.Tag.class)
	private String belong;
	@JsonView(MessageLeavingView.Tag.class)
	private String releasetime;
	@JsonView(MessageLeavingView.Tag.class)
	private Set messageResponses = new HashSet(0);
	@JsonView(MessageLeavingView.Tag.class)
	private int state;
	

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "MessageLeaving [id=" + id + ", user=" + user + ", message=" + message + ", upvote=" + upvote
				+ ", belong=" + belong + ", releasetime=" + releasetime + ", messageResponses=" + messageResponses
				+ "]";
	}

	public MessageLeaving() {
	}

	public MessageLeaving(User user, String message, Integer upvote, String belong, String releasetime,
			Set messageResponses) {
		this.user = user;
		this.message = message;
		this.upvote = upvote;
		this.belong = belong;
		this.releasetime = releasetime;
		this.messageResponses = messageResponses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getUpvote() {
		return this.upvote;
	}

	public void setUpvote(Integer upvote) {
		this.upvote = upvote;
	}

	public String getBelong() {
		return this.belong;
	}

	public void setBelong(String belong) {
		this.belong = belong;
	}

	public String getReleasetime() {
		return this.releasetime;
	}

	public void setReleasetime(String releasetime) {
		this.releasetime = releasetime;
	}

	public Set getMessageResponses() {
		return this.messageResponses;
	}

	public void setMessageResponses(Set messageResponses) {
		this.messageResponses = messageResponses;
	}

}