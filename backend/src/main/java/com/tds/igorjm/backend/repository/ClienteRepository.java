package com.tds.igorjm.backend.repository;

import com.tds.igorjm.backend.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
