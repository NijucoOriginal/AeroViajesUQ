package com.nicolasprogramador.aeroViajesUQ.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UsuarioPlataforma {

    private String nombreUsuario;
    private String contrasenia;
    private float billetera;
    private Pasajero pasajero;
    private String email;
}
