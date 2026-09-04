package com.nicolasprogramador.aeroViajesUQ.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Silla {

    private String nombreAsignado;
    private Clase clase;
}
