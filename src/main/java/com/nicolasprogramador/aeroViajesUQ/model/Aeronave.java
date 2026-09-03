package com.nicolasprogramador.aeroViajesUQ.model;


import com.nicolasprogramador.aeroViajesUQ.utils.Bicola;
import com.nicolasprogramador.aeroViajesUQ.utils.ListaSimple;
import com.nicolasprogramador.aeroViajesUQ.utils.Pila;
import lombok.*;

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
    private ListaSimple<Pasajero> pasajerosClaseEjecutiva; //Revisar tipo de dato
    private ListaSimple<Pasajero> pasajerosClaseEconomica; //Revisar tipo de dato
    private int cantidadPasajerosEco;
    private int cantidadPasajerosEje;
    private Vuelo vuelo;
    private ListaSimple<Silla> sillas;
    private ListaSimple<Tripulante> tripulantes;
    private Bicola<CarroEmbarque> carrosEmbarque;
    private Pila<CarroEmbarque> pilaCarrosEmbarque;
}
