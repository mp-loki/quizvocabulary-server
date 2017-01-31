package com.quizvocabulary.dal;

import org.springframework.data.repository.CrudRepository;

import com.quizvocabulary.model.core.VocabularyPair;

public interface VocabularyPairRepository  extends CrudRepository<VocabularyPair, Long>{

}
