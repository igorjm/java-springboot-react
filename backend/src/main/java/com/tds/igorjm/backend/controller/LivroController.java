package com.tds.igorjm.backend.controller;

import com.tds.igorjm.backend.entity.Livro;
import com.tds.igorjm.backend.service.livro.LivroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Method to save livro in the db.
     * @param livros
     * @return
     */
    @PostMapping(value= "/create")
    public String create(@RequestBody List<Livro> livros) {
        logger.debug("Saving livros.");
        livroService.createLivro(livros);
        return "livro records created.";
    }

    /**
     * Method to fetch all livro from the db.
     * @return
     */
    @GetMapping(value= "/getAllLivros")
    public Collection<Livro> getAllLivros() {
        logger.debug("Getting all livros.");
        return livroService.getAllLivro();
    }

    /**
     * Method to fetch livro by id.
     * @param id
     * @return
     */
    @GetMapping(value= "/getById/{id}")
    public Optional<Livro> getById(@PathVariable(value= "id") int id) {
        logger.debug("Getting livro with id= {}.", id);
        return livroService.findLivroById(id);
    }

    /**
     * Method to update livro by id.
     * @param id
     * @param livro
     * @return
     */
    @PutMapping(value= "/update/{id}")
    public String update(@PathVariable(value= "id") int id, @RequestBody Livro livro) {
        logger.debug("Updating livro with id= {}.", id);
        livro.setId(id);
        livroService.updateLivro(livro);
        return "livro record for id= " + id + " updated.";
    }

    /**
     * Method to delete livro by id.
     * @param id
     * @return
     */
    @DeleteMapping(value= "/delete/{id}")
    public String delete(@PathVariable(value= "id") int id) {
        logger.debug("Deleting livro with id= {}.", id);
        livroService.deleteLivroById(id);
        return "livro record for id= " + id + " deleted.";
    }

    /**
     * Method to delete all livros from the db.
     * @return
     */
    @DeleteMapping(value= "/deleteAll")
    public String deleteAll() {
        logger.debug("Deleting all livros.");
        livroService.deleteAllLivros();
        return "All employee records deleted.";
    }

}
