package com.nicolasprogramador.aeroViajesUQ.model;

import com.nicolasprogramador.aeroViajesUQ.utils.ListaSimple;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Boleto implements Comparable<Boleto> {

    private String identificacion;
    private Pasajero duenio;
    private LocalDateTime fechaSalidaIda;
    private LocalDateTime fechaLlegadaIda;
    private LocalDateTime fechaLlegadaVuelta;
    private LocalDateTime fechaSalidaVuelta;
    private Aeronave aeronaveAdjunta;
    private ListaSimple<PiezaEquipaje> piezasEquipaje;
    private ListaSimple<Mascota> mascotas;
    private float costo;
    private Modalidad modalidad;
    private Silla silla;
    private LocalDateTime fechaAdquisicion;

    @Override
    public int compareTo(Boleto o) {
        return this.getFechaAdquisicion().compareTo(o.getFechaAdquisicion());
    }
}
