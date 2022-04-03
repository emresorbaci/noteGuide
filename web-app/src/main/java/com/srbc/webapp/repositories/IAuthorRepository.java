package com.srbc.webapp.repositories;

import com.srbc.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author esorbaci
 */
public interface IAuthorRepository extends CrudRepository<Author, Long> {
}
