package com.github.freeism;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Martin
 * @since 2016. 12. 28.
 */
public interface WishJpaRepository extends CrudRepository<Wish, Long> {
}
