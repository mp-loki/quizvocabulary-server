package com.quizvocabulary.model.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class VocabularyPair {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String logosA;
	@ManyToOne
	private Language logosALanguage;
	private String logosB;
	@ManyToOne
	private Language logosBLanguage;

	public VocabularyPair() {
	}

	public VocabularyPair(String logosA, Language logosALanguage, String logosB, Language logosBLanguage) {
		super();
		this.logosA = logosA;
		this.logosALanguage = logosALanguage;
		this.logosB = logosB;
		this.logosBLanguage = logosBLanguage;
	}

	public String getLogosA() {
		return logosA;
	}

	public Language getLogosALanguage() {
		return logosALanguage;
	}

	public String getLogosB() {
		return logosB;
	}

	public Language getLogosBLanguage() {
		return logosBLanguage;
	}

	@Override
	public String toString() {
		return "VocabularyPair [logosA=" + logosA + ", logosALanguage=" + logosALanguage.getCode() + ", logosB="
				+ logosB + ", logosBLanguage=" + logosBLanguage.getCode() + "]";
	}

}
