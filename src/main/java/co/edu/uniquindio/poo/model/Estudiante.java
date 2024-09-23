package co.edu.uniquindio.poo.model;

public class Estudiante extends Persona{
    public Estudiante (String nombre, String cedula, String telefono, String correo){
        super(nombre, cedula, telefono, correo);
    }
    
    @Override
    public String toString(){
        return "\nEstudiante [Nombre: "+getNombre() + ", Cedula; "+getCedula() + ", Telefono: "+getTelefono() + ", Correo: "+getCorreo() + "]";
    }
}