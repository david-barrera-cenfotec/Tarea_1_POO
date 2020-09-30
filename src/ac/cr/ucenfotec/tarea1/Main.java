package ac.cr.ucenfotec.tarea1;

import ac.cr.ucenfotec.tarea1.entidades.Cita;
import ac.cr.ucenfotec.tarea1.entidades.Duenio;
import ac.cr.ucenfotec.tarea1.entidades.Mascota;
import ac.cr.ucenfotec.tarea1.entidades.Reservacion;

import java.io.PrintStream;
import java.util.Scanner;


public class Main {

    private static Scanner input = new Scanner(System.in);
    private static PrintStream output = new PrintStream(System.out);

    public static Mascota[] arregloDeMascotas = new Mascota[50];
    public static Duenio[] arregloDeDuenios = new Duenio[50];
    public static Cita[] arregloDeCitas = new Cita[50];
    public static Reservacion[] arregloDeReservaciones = new Reservacion[50];


    public static void main(String[] args) {

        /* ********** Menu ********** */
        int opcion = 0;
                do{
                    mostrarMenu();
                    opcion = input.nextInt();
                    leerOpcionMenu(opcion);
                } while (opcion != 7);

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
        output.println("Ranking (entre 1 y 3 estrellas:");
        int ranking = input.nextInt();
        output.println("Enlace del archivo con la foto:");
        String foto = input.next();

        Mascota nuevaMascota = new Mascota(nombre, observaciones, ranking, foto, nuevoDuenio);
        arregloDeMascotas[0] = nuevaMascota;

    }

    // Opcion - 2: Listar las mascotas



    public static void leerOpcionMenu(int opcion){
        switch (opcion) {
            case 1:
            registrarMascota();

                break;
            case 2:
                output.println(arregloDeMascotas[0]);
                break;
            case 3:
            //Registrar cita

                break;
            case 4:
                //Listar citas

                break;
            case 5:
                //Registrar reservaciones

                break;
            case 6:
                //Listar reservaciones

                break;
            case 7:
                //Registrar usuario

                break;
            case 8:
                //Listar usaurios

                break;
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
