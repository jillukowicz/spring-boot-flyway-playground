package com.jillukowicz.spring.boot.flyway;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * @author jillukowicz
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long>
{
}
