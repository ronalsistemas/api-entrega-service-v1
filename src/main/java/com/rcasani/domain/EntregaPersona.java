package com.rcasani.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EntregaPersona {

    private Long id;
    private String nombre;
    private String telefono;
    private String tipoVehiculo;
    private String licencia;

    public EntregaPersona(Long id) {
        this.id = id;
    }
}
