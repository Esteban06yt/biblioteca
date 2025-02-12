package co.edu.uniquindio.poo.biblioteca.controller;

import java.util.LinkedList;

import co.edu.uniquindio.poo.biblioteca.model.Administrador;
import co.edu.uniquindio.poo.biblioteca.model.Biblioteca;
import co.edu.uniquindio.poo.biblioteca.model.Cliente;
import co.edu.uniquindio.poo.biblioteca.model.Persona;

public class PersonaController {
    Biblioteca biblioteca;

    public PersonaController(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public LinkedList<Persona> obtenerListaPersonas(){
        return biblioteca.getListaPersonas();
    }
    public LinkedList<Administrador> ObtenerListaAdministradores (Administrador administrador){
        return biblioteca.getListaAdministradores();
    }
    public LinkedList<Cliente> ObtenerListaClientes(Cliente cliente){
        Administrador administrador = null;
        return administrador.getListaClientes();
    }
        
    public String AgregarPersona(Persona persona){
        return biblioteca.AgregarPersona(persona);
    }
    public String EliminarPersona(Persona persona){
        return biblioteca.EliminarPersona(persona);
    }
    public String ActualizarPersona(Persona persona, Persona personaActualizada){
        return biblioteca.ActualizarPersona(persona, personaActualizada);
    }
}