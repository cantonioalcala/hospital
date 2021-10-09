package com.worshop.hospital.service;

import com.worshop.hospital.entity.PersonType;
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
public interface PersonTypeService {
    PersonType save(PersonType personType);

    List<PersonType> findAll();

    PersonType findById(Integer id);

    Boolean delete(Integer id);
}
