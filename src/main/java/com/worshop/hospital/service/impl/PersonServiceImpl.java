package com.worshop.hospital.service.impl;

import com.worshop.hospital.entity.Person;
import com.worshop.hospital.repository.PersonRepository;
import com.worshop.hospital.service.PersonService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * User: Cristhian
 * Date: 8/10/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person findId(Integer id) {
        return personRepository.findById(id).orElse(new Person());
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Boolean delete(Integer id) {
        personRepository.delete(new Person(id));
        return null;
    }
}
