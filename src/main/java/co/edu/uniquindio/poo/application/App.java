package co.edu.uniquindio.poo.application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.model.Biblioteca;
import co.edu.uniquindio.poo.model.Bibliotecario;
import co.edu.uniquindio.poo.model.Estudiante;
import co.edu.uniquindio.poo.model.Libro;
import co.edu.uniquindio.poo.model.Prestamo;
import co.edu.uniquindio.poo.model.DetallesPrestamo;

public class App {
    public static void main(String[] args) {
        boolean repetirTodo = true;
        String mensaje;
        String nombreBuscado;
        String cedulaBuscada;
        String codigoBuscado;
        String nombre;
        String cedula;
        String telefono;
        String correo;
        String salario;
        String fechaInicio;
        Biblioteca biblioteca;
        Bibliotecario bibliotecario;
        Estudiante estudiante;
        Libro libro;
        Prestamo prestamo;
        DetallesPrestamo detallesPrestamo;
        LocalDate fecha;
        LocalTime hora;

        /*
         * El usuario podrá elegir que acción tomar a continuación y cuando detenerse. Cuando el usuario decida detenerse la variable "repetirTodo" cambiara a false y se detendrá el ciclo, finalizando el programa.
         */
        for (; repetirTodo;) {
            String accionElegida = "";
            /*
             * Se le muestra al usuario una lista de opciones que puede elegir enviando un número, el numero sera almacenado.
             */
            accionElegida = JOptionPane.showInputDialog(null, "¿Que acción desea realizar? \n\nEnvíe '1' para ver la información almacenada actualmente. \nEnvíe '2' para gestionar los bibliotecarios. \nEnvíe '3' para gestionar los estudiantes. \nEnvíe '4' para gestionar los libros. Envie 5 para gestionar los prestamos. \nEnvíe '0' para finalizar el programa.", "Menu general", JOptionPane.QUESTION_MESSAGE);
            switch (accionElegida) {
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
                    for (; repetirMenu1;) {
                        accionElegida = JOptionPane.showInputDialog(null, "¿Que desea ver? \nEnvíe '1' para ver los bibliotecarios. \nEnvíe '2' para ver un bibliotecario especifico. \nEnvíe '3' para ver los estudiantes. \nEnvíe '4' para ver la información de un estudiante especifico. \nEnvíe '5' para ver los libros. \nEnvíe '6' para ver la información de un libro especifico. \nEnvíe '7' para ver los prestamos. \nEnvíe '8' para ver la información de un prestamo especifico. \nEnvíe '0' para regresar al menu anterior.", "Menu de información", JOptionPane.QUESTION_MESSAGE);
                        switch (accionElegida) {
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
                                if (bibliotecario != null) {
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
                                if (estudiante != null) {
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
                                if (libro != null) {
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
                                if (prestamo != null) {
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
                 * Si el usuario envió un dos accederá a nuevas opciones que le permitirán gestionar la información.
                 */
                case "2":
                    boolean repetirMenu2 = true;
                    for (; repetirMenu2;) {
                        accionElegida = JOptionPane.showInputDialog(null, "¿Que desea hacer? \n\nEnvíe '1' para crear un nuevo bibliotecario \nEnvíe '2' para eliminar un bibliotecario. \nEnvíe '3' para actualizar la información de un bibliotecario. \nEnvíe '0' para regresar al menu anterior.", "Menu de bibliotecarios", JOptionPane.QUESTION_MESSAGE);
                        switch (accionElegida) {
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
                                for (; repetirIngreso;) {
                                    nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre para el bibliotecario:", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);
                                    cedula = JOptionPane.showInputDialog(null, "Ingrese una cedula para el bibliotecario:", "Ingreso de cedula.", JOptionPane.QUESTION_MESSAGE);
                                    telefono = JOptionPane.showInputDialog(null, "Ingrese un telefono para el bibliotecario:", "Ingreso de telefono.", JOptionPane.QUESTION_MESSAGE);
                                    correo = JOptionPane.showInputDialog(null, "Ingrese un correo para el bibliotecario:", "Ingreso de correo.", JOptionPane.QUESTION_MESSAGE);
                                    salario = JOptionPane.showInputDialog(null, "Ingrese un salario para el bibliotecario:", "Ingreso de salario.", JOptionPane.QUESTION_MESSAGE);
                                    fechaInicio = JOptionPane.showInputDialog(null, "Ingrese una Fecha de Inicio para el bibliotecario:", "Ingreso de Fecha de Inicio.", JOptionPane.QUESTION_MESSAGE);
                                    if (!nombre.isEmpty() && !cedula.isEmpty()) {
                                        bibliotecario = new Bibliotecario(nombre, cedula, telefono, correo, salario, fechaInicio);
                                        mensaje = biblioteca.crearBibiliotecario(bibliotecario);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n" + bibliotecario, "información", JOptionPane.INFORMATION_MESSAGE);
                                        repetirIngreso = false;
                                    }else
                                    if (nombre.isEmpty() && cedula.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No se puede crear un contacto sin nombre ni cedula.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                break;
                            /*
                             * Si el usuario envío un dos se le solicitara el nombre y cedula para eliminar un bibliotecario con dichas características.
                             */
                            case "2":
                                nombreBuscado = JOptionPane.showInputDialog(null, "Ingrese el nombre del contacto que desea eliminar", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);

                                numeroBuscado = JOptionPane.showInputDialog(null, "Ingrese el teléfono del contacto que desea eliminar", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);

                                mensaje = agenda.eliminarContacto(nombreBuscado, numeroBuscado);
                                JOptionPane.showMessageDialog(null, mensaje, "información", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            /*
                             * Si el usuario envío un tres de le solicitara toda la información de un
                             * contacto, para actualizarla en un contacto que comparta el nombre y numero
                             * ingresados.
                             */
                            case "3":
                                boolean repetirIngreso2 = true;
                                for (; repetirIngreso2;) {
                                    nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del contacto que desea actualizar:", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);

                                    alias = JOptionPane.showInputDialog(null, "Ingrese el nuevo alias para su contacto::", "Ingreso de alias.", JOptionPane.QUESTION_MESSAGE);
            
                                    direccion = JOptionPane.showInputDialog(null, "Ingrese la nueva dirección para su contacto", "Ingreso de dirección.", JOptionPane.QUESTION_MESSAGE);
                                 
                                    telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono del contacto que desea actualizar:", "Ingreso de teléfono.", JOptionPane.QUESTION_MESSAGE);
                              
                                    email = JOptionPane.showInputDialog(null, "Ingrese el nuevo email para su contacto:", "Ingreso de email.", JOptionPane.QUESTION_MESSAGE);

                                    if (!nombre.isEmpty() && !telefono.isEmpty()) {
                                        mensaje = agenda.actualizarContancto(nombre, alias, direccion,
                                                telefono, email);
                                        contacto = agenda.buscarContacto(nombre, telefono);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n" + contacto, "información", JOptionPane.INFORMATION_MESSAGE);
                                        repetirIngreso2 = false;
                                    }
                                    if (nombre.isEmpty() && telefono.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No se puede actualizar un contacto sin nombre ni telefono.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    if (!nombre.isEmpty() && telefono.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No se puede actualizar un contacto sin telefono.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    if (nombre.isEmpty() && !telefono.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "No se puede actualizar un contacto sin nombre.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                break;

                            /*
                             * Si el usuario no ingreso un valor valido se le informara de ello y se
                             * repetirá el ciclo.
                             */
                            default:
                                JOptionPane.showMessageDialog(null, "La opción que a ingresado no es valida, recuerde que debe ingresar un numero entre 0 y 3", "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    }
                    break;

                /*
                 * Si el usuario envió un tres accederá a nuevas opciones que le permitirán
                 * gestionar la información de sus grupos.
                 */
                case "3":
                    boolean repetirMenu3 = true;
                    for (; repetirMenu3;) {
                        accionElegida = JOptionPane.showInputDialog(null, "¿Que desea hacer? \n\nEnvíe '1' añadir un contacto a un grupo \nEnvíe '2' para eliminar un contacto de un grupo. \nEnvíe '0' para regresar al menu anterior.", "Menu de grupos", JOptionPane.QUESTION_MESSAGE);

                        switch (accionElegida) {

                            /*
                             * Si el usuario envió un cero regresara al menu inicial
                             */
                            case "0":
                                repetirMenu3 = false;
                                break;

                            /*
                             * Si el usuario envío un uno, se le pedirá el nombre y teléfono de un contacto
                             * para añadirlo a un grupo de su elección
                             */
                            case "1":
                                nombreBuscado = JOptionPane.showInputDialog(null, "Ingrese el nombre del contacto que desea añadir", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);

                                numeroBuscado = JOptionPane.showInputDialog(null, "Ingrese el teléfono del contacto que desea añadir", "Ingreso de teléfono.", JOptionPane.QUESTION_MESSAGE);

                                accionElegida = JOptionPane.showInputDialog(null, " Elija el grupo al que desea que se añada el contacto. \nEnvíe 1 para Oficina. \nEnvíe 2 para Fiesta. \nEnvíe 3 para Amigos. \nEnvíe 4 para Familia.", "Selección de grupo", JOptionPane.QUESTION_MESSAGE);

                                switch (accionElegida) {
                                    case "1":
                                        opcionSelexionada = Categorias.OFICINA;
                                        JOptionPane.showMessageDialog(null, "A seleccionado el grupo Oficina", "información", JOptionPane.INFORMATION_MESSAGE);
                                        mensaje = grupoOficina.añadirContacto(nombreBuscado, numeroBuscado,
                                                agenda);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n\n" + grupoOficina, "información".toString(), JOptionPane.INFORMATION_MESSAGE);
                                        opcionSelexionada.equals(Categorias.OFICINA);
                                        break;
                                    case "2":
                                        opcionSelexionada = Categorias.FIESTA;
                                        JOptionPane.showMessageDialog(null, "A seleccionado el grupo Fiesta", "información", JOptionPane.INFORMATION_MESSAGE);
                                        mensaje = grupoFiesta.añadirContacto(nombreBuscado, numeroBuscado,
                                        agenda);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n\n" + grupoFiesta.toString(), "información", JOptionPane.INFORMATION_MESSAGE);
                                        break;
  
                                    case "3":
                                        opcionSelexionada = Categorias.AMIGOS;
                                        JOptionPane.showMessageDialog(null, "A seleccionado el grupo Amigos", "información", JOptionPane.INFORMATION_MESSAGE);
                                        mensaje = grupoAmigos.añadirContacto(nombreBuscado, numeroBuscado,agenda);
                                        JOptionPane.showMessageDialog(null, mensaje  + "\n\n" + grupoAmigos.toString(), "información", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                    case "4":
                                        opcionSelexionada = Categorias.FAMILIA;
                                        JOptionPane.showMessageDialog(null, "A seleccionado el grupo Familia", "información", JOptionPane.INFORMATION_MESSAGE);
                                        mensaje = grupoFamilia.añadirContacto(nombreBuscado, numeroBuscado,
                                                agenda);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n\n" + grupoFamilia.toString(), "información", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "El valor ingresado no es valido, recuerde que debe ingresar un valor entre 1 y 4.", "información", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                }
                                break;

                            /*
                             * Si el usuario envío un uno, se le pedirá el nombre y teléfono de un contacto
                             * para eliminarlo de un grupo de su elección
                             */
                            case "2":
                                nombreBuscado = JOptionPane.showInputDialog(null, "Ingrese el nombre del contacto que desea eliminar.", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);

                                numeroBuscado = JOptionPane.showInputDialog(null, "Ingrese el teléfono del contacto que desea eliminar.", "Ingreso de teléfono.", JOptionPane.QUESTION_MESSAGE);

                                accionElegida = JOptionPane.showInputDialog(null, " Elija el grupo del que desea que se elimine el contacto. \nEnvíe 1 para Oficina. \nEnvíe 2 para Fiesta. \nEnvíe 3 para Amigos. \nEnvíe 4 para Familia.", "Selección de grupo", JOptionPane.QUESTION_MESSAGE);

                                switch (accionElegida) {
                                    case "1":
                                        opcionSelexionada = Categorias.OFICINA;
                                        JOptionPane.showMessageDialog(null, "A seleccionado el grupo Oficina", "información", JOptionPane.INFORMATION_MESSAGE);
                                        mensaje = grupoOficina.eliminarContacto(nombreBuscado, numeroBuscado);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n\n" + grupoOficina.toString(), "información", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                    case "2":
                                        opcionSelexionada = Categorias.FIESTA;
                                        JOptionPane.showMessageDialog(null, "A seleccionado el grupo Fiesta", "información", JOptionPane.INFORMATION_MESSAGE);
                                        mensaje = grupoFiesta.eliminarContacto(nombreBuscado, numeroBuscado);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n\n" + grupoFiesta.toString(), "información", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                    case "3":
                                        opcionSelexionada = Categorias.AMIGOS;
                                        JOptionPane.showMessageDialog(null, "A seleccionado el grupo Amigos", "información", JOptionPane.INFORMATION_MESSAGE);
                                        mensaje = grupoAmigos.eliminarContacto(nombreBuscado, numeroBuscado);
                                        JOptionPane.showMessageDialog(null, mensaje, "información" + "\n\n" + grupoAmigos.toString(), JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                    case "4":
                                        opcionSelexionada = Categorias.FAMILIA;
                                        JOptionPane.showMessageDialog(null, "A seleccionado el grupo Familia", "información", JOptionPane.INFORMATION_MESSAGE);
                                        mensaje = grupoFamilia.eliminarContacto(nombreBuscado, numeroBuscado);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n\n" + grupoFamilia.toString(), "información", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "El valor ingresado no es valido, recuerde que debe ingresar un valor entre 1 y 4.", "información", JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                }
                                break;

                            /*
                             * Si el usuario no ingreso un valor valido se le informara de ello y se
                             * repetirá el ciclo.
                             */
                            default:
                                JOptionPane.showMessageDialog(null, "El valor ingresado no es valido, recuerde que debe ingresar un valor entre 1 y 2.", "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    }
                    break;

                /*
                 * Si el usuario envió un cuatro accederá a nuevas opciones que le permitirán
                 * gestionar la información de sus reuniones.
                 */
                case "4":
                    boolean repetirMenu4 = true;
                    for (; repetirMenu4;) {
                        accionElegida = JOptionPane.showInputDialog(null, "¿Que desea hacer? \n\nEnvíe '1' para crear una nueva reunion \nEnvíe '2' para eliminar una reunion. \nEnvíe '3' para añadir un contacto a una reunion. \nEnvíe '4' para eliminar un contacto de una reunion \nEnvíe '0' para regresar al menu anterior.", "Menu de reuniones", JOptionPane.QUESTION_MESSAGE);


                        switch (accionElegida) {

                            /*
                             * Si el usuario envió un cero regresara al menu inicial
                             */
                            case "0":
                                repetirMenu4 = false;
                                break;

                            /*
                             * Si el usuario envío un uno se le pedirá la información para crear una reunion
                             * y se creara dicha reunion
                             */
                            case "1":
                                boolean repetirIngreso2 = true;
                                for (; repetirIngreso2;) {
                                    descripcionReunion = JOptionPane.showInputDialog(null, "Ingrese una descripción para la nueva reunión.", "Ingreso de descripción.", JOptionPane.QUESTION_MESSAGE);

                                    String añoTexto = JOptionPane.showInputDialog(null, "Ingrese el año en que se realizara la reunión.", "Ingreso de año.", JOptionPane.QUESTION_MESSAGE);
                                    int año = Integer.parseInt(añoTexto);

                                    String mesTexto = JOptionPane.showInputDialog(null, "Ingrese el numero del mes en que se realizara la reunión.", "Ingreso de mes", JOptionPane.QUESTION_MESSAGE);
                                    int mes = Integer.parseInt(mesTexto);

                                    String diaTexto = JOptionPane.showInputDialog(null, "Ingrese el numero del dia en que se realizara la reunión.", "Ingreso de día", JOptionPane.QUESTION_MESSAGE);
                                    int dia = Integer.parseInt(diaTexto);

                                    fecha = LocalDate.of(año, mes, dia);

                                    String horaIngresada = JOptionPane.showInputDialog(null, "Ingrese la hora para en la que se realizara la reunión usando el formato HH:MM:SS.", "Ingreso de hora", JOptionPane.QUESTION_MESSAGE);
                                    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
                                    hora = LocalTime.parse(horaIngresada, formatoHora);

                                    String ingresarAsistentes = JOptionPane.showInputDialog(null, "Ingrese el máximo de asistentes para su reunion.", "Ingreso de asistentes máximos", JOptionPane.QUESTION_MESSAGE);
                                    maximosAsistentes = Integer.parseInt(ingresarAsistentes);

                                    if (!descripcionReunion.isEmpty() && maximosAsistentes >= 0) {
                                        reunion = new Reunion(descripcionReunion, fecha, hora, maximosAsistentes);
                                        mensaje = todasLaReuniones.guardarReunion(reunion);
                                        JOptionPane.showMessageDialog(null, mensaje + "\n" + reunion, "información", JOptionPane.INFORMATION_MESSAGE);
                                        repetirIngreso2 = false;
                                    }
                                    if (descripcionReunion.isEmpty() && maximosAsistentes < 0) {
                                        JOptionPane.showMessageDialog(null, "No se puede crear una reunion sin descripción ni con un máximo negativo de asistentes maximos.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    if (descripcionReunion.isEmpty() && maximosAsistentes >= 0) {
                                        JOptionPane.showMessageDialog(null, "No se puede crear una reunion sin descripción.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    if (!descripcionReunion.isEmpty() && maximosAsistentes < 0) {
                                        JOptionPane.showMessageDialog(null, "No se puede crear una reunion con un máximo negativo de asistentes maximos.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                break;

                            /*
                             * Si el usuario envío un dos se le pedirá la descripción de una reunion y se
                             * eliminara la reunion que tenga dicha descripción
                             */
                            case "2":
                                descripcionReunion = JOptionPane.showInputDialog(null, "Ingrese la descripción que desea eliminar.", "Ingreso de descripción.", JOptionPane.QUESTION_MESSAGE);

                                mensaje = todasLaReuniones.eliminarReunion(descripcionReunion);
                                JOptionPane.showMessageDialog(null, mensaje, "información", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            /*
                             * Si el usuario envío un tres se le pedirá el nombre y telefono de yn contacto
                             * para añadirlo a una reunion de su elección
                             */
                            case "3":
                                boolean repetirIngreso = true;
                                for (; repetirIngreso;) {

                                    nombreBuscado = JOptionPane.showInputDialog(null, "Ingrese el nombre del contacto que desea añadir", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);

                                    numeroBuscado = JOptionPane.showInputDialog(null, "Ingrese el teléfono del contacto que desea añadir", "Ingreso de teléfono.", JOptionPane.QUESTION_MESSAGE);
                                    
                                    descripcionReunion = JOptionPane.showInputDialog(null, "Ingrese la descripción en la que desea añadir el contacto.", "Ingreso de descripción.", JOptionPane.QUESTION_MESSAGE);

                                    reunion = todasLaReuniones.buscarReunion(descripcionReunion);

                                    if (reunion == null) {
                                        JOptionPane.showMessageDialog(null, "No se encontró una reunion con esa descripción.", "información", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        if (!descripcionReunion.isEmpty()) {
                                            reunion = todasLaReuniones.buscarReunion(descripcionReunion);
                                            mensaje = reunion.añadirContacto(nombreBuscado, numeroBuscado,
                                                    agenda);
                                            JOptionPane.showMessageDialog(null, mensaje + "\n" + reunion, "información", JOptionPane.INFORMATION_MESSAGE);
                                            repetirIngreso = false;
                                        }
                                        if (descripcionReunion.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "No se puede buscar una reunion sin descripción.", "información", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                                }
                                break;

                            /*
                             * Si el usuario envío un cuatro se le pedirá el nombre y telefono de yn
                             * contacto para eliminarlo de una reunion de su elección
                             */
                            case "4":
                                boolean repetirIngreso3 = true;
                                for (; repetirIngreso3;) {

                                    nombreBuscado = JOptionPane.showInputDialog(null, "Ingrese el nombre del contacto que desea eliminar", "Ingreso de nombre.", JOptionPane.QUESTION_MESSAGE);

                                    numeroBuscado = JOptionPane.showInputDialog(null, "Ingrese el teléfono del contacto que desea eliminar", "Ingreso de teléfono.", JOptionPane.QUESTION_MESSAGE);

                                    descripcionReunion = JOptionPane.showInputDialog(null, "Ingrese la descripción de la cual desea eliminar el contacto.", "Ingreso de descripción.", JOptionPane.QUESTION_MESSAGE);

                                    reunion = todasLaReuniones.buscarReunion(descripcionReunion);

                                    if (reunion == null) {
                                        JOptionPane.showMessageDialog(null, "No se encontró una reunion con esa descripción.", "información", JOptionPane.INFORMATION_MESSAGE);
                                        repetirIngreso3 = false;
                                        
                                    } else {
                                        if (!descripcionReunion.isEmpty()) {
                                            reunion = todasLaReuniones.buscarReunion(descripcionReunion);
                                            mensaje = reunion.eliminarContacto(nombreBuscado, numeroBuscado);
                                            JOptionPane.showMessageDialog(null, mensaje + "\n" + reunion, "información", JOptionPane.INFORMATION_MESSAGE);
                                            repetirIngreso3 = false;
                                        }
                                        if (descripcionReunion.isEmpty()) {
                                            JOptionPane.showMessageDialog(null, "No se buscar una reunion sin descripción.", "información", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                                }
                                break;

                            /*
                             * Si el usuario no ingreso un valor valido se le informara de ello y se
                             * repetirá el ciclo.
                             */
                            default:
                                JOptionPane.showMessageDialog(null, "La opción que a ingresado no es valida, recuerde que debe ingresar un numero entre 0 y 4", "información", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    }
                    break;
                /*
                 * Si el usuario no envió un numero valido, se le notificara de ello y el ciclo
                 * principal se repetirá.
                 */
                default:
                    JOptionPane.showMessageDialog(null, "La opción que ha ingresado no es valida, recuerde que debe ingresar un numero entre 0 y 4", "información", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
    }
}