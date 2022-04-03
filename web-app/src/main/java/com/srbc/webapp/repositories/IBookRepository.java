package com.srbc.webapp.repositories;

import com.srbc.webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author esorbaci
 */
public interface IBookRepository extends CrudRepository<Book, Long> {
}
