package com.nicolasprogramador.aeroViajesUQ.model;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Titulo {

    private String codigo;
    private String nombre;
    private LocalDate fechaExpedicion;
    private String descripcion;
}
