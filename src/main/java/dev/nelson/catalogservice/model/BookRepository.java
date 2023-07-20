package dev.nelson.catalogservice.model;

import java.util.Optional;

import org.springframework.stereotype.Repository;

public interface BookRepository {
    Optional<Book> findByIsbn(String isbn);

    Iterable<Book> findAll();

    boolean existsByIsbn(String isbn);

    Book save(Book book);

    void deleteByIsbn(String isbn);
}
