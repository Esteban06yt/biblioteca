package co.edu.uniquindio.poo.biblioteca.model;

import java.time.LocalDate;

public class Revista extends Material{
    public Revista(String titulo, String autor, LocalDate anioPublicacion, String codigo, Disponibilidad disponibilidad) {
        super(titulo, autor, anioPublicacion, codigo, disponibilidad);
    }
}