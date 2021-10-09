package com.worshop.hospital.repository;

import com.worshop.hospital.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * User: Cristhian
 * Date: 27/08/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
}
