package com.worshop.hospital.service;

import com.worshop.hospital.model.api.dto.AddRolDto;
import com.worshop.hospital.model.api.request.AddRolRequest;

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
    AddRolDto addRol(AddRolRequest addRolRequest);
}
