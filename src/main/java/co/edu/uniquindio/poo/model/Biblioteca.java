package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Biblioteca {
    private String nombre;
    private Bibliotecario[] listaBibliotecarios = new Bibliotecario[10];
    private Estudiante[] listaEstudiantes = new Estudiante[50];
    private Libro[] listaLibros = new Libro[200];

    public Biblioteca (String nombre){
        this.nombre = nombre;
        this.listaBibliotecarios = new Bibliotecario[10];
        this.listaEstudiantes = new Estudiante[50];
        this.listaLibros = new Libro[200];
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Bibliotecario[] getListaBibliotecarios(){
        return listaBibliotecarios;
    }
    public void setListaBibliotecarios(Bibliotecario[] listaBibliotecarios){
        this.listaBibliotecarios = listaBibliotecarios;
    }

    public Estudiante[] getListaEstudiantes(){
        return listaEstudiantes;
    }
    public void setListaEstudiantes(Estudiante[] listaEstudiantes){
        this.listaEstudiantes = listaEstudiantes;
    }

    public Libro[] getListaLibros(){
        return listaLibros;
    }
    public void setListaLibros(Libro[] listaLibros){
        this.listaLibros = listaLibros;
    }

    /*
     * Este método almacena un nuevo bibliotecario, solo si hay espacios disponibles y el bibliotecario aun no ha sido registrado.
     */
    public String crearBibiliotecario(Bibliotecario nuevoBibliotecario){
        String mensaje = "";
        int posicionDisponibleBibliotecario = 0;
        Bibliotecario bibliotecarioEncontrado = null;
        posicionDisponibleBibliotecario = buscarPosicionDisponibleBibliotecario();
        if (posicionDisponibleBibliotecario == -1) {
            mensaje = "\nNo hay espacio para un nuevo bibliotecario.";
            return mensaje;
        } else {
            bibliotecarioEncontrado = buscarBibliotecario(nuevoBibliotecario.getNombre(), nuevoBibliotecario.getCedula());
            if (bibliotecarioEncontrado != null) {
                mensaje = "\nEl bibliotecario ya se encuentra registrado.";
            } else {
                listaBibliotecarios[posicionDisponibleBibliotecario] = nuevoBibliotecario;
                mensaje = "\nEl bibliotecario se ha almacenado exitosamente.";
            }
        }
        return mensaje;
    }
    /*
     * Este método almacena un nuevo estudiante, solo si hay espacios disponibles y el estudiante aun no ha sido registrado.
     */
    public String crearEstudiante(Estudiante nuevoEstudiante){
        String mensaje = "";
        int posicionDisponibleEstudiante = 0;
        Estudiante estudianteEncontrado = null;
        posicionDisponibleEstudiante = buscarPosicionDisponibleEstudiante();
        if (posicionDisponibleEstudiante == -1) {
            mensaje = "\nNo hay espacio para un nuevo estudiante.";
            return mensaje;
        } else {
            estudianteEncontrado = buscarEstudiante(nuevoEstudiante.getNombre(), nuevoEstudiante.getCedula());
            if (estudianteEncontrado != null) {
                mensaje = "\nEl estudiante ya se encuentra registrado.";
            } else {
                listaEstudiantes[posicionDisponibleEstudiante] = nuevoEstudiante;
                mensaje = "\nEl estudiante se ha almacenado exitosamente.";
            }
        }
        return mensaje;
    }
    /*
     * Este método almacena un nuevo libro, solo si hay espacios disponibles y el libro aun no ha sido registrado.
     */
    public String crearLibro(Libro nuevoLibro){
        String mensaje = "";
        int posicionDisponibleLibro = 0;
        Libro libroEncontrado = null;
        posicionDisponibleLibro = buscarPosicionDisponibleLibro();
        if (posicionDisponibleLibro == -1) {
            mensaje = "\nNo hay espacio para un nuevo libro.";
            return mensaje;
        } else {
            libroEncontrado = buscarLibro(nuevoLibro.getCodigo());
            if (libroEncontrado != null) {
                mensaje = "\nEl libro ya se encuentra registrado.";
            } else {
                listaLibros[posicionDisponibleLibro] = nuevoLibro;
                mensaje = "\nEl libro se ha almacenado exitosamente.";
            }
        }
        return mensaje;
    }

    /*
     * Este método busca una posición disponible para bibliotecario y la retorna, en caso de no haber espacios disponibles retorna -1.
     */
    private int buscarPosicionDisponibleBibliotecario(){
        int posicionDisponibleBibliotecario = -1;
        for (int i = 0; i < listaBibliotecarios.length; i++) {
            Bibliotecario bibliotecario = listaBibliotecarios[i];
            if (bibliotecario == null) {
                posicionDisponibleBibliotecario = i;
                return posicionDisponibleBibliotecario;
            }
        }
        return posicionDisponibleBibliotecario;
    }
    /*
     * Este método busca una posición disponible para estudiante y la retorna, en caso de no haber espacios disponibles retorna -1.
     */
    private int buscarPosicionDisponibleEstudiante(){
        int posicionDisponibleEstudiante = -1;
        for (int i = 0; i < listaEstudiantes.length; i++) {
            Estudiante estudiante = listaEstudiantes[i];
            if (estudiante == null) {
                posicionDisponibleEstudiante = i;
                return posicionDisponibleEstudiante;
            }
        }
        return posicionDisponibleEstudiante;
    }
    /*
     * Este método busca una posición disponible para libro y la retorna, en caso de no haber espacios disponibles retorna -1.
     */
    private int buscarPosicionDisponibleLibro(){
        int posicionDisponibleLibro = -1;
        for (int i = 0; i < listaLibros.length; i++) {
            Libro libro = listaLibros[i];
            if (libro == null) {
                posicionDisponibleLibro = i;
                return posicionDisponibleLibro;
            }
        }
        return posicionDisponibleLibro;
    }

    /*
     * Este método busca un bibliotecario en base a su nombre y número de cedula.
     */
    public Bibliotecario buscarBibliotecario(String nombre, String cedula){
        Bibliotecario bibliotecarioEncontrado = null;
        for (int i = 0; i < listaBibliotecarios.length; i++) {
            Bibliotecario bibliotecarioAux = listaBibliotecarios[i];
            if (bibliotecarioAux != null) {
                if (bibliotecarioAux.getNombre().equals(nombre) && bibliotecarioAux.getCedula().equals(cedula)){
                    bibliotecarioEncontrado = bibliotecarioAux;
                    return bibliotecarioEncontrado;
                }
            }
        }
        return bibliotecarioEncontrado;
    }
    /*
     * Este método busca un estudiante en base a su nombre y número de cedula.
     */
    public Estudiante buscarEstudiante(String nombre, String cedula){
        Estudiante estudianteEncontrado = null;
        for (int i = 0; i < listaEstudiantes.length; i++) {
            Estudiante estudianteAux = listaEstudiantes[i];
            if (estudianteAux != null) {
                if (estudianteAux.getNombre().equals(nombre) && estudianteAux.getCedula().equals(cedula)){
                    estudianteEncontrado = estudianteAux;
                    return estudianteEncontrado;
                }
            }
        }
        return estudianteEncontrado;
    }
    /*
     * Este método busca un libro en base a su titulo y isbn.
     */
    public Libro buscarLibro(String codigo){
        Libro libroEncontrado = null;
        for (int i = 0; i < listaLibros.length; i++) {
            Libro libroAux = listaLibros[i];
            if (libroAux != null) {
                if (libroAux.getCodigo().equals(codigo)){
                    libroEncontrado = libroAux;
                    return libroEncontrado;
                }
            }
        }
        return libroEncontrado;
    }

    /*
     * Este método elimina un bibliotecario, si lo encuentra.
     */
    public String eliminarBibliotecario(String nombre, String cedula){
        String mensaje = "\nEl bibliotecario no existe.";
        for (int i = 0; i < listaBibliotecarios.length; i++) {
            Bibliotecario bibliotecarioAux = listaBibliotecarios[i];
            if (bibliotecarioAux != null) {
                if (bibliotecarioAux.getNombre().equals(nombre) && bibliotecarioAux.getCedula().equals(cedula)){
                    listaBibliotecarios[i] = null;
                    mensaje = "\nEl bibliotecario ha sido eliminado correctamente.";
                    return mensaje;
                }                
            }           
        }
        return mensaje;
    }
    /*
     * Este método elimina un estudiante, si lo encuentra.
     */
    public String eliminarEstudiante(String nombre, String cedula){
        String mensaje = "\nEl estudiante no existe.";
        for (int i = 0; i < listaEstudiantes.length; i++) {
            Estudiante estudianteAux = listaEstudiantes[i];
            if (estudianteAux != null) {
                if (estudianteAux.getNombre().equals(nombre) && estudianteAux.getCedula().equals(cedula)){
                    listaEstudiantes[i] = null;
                    mensaje = "\nEl estudiante ha sido eliminado correctamente.";
                    return mensaje;
                }                
            }           
        }
        return mensaje;
    }
    /*
     * Este método elimina un libro, si lo encuentra.
     */
    public String eliminarLibro(String titulo, String isbn){
        String mensaje = "\nEl libro no existe.";
        for (int i = 0; i < listaLibros.length; i++) {
            Libro libroAux = listaLibros[i];
            if (libroAux != null) {
                if (libroAux.getTitulo().equals(titulo) && libroAux.getIsbn().equals(isbn)){
                    listaLibros[i] = null;
                    mensaje = "\nEl libro ha sido eliminado correctamente.";
                    return mensaje;
                }                
            }           
        }
        return mensaje;
    }

    /*
     * Este método actualiza la información de un bibliotecario, si lo encuentra.
     */
    public String actualizarBibliotecario(String nombre, String cedula, String telefono, String correo, Double salario, LocalDate fechaInicio){
        String mensaje = "\nEl bibliotecario no se encuentra registrado.";
        Bibliotecario bibliotecarioEncontrado = buscarBibliotecario(nombre, cedula);
        if (bibliotecarioEncontrado != null) {
            bibliotecarioEncontrado.setNombre(nombre);
            bibliotecarioEncontrado.setCedula(cedula);
            bibliotecarioEncontrado.setTelefono(telefono);
            bibliotecarioEncontrado.setCorreo(correo);
            bibliotecarioEncontrado.setSalario(salario);
            bibliotecarioEncontrado.setFechaInicio(fechaInicio);
            mensaje = "\nLa información del bibliotecario ha sido actualizada de manera satisfactoria.";
            return mensaje;
        }
        return mensaje;
    }
    /*
     * Este método actualiza la información de un estudiante, si lo encuentra.
     */
    public String actualizarEstudiante(String nombre, String cedula, String telefono, String correo){
        String mensaje = "\nEl estudiante no se encuentra registrado.";
        Estudiante estudianteEncontrado = buscarEstudiante(nombre, cedula);
        if (estudianteEncontrado != null) {
            estudianteEncontrado.setNombre(nombre);
            estudianteEncontrado.setCedula(cedula);
            estudianteEncontrado.setTelefono(telefono);
            estudianteEncontrado.setCorreo(correo);
            mensaje = "\nLa información del estudiante ha sido actualizada de manera satisfactoria.";
            return mensaje;
        }
        return mensaje;
    }
        /*
     * Este método actualiza la información de un libro, si lo encuentra.
     */
    public String actualizarLibro(String codigo, String isbn, String autor, String titulo, LocalDate fecha, Integer unidadesDisponibles){
        String mensaje = "\nEl libro no se encuentra registrado.";
        Libro libroEncontrado = buscarLibro(codigo);
        if (libroEncontrado != null) {
            libroEncontrado.setCodigo(codigo);
            libroEncontrado.setIsbn(isbn);
            libroEncontrado.setAutor(autor);
            libroEncontrado.setTitulo(titulo);
            libroEncontrado.setFecha(fecha);
            libroEncontrado.setUnidadesDisponibles(unidadesDisponibles);
            mensaje = "\nLa información del libro ha sido actualizada de manera satisfactoria.";
            return mensaje;
        }
        return mensaje;
    }
}