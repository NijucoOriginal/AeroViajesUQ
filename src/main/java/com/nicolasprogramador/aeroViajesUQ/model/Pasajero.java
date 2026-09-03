package com.nicolasprogramador.aeroViajesUQ.model;


import com.nicolasprogramador.aeroViajesUQ.utils.ListaSimple;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pasajero extends Persona {

    private ListaSimple<Boleto> boletos; //Revisar tipo de dato
    private float billetera;
    private ListaSimple<Mascota> mascotas; //Revisar tipo de dato
}
