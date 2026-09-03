package com.nicolasprogramador.aeroViajesUQ.model;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public abstract class Persona {

    private String identificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private String paisOrigen;
    private String telefono;
    private String direccion;
    private String email;
}
