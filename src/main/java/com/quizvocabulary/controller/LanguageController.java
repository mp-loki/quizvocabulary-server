package com.quizvocabulary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quizvocabulary.model.core.Language;
import com.quizvocabulary.service.LanguageService;

@RestController
public class LanguageController {
	
	@Autowired
	private LanguageService languageService;
	
	@RequestMapping(path="/api/languages", method=RequestMethod.GET)
	public Iterable<Language> getLanguages() {
		return languageService.getLanguages();
	}
}
