package com.nicolasprogramador.aeroViajesUQ.model;


import com.nicolasprogramador.aeroViajesUQ.utils.Bicola;
import com.nicolasprogramador.aeroViajesUQ.utils.ListaSimple;
import com.nicolasprogramador.aeroViajesUQ.utils.Pila;
import lombok.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Aeronave {

    private String identificacion;
    private String nombre;
    private int cantidadPasajerosTotal;
    private float pesoTotal;
    private Map<String,Pasajero> pasajerosClaseEjecutiva=new TreeMap<>();
    private Map<String,Pasajero> pasajerosClaseEconomica=new TreeMap<>();
    private int cantidadPasajerosEco;
    private int cantidadPasajerosEje;
    private Vuelo vuelo;
    private Map<String,Silla> sillas=new LinkedHashMap<>();
    private ListaSimple<Tripulante> tripulantes;
    private Bicola<CarroEmbarque> carrosEmbarque;
    private Pila<CarroEmbarque> pilaCarrosEmbarque;
}
