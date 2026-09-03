package com.nicolasprogramador.aeroViajesUQ.model;

import com.nicolasprogramador.aeroViajesUQ.utils.ListaSimple;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tripulante extends Persona {

    ListaSimple<Titulo> titulos; //Revisar tipo de dato
    Rol rol;

}
