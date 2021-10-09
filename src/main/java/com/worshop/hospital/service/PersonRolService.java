package com.worshop.hospital.service;

import com.worshop.hospital.entity.Consultation;
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
public interface PersonRolService {
    PersonRol save(PersonRol personRol);

    PersonRol findId(Integer id);

    List<PersonRol> findAll();

    Boolean delete(Integer id);
}
