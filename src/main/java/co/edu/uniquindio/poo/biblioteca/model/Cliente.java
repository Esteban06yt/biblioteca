package co.edu.uniquindio.poo.biblioteca.model;

import java.util.LinkedList;

public class Cliente extends Persona{
    private LinkedList<Prestamo> listaPrestamos;

    public Cliente(String nombre, String id, String correo) {
        super(nombre, id, correo);
        listaPrestamos = new LinkedList<>();
    }

    public LinkedList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }
    public void setListaPrestamos(LinkedList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
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
        } else {
            respuesta = "Este prestamo no existe";
        }
        return respuesta;
    }
}