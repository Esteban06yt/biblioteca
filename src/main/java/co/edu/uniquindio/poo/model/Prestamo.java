package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private String codigo;
    private Double total;
    
    public Prestamo (LocalDate fechaPrestamo, LocalDate fechaDevolucion, String codigo, Double total){
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.codigo = codigo;
        this.total = total;
    }

    public LocalDate getFechaPrestamo(){
        return fechaPrestamo;
    }
    public void setFechaPrestamo(LocalDate fechaPrestamo){
        this.fechaPrestamo = fechaPrestamo;
    }
    
    public LocalDate getFechaDevolucion(){
        return fechaDevolucion;
    }
    public void setFechaDevolucion(LocalDate fechaDevolucion){
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public Double getTotal(){
        return total;
    }
    public void setTotal(Double total){
        this.total = total;
    }

    @Override
    public String toString(){
        return "\nPrestamo [Fecha Prestamo: "+fechaPrestamo + ", Fecha Devolucion; "+fechaDevolucion + ", Codigo: "+codigo + ", Total: "+total + "]";
    }
}