package com.quizvocabulary.model.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Study {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Language studyLanguage;
	@ManyToOne
	private Language profileLanguage;
	@OneToOne
	private Board defaultBoard;

	public Study() {
	}

	public Study(Language studyLanguage, Language profileLanguage) {
		super();
		this.studyLanguage = studyLanguage;
		this.profileLanguage = profileLanguage;
		this.defaultBoard = new Board(studyLanguage.getName() + " Default", studyLanguage, profileLanguage);
	}

	public Language getStudyLanguage() {
		return studyLanguage;
	}

	public Language getProfileLanguage() {
		return profileLanguage;
	}

	public Board getDefaultBoard() {
		return defaultBoard;
	}

	public void setStudyLanguage(Language studyLanguage) {
		this.studyLanguage = studyLanguage;
	}

	public void setProfileLanguage(Language profileLanguage) {
		this.profileLanguage = profileLanguage;
	}

	public void setDefaultBoard(Board defaultBoard) {
		this.defaultBoard = defaultBoard;
	}
}
