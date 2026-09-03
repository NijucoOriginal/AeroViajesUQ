package com.nicolasprogramador.aeroViajesUQ.model;


import lombok.*;

import java.time.Duration;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Vuelo {

    private String nombre;
    private String identificacion;
    private String origen;
    private String destino;
    private Duration duracion;
    private LocalTime horaSalida;
    private TipoVuelo tipoVuelo;

}
