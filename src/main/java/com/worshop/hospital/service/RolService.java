package com.worshop.hospital.service;

import com.worshop.hospital.entity.Rol;
import java.util.List;

/**
 * <p>
 * User: Cristhian
 * Date: 27/08/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
public interface RolService {
    Rol saveRol(Rol rol);

    Boolean deleteRol(Integer id);

    Rol findById(Integer id);

    List<Rol> findAll();
}
