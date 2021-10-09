package com.worshop.hospital.service;

import com.worshop.hospital.entity.Person;
import com.worshop.hospital.entity.PersonRol;
import java.util.List;

/**
 * <p>
 * User: Cristhian
 * Date: 8/10/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
public interface PersonService {
    Person save(Person person);

    Person findId(Integer id);

    List<Person> findAll();

    Boolean delete(Integer id);
}
