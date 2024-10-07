package co.edu.uniquindio.poo.application;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.model.Biblioteca;
import co.edu.uniquindio.poo.model.Bibliotecario;
import co.edu.uniquindio.poo.model.DetallesPrestamo;
import co.edu.uniquindio.poo.model.Estudiante;
import co.edu.uniquindio.poo.model.Libro;
import co.edu.uniquindio.poo.model.Prestamo;

public class App {
    public static void main(String[] args){
        boolean repetirTodo = true;
        String mensaje;
        String nombreBuscado;
        String cedulaBuscada;
        String codigoBuscado;
        String nombre;
        String cedula;
        String telefono;
        String correo;
        Double salario;
        LocalDate fechaInicio;
        String codigo;
        String isbn;
        String autor;
        String titulo;
        LocalDate fecha;
        Integer unidadesDisponibles;
        Biblioteca biblioteca = new Biblioteca("Lista biblioteca");
        Bibliotecario bibliotecario = null;
        Estudiante estudiante = null;
        Libro libro = null;
        Prestamo prestamo = null;
        DetallesPrestamo detallesPrestamo;

        /*
         * El usuario podrá elegir que acción tomar a continuación y cuando detenerse. Cuando el usuario decida detenerse la variable "repetirTodo" cambiara a false y se detendrá el ciclo, finalizando el programa.
         */
        for (; repetirTodo;){
            String accionElegida = "";
            /*
             * Se le muestra al usuario una lista de opciones que puede elegir enviando un número, el numero sera almacenado.
             */
            accionElegida = JOptionPane.showInputDialog(null, "¿Que acción desea realizar? \n\nEnvíe '1' para ver la información almacenada actualmente. \nEnvíe '2' para gestionar los bibliotecarios. \nEnvíe '3' para gestionar los estudiantes. \nEnvíe '4' para gestionar los libros. \nEnvie 5 para gestionar los prestamos. \nEnvíe '0' para finalizar el programa.", "Menu general", JOptionPane.QUESTION_MESSAGE);
            switch (accionElegida){
                /*
                 * Si el usuario envió un cero, el programa se finalizara.
                 */
                case "0":
                    JOptionPane.showMessageDialog(null, "Finalizando programa.", "información", JOptionPane.INFORMATION_MESSAGE);
                    repetirTodo = false;
                    break;
                /*
                 * Si el usuario envió un uno accederá a nuevas opciones que le permitirán ver la información de su interés.
                 */
                case "1":
                    boolean repetirMenu1 = true;
                    for (; repetirMenu1;){
                        accionElegida = JOptionPane.showInputDialog(null, "¿Que desea ver? \n\nEnvíe '1' para ver los bibliotecarios. \nEnvíe '2' para ver un bibliotecario especifico. \nEnvíe '3' para ver los estudiantes. \nEnvíe '4' para ver la información de un estudiante especifico. \nEnvíe '5' para ver los libros. \nEnvíe '6' para ver la información de un libro especifico. \nEnvíe '7' para ver los prestamos. \nEnvíe '8' para ver la información de un prestamo especifico. \nEnvíe '0' para regresar al menu anterior.", "Menu de información", JOptionPane.QUESTION_MESSAGE);
                        switch (accionElegida){
                            /*
                             * Si el usuario envió un cero regresara al menu inicial.
                             */
                            case "0":
                                repetirMenu1 = false;
                                break;
                            /*
                             * Si el usuario envió un uno se imprimirán todos los bibliotecarios.
                             */
                            case "1":
                                JOptionPane.showMessageDialog(null, bibliotecario, "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            /*
                             * Si el usuario envió un dos se imprimirá un bibliotecarios de su elección.
                             */
                            case "2":
                                nombreBuscado = JOptionPane.showInputDialog(null, "Escriba el nombre del bibliotecario cuya información busca", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);
                                cedulaBuscada = JOptionPane.showInputDialog(null, "Escriba la cedula del bibliotecario cuya información busca", "Ingreso de cedula.", JOptionPane.QUESTION_MESSAGE);
                                bibliotecario = biblioteca.buscarBibliotecario(nombreBuscado, cedulaBuscada);
                                if (bibliotecario != null){
                                    JOptionPane.showMessageDialog(null, bibliotecario, "información", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se ha encontrado un bibliotecario con esas características.", "información", JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                            /*
                             * Si el usuario envió un tres se imprimirán todos los estudiantes.
                             */
                            case "3":
                                JOptionPane.showMessageDialog(null, estudiante, "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            /*
                             * Si el usuario envió un cuatro se imprimirá un estudiante de su elección.
                             */
                            case "4":
                                nombreBuscado = JOptionPane.showInputDialog(null, "Escriba el nombre del estudiante cuya información busca", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);
                                cedulaBuscada = JOptionPane.showInputDialog(null, "Escriba la cedula del estudiante cuya información busca", "Ingreso de cedula.", JOptionPane.QUESTION_MESSAGE);
                                estudiante = biblioteca.buscarEstudiante(nombreBuscado, cedulaBuscada);
                                if (estudiante != null){
                                    JOptionPane.showMessageDialog(null, estudiante, "información", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se ha encontrado un estudiante con esas características.", "información", JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                            /*
                             * Si el usuario envió un cinco se imprimirán todos los libros.
                             */
                            case "5":
                                JOptionPane.showMessageDialog(null, libro, "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            /*
                             * Si el usuario envió un seis se imprimirá un libro de su elección.
                             */
                            case "6":
                                codigoBuscado = JOptionPane.showInputDialog(null, "Escriba el codigo del libro cuya información busca", "Ingreso de codigo.", JOptionPane.QUESTION_MESSAGE);
                                libro = biblioteca.buscarLibro(codigoBuscado);
                                if (libro != null){
                                    JOptionPane.showMessageDialog(null, libro, "información", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se ha encontrado un libro con esas características.", "información", JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                            /*
                             * Si el usuario envió un siete se imprimirán todos los prestamos.
                             */
                            case "7":
                                JOptionPane.showMessageDialog(null, prestamo, "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            /*
                             * Si el usuario envió un ocho se imprimirá un prestamo de su elección.
                             */
                            case "8":
                                codigoBuscado = JOptionPane.showInputDialog(null, "Escriba el codigo del prestamo cuya información busca", "Ingreso de codigo.", JOptionPane.QUESTION_MESSAGE);
                                prestamo = biblioteca.buscarPrestamo(codigoBuscado);
                                if (prestamo != null){
                                    JOptionPane.showMessageDialog(null, prestamo, "información", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se ha encontrado un prestamo con esas características.", "información", JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                            /*
                             * Si el usuario no ingreso un numero valido, se le informara de ello y se lemostrara de nuevo el menu de información.
                             */
                            default:
                                JOptionPane.showMessageDialog(null, "La opción que a ingresado no es valida, recuerde que debe ingresar un numero entre 0 y 8", "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    } 
                    break;
                /*
                 * Si el usuario envió un dos accederá a nuevas opciones que le permitirán gestionar la información de los bibliotecarios.
                 */
                case "2":
                    boolean repetirMenu2 = true;
                    for (; repetirMenu2;){
                        accionElegida = JOptionPane.showInputDialog(null, "¿Que desea hacer? \n\nEnvíe '1' para crear un nuevo bibliotecario \nEnvíe '2' para eliminar un bibliotecario. \nEnvíe '3' para actualizar la información de un bibliotecario. \nEnvíe '0' para regresar al menu anterior.", "Menu de bibliotecarios", JOptionPane.QUESTION_MESSAGE);
                        switch (accionElegida){
                            /*
                             * Si el usuario envió un cero regresara al menu inicial.
                             */
                            case "0":
                                repetirMenu2 = false;
                                break;
                            /*
                             * Si el usuario envío un uno se le solicitara información y se creara un bibliotecario con base en ella.
                             */
                            case "1":
                                boolean repetirIngreso = true;
                                for (; repetirIngreso;){
                                    nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre para el bibliotecario:", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);
                                    cedula = JOptionPane.showInputDialog(null, "Ingrese una cedula para el bibliotecario:", "Ingreso de cedula.", JOptionPane.QUESTION_MESSAGE);
                                    telefono = JOptionPane.showInputDialog(null, "Ingrese un telefono para el bibliotecario:", "Ingreso de telefono.", JOptionPane.QUESTION_MESSAGE);
                                    correo = JOptionPane.showInputDialog(null, "Ingrese un correo para el bibliotecario:", "Ingreso de correo.", JOptionPane.QUESTION_MESSAGE);
                                    salario = Double.valueOf(JOptionPane.showInputDialog(null, "Ingrese un salario para el bibliotecario:", "Ingreso de salario.", JOptionPane.QUESTION_MESSAGE));
                                    fechaInicio = LocalDate.parse(JOptionPane.showInputDialog(null, "Ingrese una fecha de inicio para el bibliotecario (formato: YYYY-MM-DD):", "Ingreso de fecha de inicio.", JOptionPane.QUESTION_MESSAGE));
                                    if (!nombre.isEmpty() && !cedula.isEmpty()){
                                        bibliotecario = new Bibliotecario(nombre, cedula, telefono, correo, salario, fechaInicio);
                                        mensaje = biblioteca.crearBibiliotecario(bibliotecario);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n" + bibliotecario, "información", JOptionPane.INFORMATION_MESSAGE);
                                        repetirIngreso = false;
                                    } else if (nombre.isEmpty() && cedula.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "No se puede crear un bibliotecario sin nombre ni cedula.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                break;
                            /*
                             * Si el usuario envío un dos se le solicitara el nombre y cedula para eliminar un bibliotecario con dichas características.
                             */
                            case "2":
                                nombreBuscado = JOptionPane.showInputDialog(null, "Ingrese el nombre del bibliotecario que desea eliminar", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);
                                cedulaBuscada = JOptionPane.showInputDialog(null, "Ingrese la cedula del bibliotecario que desea eliminar", "Ingreso de cedula.", JOptionPane.QUESTION_MESSAGE);
                                mensaje = biblioteca.eliminarBibliotecario(nombreBuscado, cedulaBuscada);
                                JOptionPane.showMessageDialog(null, mensaje, "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            /*
                             * Si el usuario envío un tres se le solicitara toda la información de un bibliotecario, para actualizarla en un bibliotecario que comparta el nombre y cedula ingresados.
                             */
                            case "3":
                                boolean repetirIngreso2 = true;
                                for (; repetirIngreso2;){
                                    nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre para su bibliotecario:", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);
                                    cedula = JOptionPane.showInputDialog(null, "Ingrese la nueva cedula para su bibliotecario::", "Ingreso de cedula.", JOptionPane.QUESTION_MESSAGE);
                                    telefono = JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono para su bibliotecario", "Ingreso de telefono.", JOptionPane.QUESTION_MESSAGE);
                                    correo = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo el para su bibliotecario:", "Ingreso de correo.", JOptionPane.QUESTION_MESSAGE);
                                    salario = Double.valueOf(JOptionPane.showInputDialog(null, "Ingrese el nuevo salario para su bibliotecario:", "Ingreso de salario.", JOptionPane.QUESTION_MESSAGE));
                                    fechaInicio = LocalDate.parse(JOptionPane.showInputDialog(null, "Ingrese la nueva fecha de inicio para su bibliotecario:", "Ingreso de fecha de inicio.", JOptionPane.QUESTION_MESSAGE));
                                    if (!nombre.isEmpty() && !cedula.isEmpty()){
                                        mensaje = biblioteca.actualizarBibliotecario(nombre, cedula, telefono, correo, salario, fechaInicio);
                                        bibliotecario = biblioteca.buscarBibliotecario(nombre, cedula);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n" + bibliotecario, "información", JOptionPane.INFORMATION_MESSAGE);
                                        repetirIngreso2 = false;
                                    }
                                    if (nombre.isEmpty() && cedula.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "No se puede actualizar un bibliotecario sin nombre ni cedula.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    if (!nombre.isEmpty() && cedula.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "No se puede actualizar un bibliotecario sin cedula.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    if (nombre.isEmpty() && !cedula.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "No se puede actualizar un bibliotecario sin nombre.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                break;
                            /*
                             * Si el usuario no ingreso un valor valido se le informara de ello y se repetirá el ciclo.
                             */
                            default:
                                JOptionPane.showMessageDialog(null, "La opción que a ingresado no es valida, recuerde que debe ingresar un numero entre 0 y 3", "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    }
                    break;
                /*
                 * Si el usuario envió un tres accederá a nuevas opciones que le permitirán gestionar la información de los estudiantes.
                 */
                case "3":
                    boolean repetirMenu3 = true;
                    for (; repetirMenu3;){
                        accionElegida = JOptionPane.showInputDialog(null, "¿Que desea hacer? \n\nEnvíe '1' para crear un nuevo estudiante \nEnvíe '2' para eliminar un estudiante. \nEnvíe '3' para actualizar la información de un estudiante. \nEnvíe '0' para regresar al menu anterior.", "Menu de estudiantes", JOptionPane.QUESTION_MESSAGE);
                        switch (accionElegida){
                            /*
                             * Si el usuario envió un cero regresara al menu inicial.
                             */
                            case "0":
                                repetirMenu3 = false;
                                break;
                            /*
                             * Si el usuario envío un uno se le solicitara información y se creara un estudiante con base en ella.
                             */
                            case "1":
                                boolean repetirIngreso = true;
                                for (; repetirIngreso;){
                                    nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre para el estudiante:", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);
                                    cedula = JOptionPane.showInputDialog(null, "Ingrese una cedula para el estudiante:", "Ingreso de cedula.", JOptionPane.QUESTION_MESSAGE);
                                    telefono = JOptionPane.showInputDialog(null, "Ingrese un telefono para el estudiante:", "Ingreso de telefono.", JOptionPane.QUESTION_MESSAGE);
                                    correo = JOptionPane.showInputDialog(null, "Ingrese un correo para el estudiante:", "Ingreso de correo.", JOptionPane.QUESTION_MESSAGE);
                                    if (!nombre.isEmpty() && !cedula.isEmpty()){
                                        estudiante = new Estudiante(nombre, cedula, telefono, correo);
                                        mensaje = biblioteca.crearEstudiante(estudiante);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n" + estudiante, "información", JOptionPane.INFORMATION_MESSAGE);
                                        repetirIngreso = false;
                                    } else if (nombre.isEmpty() && cedula.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "No se puede crear un estudiante sin nombre ni cedula.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                break;
                            /*
                             * Si el usuario envío un dos se le solicitara el nombre y cedula para eliminar un estudiante con dichas características.
                             */
                            case "2":
                                nombreBuscado = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante que desea eliminar", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);
                                cedulaBuscada = JOptionPane.showInputDialog(null, "Ingrese la cedula del estudiante que desea eliminar", "Ingreso de cedula.", JOptionPane.QUESTION_MESSAGE);
                                mensaje = biblioteca.eliminarEstudiante(nombreBuscado, cedulaBuscada);
                                JOptionPane.showMessageDialog(null, mensaje, "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            /*
                             * Si el usuario envío un tres se le solicitara toda la información de un estudiante, para actualizarla en un estudiante que comparta el nombre y cedula ingresados.
                             */
                            case "3":
                                boolean repetirIngreso2 = true;
                                for (; repetirIngreso2;){
                                    nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre para su estudiante:", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);
                                    cedula = JOptionPane.showInputDialog(null, "Ingrese la nueva cedula para su estudiante::", "Ingreso de cedula.", JOptionPane.QUESTION_MESSAGE);
                                    telefono = JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono para su estudiante", "Ingreso de telefono.", JOptionPane.QUESTION_MESSAGE);
                                    correo = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo el para su estudiante:", "Ingreso de correo.", JOptionPane.QUESTION_MESSAGE);
                                    if (!nombre.isEmpty() && !cedula.isEmpty()){
                                        mensaje = biblioteca.actualizarEstudiante(nombre, cedula, telefono, correo);
                                        estudiante = biblioteca.buscarEstudiante(nombre, cedula);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n" + estudiante, "información", JOptionPane.INFORMATION_MESSAGE);
                                        repetirIngreso2 = false;
                                    }
                                    if (nombre.isEmpty() && cedula.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "No se puede actualizar un estudiante sin nombre ni cedula.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    if (!nombre.isEmpty() && cedula.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "No se puede actualizar un estudiante sin cedula.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    if (nombre.isEmpty() && !cedula.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "No se puede actualizar un estudiante sin nombre.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                break;
                            /*
                             * Si el usuario no ingreso un valor valido se le informara de ello y se repetirá el ciclo.
                             */
                            default:
                                JOptionPane.showMessageDialog(null, "La opción que a ingresado no es valida, recuerde que debe ingresar un numero entre 0 y 3", "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    }
                    break;
                /*
                 * Si el usuario envió un cuatro accederá a nuevas opciones que le permitirán gestionar la información de los libros.
                 */
                case "4":
                    boolean repetirMenu4 = true;
                    for (; repetirMenu4;){
                        accionElegida = JOptionPane.showInputDialog(null, "¿Que desea hacer? \n\nEnvíe '1' para crear un nuevo libro \nEnvíe '2' para eliminar un libro. \nEnvíe '3' para actualizar la información de un libro. \nEnvíe '0' para regresar al menu anterior.", "Menu de libros", JOptionPane.QUESTION_MESSAGE);
                        switch (accionElegida){
                            /*
                             * Si el usuario envió un cero regresara al menu inicial.
                             */
                            case "0":
                                repetirMenu4 = false;
                                break;
                            /*
                             * Si el usuario envío un uno se le solicitara información y se creara un libro con base en ella.
                             */
                            case "1":
                                boolean repetirIngreso = true;
                                for (; repetirIngreso;){
                                    codigo = JOptionPane.showInputDialog(null, "Ingrese un codigo para el libro:", "Ingreso de codigo.", JOptionPane.QUESTION_MESSAGE);
                                    isbn = JOptionPane.showInputDialog(null, "Ingrese un isbn para el libro:", "Ingreso de isbn.", JOptionPane.QUESTION_MESSAGE);
                                    autor = JOptionPane.showInputDialog(null, "Ingrese un autor para el libro:", "Ingreso de autor.", JOptionPane.QUESTION_MESSAGE);
                                    titulo = JOptionPane.showInputDialog(null, "Ingrese un titulo para el libro:", "Ingreso de titulo.", JOptionPane.QUESTION_MESSAGE);
                                    fecha = LocalDate.parse(JOptionPane.showInputDialog(null, "Ingrese una fecha para el libro (formato: YYYY-MM-DD):", "Ingreso de fecha.", JOptionPane.QUESTION_MESSAGE));
                                    unidadesDisponibles = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese un numero de unidades disponibles para el libro:", "Ingreso de unidades disponibles.", JOptionPane.QUESTION_MESSAGE));
                                    if (!codigo.isEmpty()){
                                        libro = new Libro(codigo, isbn, autor, titulo, fecha, unidadesDisponibles);
                                        mensaje = biblioteca.crearLibro(libro);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n" + libro, "información", JOptionPane.INFORMATION_MESSAGE);
                                        repetirIngreso = false;
                                    } else if (codigo.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "No se puede crear un libro sin codigo.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                break;
                            /*
                             * Si el usuario envío un dos se le solicitara el codigo para eliminar un libro con dicha característica.
                             */
                            case "2":
                                codigoBuscado = JOptionPane.showInputDialog(null, "Ingrese el codigo del libro que desea eliminar", "Ingreso de codigo.", JOptionPane.QUESTION_MESSAGE);
                                mensaje = biblioteca.eliminarLibro(codigoBuscado);
                                JOptionPane.showMessageDialog(null, mensaje, "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            /*
                             * Si el usuario envío un tres se le solicitara toda la información de un libro, para actualizarla en un libro que comparta el codigo ingresado.
                             */
                            case "3":
                                boolean repetirIngreso2 = true;
                                for (; repetirIngreso2;){
                                    codigo = JOptionPane.showInputDialog(null, "Ingrese el nuevo codigo para su libro:", "Ingreso de codigo.", JOptionPane.QUESTION_MESSAGE);
                                    isbn = JOptionPane.showInputDialog(null, "Ingrese el nuevo isbn para su libro::", "Ingreso de isbn.", JOptionPane.QUESTION_MESSAGE);
                                    autor = JOptionPane.showInputDialog(null, "Ingrese el nuevo autor para su libro", "Ingreso de autor.", JOptionPane.QUESTION_MESSAGE);
                                    titulo = JOptionPane.showInputDialog(null, "Ingrese el nuevo titulo para su libro:", "Ingreso de titulo.", JOptionPane.QUESTION_MESSAGE);
                                    fecha = LocalDate.parse(JOptionPane.showInputDialog(null, "Ingrese la nueva fecha para su libro:", "Ingreso de fecha", JOptionPane.QUESTION_MESSAGE));
                                    unidadesDisponibles = Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el nuevo numero de unidades disponibles para su libro:", "Ingreso de unidades disponibles.", JOptionPane.QUESTION_MESSAGE));
                                    if (!codigo.isEmpty()){
                                        mensaje = biblioteca.actualizarLibro(codigo, isbn, autor, titulo, fecha, unidadesDisponibles);
                                        libro = biblioteca.buscarLibro(codigo);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n" + libro, "información", JOptionPane.INFORMATION_MESSAGE);
                                        repetirIngreso2 = false;
                                    }
                                    if (codigo.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "No se puede actualizar un libro sin codigo.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                break;
                            /*
                             * Si el usuario no ingreso un valor valido se le informara de ello y se repetirá el ciclo.
                             */
                            default:
                                JOptionPane.showMessageDialog(null, "La opción que a ingresado no es valida, recuerde que debe ingresar un numero entre 0 y 3", "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    }
                    break;

            }
        }
    }
}