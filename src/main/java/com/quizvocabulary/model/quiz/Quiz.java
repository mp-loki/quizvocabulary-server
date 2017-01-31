package com.quizvocabulary.model.quiz;

import java.util.List;

import com.quizvocabulary.model.core.VocabularyPair;

public class Quiz {

	private List<VocabularyPair> questions;
	private List<VocabularyPair> correct;
	private List<VocabularyPair> incorrect;
	
	public List<VocabularyPair> getQuestions() {
		return questions;
	}
	public void setQuestions(List<VocabularyPair> questions) {
		this.questions = questions;
	}
	public List<VocabularyPair> getCorrect() {
		return correct;
	}
	public void setCorrect(List<VocabularyPair> correct) {
		this.correct = correct;
	}
	public List<VocabularyPair> getIncorrect() {
		return incorrect;
	}
	public void setIncorrect(List<VocabularyPair> incorrect) {
		this.incorrect = incorrect;
	}
	
	
}
