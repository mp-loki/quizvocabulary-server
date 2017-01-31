package com.quizvocabulary.dal;

import org.springframework.data.repository.CrudRepository;

import com.quizvocabulary.model.core.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Long> {

}
