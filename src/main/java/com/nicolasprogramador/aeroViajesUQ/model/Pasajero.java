package com.nicolasprogramador.aeroViajesUQ.model;


import com.nicolasprogramador.aeroViajesUQ.utils.ListaSimple;
import lombok.*;

import java.util.Comparator;
import java.util.TreeSet;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pasajero extends Persona implements Comparable<Pasajero> {

    private TreeSet<Boleto> boletos;
    private float billetera;

    @Override
    public int compareTo(Pasajero o) {
        return this.getPrimerApellido().compareTo(o.getPrimerApellido());
    }
}
