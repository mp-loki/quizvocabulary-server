package com.quizvocabulary.dal;

import org.springframework.data.repository.CrudRepository;

import com.quizvocabulary.model.core.Study;

public interface StudyRepository extends CrudRepository<Study, Long>{

}
