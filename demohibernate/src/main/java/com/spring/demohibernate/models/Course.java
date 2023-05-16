package com.spring.demohibernate.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Course {

	private String course;
	
	@Column(name = "is_completed")
	private boolean isCompleted;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

}
