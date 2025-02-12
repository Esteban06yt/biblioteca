package co.edu.uniquindio.poo.biblioteca.model;

import java.util.LinkedList;

public class Administrador extends Persona {
    private LinkedList<Cliente> listaClientes;
    private LinkedList<Material> listaMateriales;
    private LinkedList<Prestamo> listaPrestamos;

    public Administrador(String nombre, String id, String correo) {
        super(nombre, id, correo);
        listaClientes = new LinkedList<>();
        listaMateriales = new LinkedList<>();
        listaPrestamos = new LinkedList<>();
    }

    public LinkedList<Cliente> getListaClientes() {
        return listaClientes;
    }
    public void setListaClientes(LinkedList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
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

    /**
     * Agrega un cliente si este no existe
     * @param cliente
     * @return mensaje indicando si fue añadido o ya existe
     * @throws IllegalArgumentException
     */
    public String AgregarCliente(Cliente cliente) throws IllegalArgumentException {
        String respuesta = "El cliente se añadió correctamente";
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo");
        }
        Cliente clienteAux = BuscarCliente(cliente.getId());
        if (clienteAux == null) {
            listaClientes.add(cliente);
        } else {
            respuesta = "Este cliente ya existe";
        }
        return respuesta;
    }

    /**
     * Busca un cliente mediante su id en la lista de cliente
     * @param id
     * @return el cliente si es encontrado o null en caso contrario
     */
    public Cliente BuscarCliente(String id) {
        return listaClientes.stream()
                .filter(clienteAux -> clienteAux.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    /**
     * Elimina un cliente siempre y cuando este exista en la lista
     * @param cliente
     * @return un mensaje indicando si fue eliminado o no existe
     * @throws IllegalArgumentException
     */
    public String EliminarCliente(Cliente cliente) throws IllegalArgumentException {
        String respuesta = "El cliente se eliminó correctamente";
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo");
        }
        Cliente clienteAux = BuscarCliente(cliente.getId());
        if (clienteAux != null) {
            listaClientes.remove(cliente);
        } else {
            respuesta = "Este cliente no existe";
        }
        return respuesta;
    }

    /**
     * Actualiza un cliente de la lista eliminándolo y añadiendo la versión actualizada siempre y cuando este exista
     * @param cliente
     * @param clienteActualizado
     * @return un mensaje indicando si se pudo actualizar o no existe
     * @throws IllegalArgumentException
     */
    public String ActualizarCliente(Cliente cliente, Cliente clienteActualizado) throws IllegalArgumentException {
        String respuesta = "El cliente ha sido actualizado";
        if (cliente == null || clienteActualizado == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo");
        }
        Cliente clienteAux = BuscarCliente(cliente.getId());
        if (clienteAux != null) {
            listaClientes.remove(cliente);
            listaClientes.add(clienteActualizado);
        } else {
            respuesta = "Este cliente no existe";
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