package com.nicolasprogramador.aeroViajesUQ.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Mascota {

    private String identificacion;
    private float peso;
    private float costo;
}
