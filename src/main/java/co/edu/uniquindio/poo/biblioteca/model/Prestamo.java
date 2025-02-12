package co.edu.uniquindio.poo.biblioteca.model;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private String idPrestamo;
    private Cliente cliente;
    private Administrador administrador;
    private Material material;

    public Prestamo(LocalDate fechaInicio, LocalDate fechaFinal, String idPrestamo) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.idPrestamo = idPrestamo;
        this.cliente = cliente;
        this.administrador = administrador;
        this.material = material;
        cliente.AgregarPrestamo(this);
        administrador.AgregarPrestamo(this);
        material.AgregarPrestamo(this);
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }
    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }
    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Administrador getAdministrador() {
        return administrador;
    }
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal +
                ", idPrestamo='" + idPrestamo + '\'' +
                '}';
    }
}