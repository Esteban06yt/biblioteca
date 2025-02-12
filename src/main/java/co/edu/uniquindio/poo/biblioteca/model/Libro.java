package co.edu.uniquindio.poo.biblioteca.model;

import java.time.LocalDate;

public class Libro extends Material{
    public Libro(String titulo, String autor, LocalDate anioPublicacion, String codigo, Disponibilidad disponibilidad) {
        super(titulo, autor, anioPublicacion, codigo, disponibilidad);
    }
}