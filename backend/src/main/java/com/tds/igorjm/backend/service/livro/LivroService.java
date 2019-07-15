package com.tds.igorjm.backend.service.livro;

import com.tds.igorjm.backend.entity.Livro;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface LivroService {
    void createLivro(List<Livro> livro);

    Collection<Livro> getAllLivro();

    Optional<Livro> findLivroById(int id);

    void deleteLivroById(int id);

    void updateLivro(Livro emp);

    void deleteAllLivros();
}
