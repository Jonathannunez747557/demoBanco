package com.bancoVirtual.demo.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Entity(name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    @Column(name = "clienteID")
    private Long clienteID;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name="email")
    private String email;

    @Column(name ="telefono")
    private String telefono;

    @Column(name="direccion")
    private String direccion;

}




