package com.worshop.hospital.repository;

import com.worshop.hospital.entity.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>
 * User: Cristhian
 * Date: 8/10/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
public interface ConsultationRepository extends JpaRepository<Consultation,Integer> {
}
