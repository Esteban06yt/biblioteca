package co.edu.uniquindio.poo.model;

public class DetallesPrestamo {
    private Integer cantidadLibrosPrestados;
    private Double subtotal;
    
    public DetallesPrestamo (Integer cantidadLibrosPrestados, Double subtotal){
        this.cantidadLibrosPrestados = cantidadLibrosPrestados;
        this.subtotal = subtotal;
    }

    public Integer getCantidadLibrosPrestados(){
        return cantidadLibrosPrestados;
    }
    public void setFechaPrestamo(Integer cantidadLibrosPrestados){
        this.cantidadLibrosPrestados = cantidadLibrosPrestados;
    }
    
    public Double getSubtotal(){
        return subtotal;
    }
    public void setSubTotal(Double subtotal){
        this.subtotal = subtotal;
    }

    @Override
    public String toString(){
        return "\nDetalles Prestamo [Cantidad Libros Prestados: "+cantidadLibrosPrestados + ", Subtotal; "+subtotal + "]";
    }
}