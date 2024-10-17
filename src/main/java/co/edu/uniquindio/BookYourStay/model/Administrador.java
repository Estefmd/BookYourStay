package co.edu.uniquindio.BookYourStay.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@Builder
@AllArgsConstructor

public class Administrador extends Usuario{

    private String nombre;
    private String cedula;
    private String correo;
    private String contrasenia;

}
