package com.worshop.hospital.service.impl;

import com.worshop.hospital.entity.PersonRol;
import com.worshop.hospital.repository.PersonRolRepository;
import com.worshop.hospital.service.PersonRolService;
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
public class PersonRolServiceImpl implements PersonRolService {

    private final PersonRolRepository personRolRepository;

    @Override
    public PersonRol save(PersonRol personRol) {
        return personRolRepository.save(personRol);
    }

    @Override
    public PersonRol findId(Integer id) {
        return personRolRepository.findById(id).orElse(new PersonRol());
    }

    @Override
    public List<PersonRol> findAll() {
        return personRolRepository.findAll();
    }

    @Override
    public Boolean delete(Integer id) {
        personRolRepository.delete(new PersonRol(id,null,null));
        return Boolean.TRUE;
    }
}
