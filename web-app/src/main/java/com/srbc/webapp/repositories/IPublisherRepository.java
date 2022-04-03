package com.srbc.webapp.repositories;

import com.srbc.webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author esorbaci
 */
public interface IPublisherRepository extends CrudRepository<Publisher, Long> {
}
