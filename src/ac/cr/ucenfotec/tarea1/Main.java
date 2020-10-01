package ac.cr.ucenfotec.tarea1;

import ac.cr.ucenfotec.tarea1.entidades.*;

import java.io.PrintStream;
import java.util.Scanner;


public class Main {

    private static Scanner input = new Scanner(System.in);
    private static PrintStream output = new PrintStream(System.out);


    /* **** Contadores de posicion para los arreglos **** */

    private static int nextPosicionMascota = 0;
    private static int nextPosicionCita = 0;
    private static int nextPosicionReservacion = 0;
    private static int nextPosicionusuario = 0;


    /* **** Arreglos para guardar la informacion **** */
    private static Mascota[] arregloDeMascotas = new Mascota[50];
    private static Cita[] arregloDeCitas = new Cita[50];
    private static Reservacion[] arregloDeReservaciones = new Reservacion[50];
    private static Usuario[] arregloDeUsuarios = new Usuario[50];


    public static void main(String[] args) {

        /* ********** Menu ********** */
        int opcion = 0;
                do{
                    mostrarMenu();
                    opcion = input.nextInt();
                    leerOpcionMenu(opcion);
                } while (opcion != 9);

    }


    /* ********** Opciones del menu ********** */
    // Opcion - 1: Registro de mascotas y su duenio
    public static void registrarMascota(){
        output.println("Nombre del dueño:");
        String nombreDuenio = input.next();
        output.println("Cédula del dueño:");
        String cedulaDuenio = input.next();
        output.println("Teléfono del dueño:");
        String telefonoDuenio = input.next();
        output.println("Dirección del dueño:");
        String direccionDuenio = input.next();
        Duenio nuevoDuenio = new Duenio(nombreDuenio, cedulaDuenio, telefonoDuenio, direccionDuenio);


        output.println("Nombre de la mascota:");
        String nombre = input.next();
        output.println("Observaciones:");
        String observaciones = input.next();
        output.println("Ranking (entre 1 y 3 estrellas):");
        int ranking = input.nextInt();
        output.println("Enlace del archivo con la foto:");
        String foto = input.next();

        Mascota nuevaMascota = new Mascota(nombre, observaciones, ranking, foto, nuevoDuenio);
        Boolean repetido = false;

        for (int i=0; i<nextPosicionMascota; i++) {
            if (nombre.equals(arregloDeMascotas[i].getNombre())){
             repetido = true;
            }
        }

        if(!repetido){
            arregloDeMascotas[nextPosicionMascota] = nuevaMascota;
            nextPosicionMascota++;
        } else {
            output.println("La mascota ya está previamente registrada. Revise los datos.");
        }
    }


    // Opcion - 3: Registro de citas
    public static void registrarCita(){
        output.println("Nombre de la mascota:");
        String nombreMascota = input.next();
        output.println("Fecha de la cita:");
        String fechaDeCita = input.next();
        output.println("Hora de la cita:");
        String horaDeCita = input.next();
        output.println("Observaciones:");
        String observaciones = input.next();
        Cita nuevaCita = new Cita(nombreMascota, fechaDeCita, horaDeCita, observaciones);

        arregloDeCitas[nextPosicionCita] = nuevaCita;
        nextPosicionCita++;
    }



    // Opcion - 5: Registro de reservaciones
    public static void registrarReservacion(){
        output.println("Nombre de la mascota:");
        String nombreMascota = input.next();
        output.println("Fecha de entrada:");
        String fechaDeEntrada = input.next();
        output.println("Fecha de Salida:");
        String fechaDeSalida = input.next();
        Reservacion nuevaReservacion = new Reservacion(nombreMascota, fechaDeEntrada, fechaDeSalida);

        arregloDeReservaciones[nextPosicionReservacion] = nuevaReservacion;
        nextPosicionReservacion++;
    }

    // Opcion - 7: Registro de Usuarios
    public static void registrarUsuario(){
        output.println("Nombre del usuario:");
        String nombreUsuario = input.next();
        output.println("Número de cédula:");
        String numeroCedula = input.next();
        output.println("Teléfono:");
        String telefono = input.next();
        output.println("Dirección:");
        String direccion = input.next();
        output.println("¿Está activo? (sí: 'true', no: 'false'");
        Boolean activo = input.nextBoolean();
        output.println("Rol (enfermería, médico):");
        String rol = input.next();

        Usuario nuevoUsuario = new Usuario(nombreUsuario, numeroCedula, telefono, direccion, activo, rol);
        Boolean repetido = false;

        for (int i = 0; i<nextPosicionusuario; i++){
            if(numeroCedula.equals(arregloDeUsuarios[i].getCedula())){
                repetido = true;
            }
        }

        if(!repetido) {
            arregloDeUsuarios[nextPosicionusuario] = nuevoUsuario;
            nextPosicionusuario++;
        } else {
            output.println("El usuario ya está previamente registreado: Revise los datos.");
        }
    }


    public static void leerOpcionMenu(int opcion){
        switch (opcion) {
            case 1:
                registrarMascota();
                break;

            case 2:
                for(int i=0 ; i < arregloDeMascotas.length; i++){
                    if(arregloDeMascotas[i] != null) {
                        output.println("#" + (i + 1) + " " + arregloDeMascotas[i]);
                        }
                    }
                break;

            case 3:
                registrarCita();
                break;

            case 4:
                for(int i=0 ; i < arregloDeCitas.length; i++){
                    if(arregloDeCitas[i] != null) {
                        output.println("#" + (i + 1) + " " + arregloDeCitas[i]);
                    }
                }
                break;

            case 5:
                registrarReservacion();
                break;

            case 6:
                for(int i=0 ; i < arregloDeReservaciones.length; i++){
                    if(arregloDeReservaciones[i] != null) {
                        output.println("#" + (i + 1) + " " + arregloDeReservaciones[i]);
                    }
                }
                break;

            case 7:
                registrarUsuario();
                break;

            case 8:
                for(int i=0 ; i < arregloDeUsuarios.length; i++){
                    if(arregloDeUsuarios[i] != null) {
                        output.println("#" + (i + 1) + " " + arregloDeUsuarios[i]);
                    }
                }
                break;

            case 9:
                //Salir del menu
                break;
            default:
                output.println("Opcion desconocida");
        }
    }

    public static void mostrarMenu(){
        output.println("Seleccione una opción:");
        output.println("1. Registrar mascota");
        output.println("2. Listar mascotas");
        output.println("3. Registrar cita");
        output.println("4. Listar citas");
        output.println("5. Registrar reservación en el hotel");
        output.println("6. Listar reservaciones en el hotel");
        output.println("7. Registrar usuario administrador");
        output.println("8. Lista de usuarios administradores");
        output.println("9. Salir");
        output.println("Ingrese su opcion →");
    }
}
