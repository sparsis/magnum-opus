package com.magnumopus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exercises")
public class Exercise {
	@Id
	@GeneratedValue
	private Long id;
	
	private String question;
	
	@Column(name = "alternative_possible_1")
	private String alternativePossible1;
	
	@Column(name = "alternative_possible_2")
	private String alternativePossible2;
	
	@Column(name = "alternative_possible_3")
	private String alternativePossible3;
	
	@Column(name = "alternative_possible_4")
	private String alternativePossible4;
	
	@Column(name = "alternative_possible_5")
	private String alternativePossible5;
	
	@Column(name = "correct_alternative")
	private String correctAlternative;

	// Getters e Setters
	
	public Long getId() {
		return id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAlternativePossible1() {
		return alternativePossible1;
	}

	public void setAlternativePossible1(String alternativePossible1) {
		this.alternativePossible1 = alternativePossible1;
	}

	public String getAlternativePossible2() {
		return alternativePossible2;
	}

	public void setAlternativePossible2(String alternativePossible2) {
		this.alternativePossible2 = alternativePossible2;
	}

	public String getAlternativePossible3() {
		return alternativePossible3;
	}

	public void setAlternativePossible3(String alternativePossible3) {
		this.alternativePossible3 = alternativePossible3;
	}

	public String getAlternativePossible4() {
		return alternativePossible4;
	}

	public void setAlternativePossible4(String alternativePossible4) {
		this.alternativePossible4 = alternativePossible4;
	}

	public String getAlternativePossible5() {
		return alternativePossible5;
	}

	public void setAlternativePossible5(String alternativePossible5) {
		this.alternativePossible5 = alternativePossible5;
	}

	public String getCorrectAlternative() {
		return correctAlternative;
	}

	public void setCorrectAlternative(String correctAlternative) {
		this.correctAlternative = correctAlternative;
	}
}
