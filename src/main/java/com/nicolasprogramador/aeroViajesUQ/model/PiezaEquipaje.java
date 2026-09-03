package com.nicolasprogramador.aeroViajesUQ.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PiezaEquipaje {

    private String identificacion;
    private float alto;
    private float largo;
    private float ancho;
    private float peso;
    private boolean esEquipajeMano;
}
