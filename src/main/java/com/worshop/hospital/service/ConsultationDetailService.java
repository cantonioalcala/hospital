package com.worshop.hospital.service;

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
public interface ConsultationDetailService {
    ConsultationDetail save(ConsultationDetail consultationDetail);

    ConsultationDetail findId(Integer id);

    List<ConsultationDetail> findAll();

    Boolean delete(Integer id);
}
