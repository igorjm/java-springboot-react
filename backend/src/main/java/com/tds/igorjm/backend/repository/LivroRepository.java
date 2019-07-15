package com.tds.igorjm.backend.repository;

import com.tds.igorjm.backend.entity.Livro;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LivroRepository extends MongoRepository<Livro, Integer> {
}
