package co.edu.uniquindio.poo.biblioteca.model;

import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private LinkedList<Persona> listaPersonas;
    private LinkedList<Material> listaMateriales;
    private LinkedList<Prestamo> listaPrestamos;
    private LinkedList<Administrador> listaAdministradores;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listaPersonas = new LinkedList<>();
        listaMateriales = new LinkedList<>();
        listaPrestamos = new LinkedList<>();
        listaAdministradores = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Persona> getListaPersonas() {
        return listaPersonas;
    }
    public void setListaPersonas(LinkedList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public LinkedList<Material> getListaMateriales() {
        return listaMateriales;
    }
    public void setListaMateriales(LinkedList<Material> listaMateriales) {
        this.listaMateriales = listaMateriales;
    }

    public LinkedList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }
    public void setListaPrestamos(LinkedList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public LinkedList<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }
    public void setListaAdministradores(LinkedList<Administrador> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    /**
     * Agrega una persona si esta no existe
     * @param persona
     * @return mensaje indicando si fue añadida o ya existe
     * @throws IllegalArgumentException
     */
    public String AgregarPersona(Persona persona) throws IllegalArgumentException {
        String respuesta = "La persona se añadió correctamente";
        if (persona == null) {
            throw new IllegalArgumentException("La persona no puede ser nula");
        }
        Persona personaAux = BuscarPersona(persona.getId());
        if (personaAux == null) {
            listaPersonas.add(persona);
        } else {
            respuesta = "Esta persona ya existe";
        }
        return respuesta;
    }

    /**
     * Busca una persona mediante su id en la lista de personas
     * @param id
     * @return la persona si es encontrada o null en caso contrario
     */
    public Persona BuscarPersona(String id) {
        return listaPersonas.stream()
                .filter(personaAux -> personaAux.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    /**
     * Elimina una persona siempre y cuando esta exista en la lista
     * @param persona
     * @return un mensaje indicando si fue eliminada o no existe
     * @throws IllegalArgumentException
     */
    public String EliminarPersona(Persona persona) throws IllegalArgumentException {
        String respuesta = "La persona se eliminó correctamente";
        if (persona == null) {
            throw new IllegalArgumentException("La persona no puede ser nula");
        }
        Persona personaAux = BuscarPersona(persona.getId());
        if (personaAux != null) {
            listaPersonas.remove(persona);
        } else {
            respuesta = "Esta persona no existe";
        }
        return respuesta;
    }

    /**
     * Actualiza una persona de la lista eliminándola y añadiendo la versión actualizada siempre y cuando esta exista
     * @param persona
     * @param personaActualizada
     * @return un mensaje indicando si se pudo actualizar o no existe
     * @throws IllegalArgumentException
     */
    public String ActualizarPersona(Persona persona, Persona personaActualizada) throws IllegalArgumentException {
        String respuesta = "La persona ha sido actualizada";

        if (persona == null || personaActualizada == null) {
            throw new IllegalArgumentException("La persona no puede ser nula");
        }
        Persona personaAux = BuscarPersona(persona.getId());
        if (personaAux != null) {
            listaPersonas.remove(persona);
            listaPersonas.add(personaActualizada);
        } else {
            respuesta = "Esta persona no existe";
        }
        return respuesta;
    }

    /**
     * Agrega un material si este no existe
     * @param material
     * @return mensaje indicando si fue añadido o ya existe
     * @throws IllegalArgumentException
     */
    public String AgregarMaterial(Material material) throws IllegalArgumentException {
        String respuesta = "El material se añadió correctamente";
        if (material == null) {
            throw new IllegalArgumentException("El material no puede ser nulo");
        }
        Material materialAux = BuscarMaterial(material.getCodigo());
        if (materialAux == null) {
            listaMateriales.add(material);
        } else {
            respuesta = "Este material ya existe";
        }
        return respuesta;
    }

    /**
     * Busca un material mediante su codigo en la lista de materiales
     * @param codigo
     * @return el material si es encontrado o null en caso contrario
     */
    public Material BuscarMaterial(String codigo) {
        return listaMateriales.stream()
                .filter(materialAux -> materialAux.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }

    /**
     * Elimina un material siempre y cuando este exista en la lista
     * @param material
     * @return un mensaje indicando si fue eliminado o no existe
     * @throws IllegalArgumentException
     */
    public String EliminarMaterial(Material material) throws IllegalArgumentException {
        String respuesta = "El material se eliminó correctamente";
        if (material == null) {
            throw new IllegalArgumentException("El material no puede ser nulo");
        }
        Material materialAux = BuscarMaterial(material.getCodigo());
        if (materialAux != null) {
            listaMateriales.remove(material);
        } else {
            respuesta = "Este material no existe";
        }
        return respuesta;
    }

    /**
     * Actualiza un material de la lista eliminándolo y añadiendo la versión actualizada siempre y cuando este exista
     * @param material
     * @param materialActualizado
     * @return un mensaje indicando si se pudo actualizar o no existe
     * @throws IllegalArgumentException
     */
    public String ActualizarMaterial(Material material, Material materialActualizado) throws IllegalArgumentException {
        String respuesta = "El material ha sido actualizado";
        if (material == null || materialActualizado == null) {
            throw new IllegalArgumentException("El material no puede ser nulo");
        }
        Material materialAux = BuscarMaterial(material.getCodigo());
        if (materialAux != null) {
            listaMateriales.remove(material);
            listaMateriales.add(materialActualizado);
        } else {
            respuesta = "Este material no existe";
        }
        return respuesta;
    }

    /**
     * Agrega un prestamo si este no existe
     * @param prestamo
     * @return mensaje indicando si fue añadido o ya existe
     * @throws IllegalArgumentException
     */
    public String AgregarPrestamo(Prestamo prestamo) throws IllegalArgumentException {
        String respuesta = "El prestamo se añadió correctamente";
        if (prestamo == null) {
            throw new IllegalArgumentException("El prestamo no puede ser nulo");
        }
        Prestamo prestamoAux = BuscarPrestamo(prestamo.getIdPrestamo());
        if (prestamoAux == null) {
            listaPrestamos.add(prestamo);
        } else {
            respuesta = "Este prestamo ya existe";
        }
        return respuesta;
    }

    /**
     * Busca un prestamo mediante su id en la lista de prestamos
     * @param idPrestamo
     * @return El prestamo si es encontrada o null en caso contrario
     */
    public Prestamo BuscarPrestamo(String idPrestamo) {
        return listaPrestamos.stream()
                .filter(prestamoAux -> prestamoAux.getIdPrestamo().equals(idPrestamo))
                .findFirst()
                .orElse(null);
    }

    /**
     * Elimina un prestamo siempre y cuando este exista en la lista
     * @param prestamo
     * @return un mensaje indicando si fue eliminado o no existe
     * @throws IllegalArgumentException
     */
    public String EliminarPrestamo(Prestamo prestamo) throws IllegalArgumentException {
        String respuesta = "El prestamo se eliminó correctamente";
        if (prestamo == null) {
            throw new IllegalArgumentException("El prestamo no puede ser nulo");
        }
        Prestamo prestamoAux = BuscarPrestamo(prestamo.getIdPrestamo());
        if (prestamoAux != null) {
            listaPrestamos.remove(prestamo);
            prestamo.getCliente().EliminarPrestamo(prestamo);
            prestamo.getAdministrador().EliminarPrestamo(prestamo);
            prestamo.getMaterial().EliminarPrestamo(prestamo);
        } else {
            respuesta = "Este prestamo no existe";
        }
        return respuesta;
    }

    /**
     * Actualiza un prestamo de la lista eliminandolo y añadiendo la version actualizada siempre y cuando este exista
     * @param prestamo
     * @param prestamoActualizado
     * @return un mensaje indicando si se puede actualizar o no existe
     * @throws IllegalArgumentException
     */
    public String ActualizarPrestamo(Prestamo prestamo, Prestamo prestamoActualizado)
            throws IllegalArgumentException {
        String respuesta = "El prestamo ha sido actualizado";
        if (prestamo == null || prestamoActualizado == null) {
            throw new IllegalArgumentException("El prestamo no puede ser nulo");
        }
        Prestamo prestamoAux = BuscarPrestamo(prestamo.getIdPrestamo());
        if (prestamoAux != null) {
            listaPrestamos.remove(prestamo);
            listaPrestamos.add(prestamoActualizado);
            prestamo.getCliente().ActualizarPrestamo(prestamoAux, prestamoActualizado);
            prestamo.getAdministrador().ActualizarPrestamo(prestamoAux, prestamoActualizado);
            prestamo.getMaterial().ActualizarPrestamo(prestamoAux, prestamoActualizado);
        } else {
            respuesta = "Este prestamo no existe";
        }
        return respuesta;
    }

    /**
     * Agrega un administrador si este no existe
     * @param administrador
     * @return mensaje indicando si fue añadido o ya existe
     * @throws IllegalArgumentException
     */
    public String AgregarAdministrador(Administrador administrador) throws IllegalArgumentException {
        String respuesta = "El administrador se añadió correctamente";
        if (administrador == null) {
            throw new IllegalArgumentException("El administrador no puede ser nulo");
        }
        Administrador administradorAux = BuscarAdministrador(administrador.getId());
        if (administradorAux == null) {
            listaAdministradores.add(administrador);
        } else {
            respuesta = "Este administrador ya existe";
        }
        return respuesta;
    }

    /**
     * Busca un administrador mediante su id en la lista de administradores
     * @param id
     * @return el administrador si es encontrado o null en caso contrario
     */
    public Administrador BuscarAdministrador(String id) {
        return listaAdministradores.stream()
                .filter(administradorAux -> administradorAux.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    /**
     * Elimina un administrador siempre y cuando este exista en la lista
     * @param administrador
     * @return un mensaje indicando si fue eliminado o no existe
     * @throws IllegalArgumentException
     */
    public String EliminarAdministrador(Administrador administrador) throws IllegalArgumentException {
        String respuesta = "El administrador se eliminó correctamente";
        if (administrador == null) {
            throw new IllegalArgumentException("El administrador no puede ser nulo");
        }
        Administrador administradorAux = BuscarAdministrador(administrador.getId());
        if (administradorAux != null) {
            listaAdministradores.remove(administrador);
        } else {
            respuesta = "Este administrador no existe";
        }
        return respuesta;
    }

    /**
     * Actualiza un administrador de la lista eliminándolo y añadiendo la versión actualizada siempre y cuando este exista
     * @param administrador
     * @param administradorActualizado
     * @return un mensaje indicando si se pudo actualizar o no existe
     * @throws IllegalArgumentException
     */
    public String ActualizarCliente(Administrador administrador, Administrador administradorActualizado) throws IllegalArgumentException {
        String respuesta = "El administrador ha sido actualizado";
        if (administrador == null || administradorActualizado == null) {
            throw new IllegalArgumentException("El administrador no puede ser nulo");
        }
        Administrador administradorAux = BuscarAdministrador(administrador.getId());
        if (administradorAux != null) {
            listaAdministradores.remove(administrador);
            listaAdministradores.add(administradorActualizado);
        } else {
            respuesta = "Este administrador no existe";
        }
        return respuesta;
    }
}