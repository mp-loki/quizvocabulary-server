package com.quizvocabulary.service;

import com.quizvocabulary.model.core.Language;

public interface LanguageService {
	
	Iterable<Language> getLanguages();
}
