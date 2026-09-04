package com.nicolasprogramador.aeroViajesUQ.model;

import com.nicolasprogramador.aeroViajesUQ.utils.ListaSimple;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tripulante extends Persona implements Comparable<Tripulante> {

    ListaSimple<Titulo> titulos;
    Rol rol;

    @Override
    public int compareTo(Tripulante o) {
        return this.getRol().compareTo(o.getRol());
    }
}
