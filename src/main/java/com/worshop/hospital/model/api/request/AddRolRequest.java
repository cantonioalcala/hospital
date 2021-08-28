package com.worshop.hospital.model.api.request;

import java.io.Serializable;
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
public class AddRolRequest implements Serializable {
    private String description;
    private String name;
}
