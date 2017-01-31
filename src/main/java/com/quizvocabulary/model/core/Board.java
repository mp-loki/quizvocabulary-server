package com.quizvocabulary.model.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	@ManyToOne
	private Language studyLanguage;
	@ManyToOne
	private Language profileLanguage;

	public Board() {
	}

	public Board(String name, Language studyLanguage, Language profileLanguage) {
		this.name = name;
		this.studyLanguage = studyLanguage;
		this.profileLanguage = profileLanguage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Language getStudyLanguage() {
		return studyLanguage;
	}

	public void setStudyLanguage(Language studyLanguage) {
		this.studyLanguage = studyLanguage;
	}

	public Language getProfileLanguage() {
		return profileLanguage;
	}

	public void setProfileLanguage(Language profileLanguage) {
		this.profileLanguage = profileLanguage;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", name=" + name + ", studyLanguage=" + studyLanguage.getCode()
				+ ", profileLanguage=" + profileLanguage.getCode() + "]";
	}

}
