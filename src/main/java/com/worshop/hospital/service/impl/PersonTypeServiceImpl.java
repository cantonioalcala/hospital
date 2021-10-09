package com.worshop.hospital.service.impl;

import com.worshop.hospital.entity.PersonType;
import com.worshop.hospital.repository.PersonTypeRepository;
import com.worshop.hospital.service.PersonTypeService;
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
public class PersonTypeServiceImpl implements PersonTypeService {

    private final PersonTypeRepository personTypeRepository;

    @Override
    public PersonType save(PersonType personType) {
        return personTypeRepository.save(personType);
    }

    @Override
    public List<PersonType> findAll() {
        return personTypeRepository.findAll();
    }

    @Override
    public PersonType findById(Integer id) {
        return personTypeRepository.findById(id).orElse(new PersonType());
    }

    @Override
    public Boolean delete(Integer id) {
        personTypeRepository.delete(new PersonType(id,null,null));
        return Boolean.TRUE;
    }
}
