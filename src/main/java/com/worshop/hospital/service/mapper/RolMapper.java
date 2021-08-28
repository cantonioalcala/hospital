package com.worshop.hospital.service.mapper;

import com.worshop.hospital.entity.Rol;
import com.worshop.hospital.model.api.dto.AddRolDto;
import com.worshop.hospital.model.api.request.AddRolRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * <p>
 * User: Cristhian
 * Date: 28/08/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
@Mapper(componentModel = "spring")
public interface RolMapper {
    AddRolDto convertToAddRolDto(Rol rol);
    Rol convertToRol(AddRolRequest addRolRequest);
}
