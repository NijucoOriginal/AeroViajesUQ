package com.nicolasprogramador.aeroViajesUQ.model;


import com.nicolasprogramador.aeroViajesUQ.utils.ListaSimple;

public class CarroEmbarque {

    private String identificacion;
    private float tope;
    private float cargamentoActual;
    private boolean enEspera;
    private ListaSimple<PiezaEquipaje> piezasEquipaje;
}
