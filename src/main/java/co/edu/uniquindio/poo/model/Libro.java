package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Libro {
    private String codigo;
    private String isbn;
    private String autor;
    private String titulo;
    private LocalDate fecha;
    private Integer unidadesDisponibles;

    public Libro (String codigo, String isbn, String autor, String titulo, LocalDate fecha, Integer unidadesDisponibles){
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.fecha = fecha;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public LocalDate getFecha(){
        return fecha;
    }
    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }

    public Integer unidadesDisponibles(){
        return unidadesDisponibles;
    }
    public void setUnidadesDisponibles(Integer unidadesDisponibles){
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public String toString(){
        return "\nLibro [Codigo: "+codigo + ", Isbn; "+isbn + ", Autor: "+autor + ", Titulo: "+titulo + ", Fecha:"+fecha + ", Unidades Disponibles: "+unidadesDisponibles + "]";
    }
}