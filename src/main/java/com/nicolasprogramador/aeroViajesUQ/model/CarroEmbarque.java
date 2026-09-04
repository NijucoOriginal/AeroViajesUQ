package com.nicolasprogramador.aeroViajesUQ.model;


import com.nicolasprogramador.aeroViajesUQ.utils.ListaSimple;
import lombok.*;

import java.util.Set;
import java.util.TreeSet;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CarroEmbarque {

    private String identificacion;
    private float tope;
    private float cargamentoActual;
    private boolean enEspera;
    private Set<PiezaEquipaje> piezasEquipaje=new TreeSet<>();
}
