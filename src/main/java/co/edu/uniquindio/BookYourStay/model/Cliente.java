package co.edu.uniquindio.BookYourStay.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@Builder
@AllArgsConstructor

public class Cliente extends Usuario {

    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;
    private String contrasenia;
    private Billetera billetera;
}
