package com.worshop.hospital.repository;

import com.worshop.hospital.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * User: Cristhian
 * Date: 21/08/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
}
