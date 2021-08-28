package com.worshop.hospital.model.api.dto;

import java.io.Serializable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 * User: Cristhian
 * Date: 28/08/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
@Setter
@Getter
@ToString
@Builder
public class AddRolDto implements Serializable {
    private Integer rolId;
    private String description;
    private String name;
}
