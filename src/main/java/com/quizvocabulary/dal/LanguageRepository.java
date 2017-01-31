package com.quizvocabulary.dal;

import org.springframework.data.repository.CrudRepository;

import com.quizvocabulary.model.core.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {

}
