package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Bibliotecario  extends Persona{
    private Double salario;
    private LocalDate fechaInicio;

    public Bibliotecario (String nombre, String cedula, String telefono, String correo, Double salario, LocalDate fechaInicio){
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }

    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }

    public LocalDate getFechaInicio(){
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio){
        this.fechaInicio = fechaInicio;
    }
}