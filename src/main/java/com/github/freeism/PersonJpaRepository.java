package com.github.freeism;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Martin
 * @since 2016. 12. 28.
 */
@Repository
public interface PersonJpaRepository extends CrudRepository<Person, Long> {
}
