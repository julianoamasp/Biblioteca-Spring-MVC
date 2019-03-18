package com.treinamento.praticando.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.treinamento.praticando.model.*;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByAutor(String autor);

    List<Livro> findByTitulo(String titulo);

    Livro findByIsbn(String isbn);

}
