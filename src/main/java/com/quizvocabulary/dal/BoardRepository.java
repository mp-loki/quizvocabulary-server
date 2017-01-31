package com.quizvocabulary.dal;

import org.springframework.data.repository.CrudRepository;

import com.quizvocabulary.model.core.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{

}
