package com.quizvocabulary.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizvocabulary.dal.LanguageRepository;
import com.quizvocabulary.model.core.Language;

@Service
public class LanguageServiceImpl implements LanguageService {

	@Autowired 
	private LanguageRepository languageRepository;
	// TODO: remove when switched to the real database
	@PostConstruct
	public void init() {
		languageRepository.save(new Language("English", "en"));
		languageRepository.save(new Language("Deutsch", "de"));
		languageRepository.save(new Language("Français", "fr"));
		languageRepository.save(new Language("日本語", "jp"));
		languageRepository.save(new Language("Italiano", "it"));
		languageRepository.save(new Language("Українська", "ua"));
	}
	
	@Override
	public Iterable<Language> getLanguages() {
		return languageRepository.findAll();
	}

}
