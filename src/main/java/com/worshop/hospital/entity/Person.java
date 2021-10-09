package com.worshop.hospital.entity;

import com.worshop.hospital.util.Constants;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.Entity;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <p>
 * User: Cristhian
 * Date: 21/08/2021
 * <p>
 * Created with IntelliJ IDEA
 *
 * @author Cristhian
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = Constants.SCHEMA_DB, name = "PERSONA")
public class Person implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSONA")
    private Integer personId;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "APELLIDO")
    private String lastName;
    @Column(name = "DNI")
    private String documentValue;
    @Column(name = "CELULAR")
    private String phoneNumber;
    @Column(name = "CORREO")
    private String email;
    @Column(name = "CONTRA")
    private String password;
    @ManyToOne
    @JoinColumn(name = "TIPO_PERSONA_ID", nullable = false)
    private PersonType personType;
    @Column(name = "ESTADO")
    private Integer disable;
    @Column(name = "FOTO")
    private String photo;

    public Person(Integer personId) {
        this.personId = personId;
    }
}
