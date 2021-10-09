package com.worshop.hospital.service;

import com.worshop.hospital.entity.Consultation;
import com.worshop.hospital.entity.ConsultationDetail;
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
public interface ConsultationService {
    Consultation save(Consultation consultation);

    Consultation findId(Integer id);

    List<Consultation> findAll();

    Boolean delete(Integer id);
}
