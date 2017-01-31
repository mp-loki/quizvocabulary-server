package com.quizvocabulary.model.quiz;

import java.util.List;

import com.quizvocabulary.model.core.VocabularyPair;

public class QuizQuestion {
	private final VocabularyPair question;
	private final List<VocabularyPair> options;

	public QuizQuestion(VocabularyPair question, List<VocabularyPair> options) {
		super();
		this.question = question;
		this.options = options;
	}

	public VocabularyPair getQuestion() {
		return question;
	}

	public List<VocabularyPair> getOptions() {
		return options;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("QuizQuestion [question=");
		sb.append(question.getLogosA());
		sb.append(", options=[");
		options.forEach(option -> sb.append(option.getLogosB()));
		sb.append("]]");
		return sb.toString();
	}

}
