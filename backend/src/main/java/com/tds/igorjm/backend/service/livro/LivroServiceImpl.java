package com.tds.igorjm.backend.service.livro;

import com.tds.igorjm.backend.entity.Livro;
import com.tds.igorjm.backend.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class LivroServiceImpl implements LivroService {

    @Autowired
    private LivroRepository livroRepository;

    @Override
    public void createLivro(List<Livro> livro) {
        livroRepository.saveAll(livro);
    }

    @Override
    public Collection<Livro> getAllLivro() {
        return livroRepository.findAll();
    }

    @Override
    public Optional<Livro> findLivroById(int id) {
        return livroRepository.findById(id);
    }

    @Override
    public void deleteLivroById(int id) {
        livroRepository.deleteById(id);
    }

    @Override
    public void updateLivro(Livro emp) {
        livroRepository.save(emp);
    }

    @Override
    public void deleteAllLivros() {
        livroRepository.deleteAll();
    }

}
