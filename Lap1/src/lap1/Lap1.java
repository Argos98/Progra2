package lap1;

import cl.capaLogica;
import java.io.IOException;
import java.util.Scanner;

public class Lap1 {

    static capaLogica cl = new capaLogica();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        ejecutarPrograma();
    }

    static void ejecutarPrograma() throws IOException {
        ejecutarMenu();
    }

    static void ejecutarMenu() throws IOException {
        int opcion;
        boolean noSalir = true;

        do {
            mostrarMenu();
            opcion = leerOpcion();
            noSalir = ejecuatarAccion(opcion);
        } while (noSalir);
    }

    static void mostrarMenu() {
        System.out.println("**************************************************");
        System.out.println("*          1.Registrar Inquilino                 *");
        System.out.println("*          2.Registrar Propiedad                 *");
        System.out.println("*          3.Listar Inquilinos                   *");
        System.out.println("*          4.Listar Propiedades                  *");
        System.out.println("*          5.Salir                               *");
        System.out.println("**************************************************");

    }

    static int leerOpcion() throws IOException {

        int opccion;

        System.out.println("Seleccione una opccion: ");
        opccion = sc.nextInt();
        System.out.println();

        return opccion;
    }

    static boolean ejecuatarAccion(int opccion) {

        boolean noSalir = true;

        switch (opccion) {
            case 1:
                registrarInquilino();
                break;

            case 2:
                registrarPropiedad();
                break;

            case 3:
                listarInquilinos();
                break;

            case 4:
                listarPropiedades();
                break;

            case 5:
                noSalir = false;
                break;
        }

        return noSalir;
    }

    static void registrarInquilino() {

        String nombre;
        String apellidos;
        String correo;
        String direcciopn;
        String telefono;
        String identificacion;
        String genero;

        int validacion = -4;

        System.out.println("Digite la identificacion del inquilino");
        identificacion = sc.next();

        validacion = cl.validarInquilinos(identificacion);

        if (validacion == 1) {
            System.out.println("Digite el nombre del inquilino: ");

            nombre = sc.next();

            System.out.println("Digite los apellidos del inquilino: ");
            apellidos = sc.next();

            System.out.println("Digite el correo electronico del inquilino");
            correo = sc.next();

            System.out.println("Digite la dirrecion del inquilino");
            direcciopn = sc.next();

            System.out.println("Digite el telefono del inquilino");
            telefono = sc.next();

            System.out.println("Digite el genero");
            genero = sc.next();

            cl.registrarInquilino(nombre, apellidos, correo, direcciopn, telefono, identificacion, genero);
        } else {

            if (validacion == 2) {

                System.out.println("**************************************************");
                System.out.println("    Esta identificaicon ya existe diguite otra");
                System.out.println("**************************************************");

                System.out.println();

                String confirmacion;
                System.out.println("Escriba OK para continuar: ");
                confirmacion = sc.next();
                System.out.println("");
                  
              
            }
        }

    }

    static void listarInquilinos() {
        for (String var : cl.getInquilinos()) {
            System.out.println(var.toString());

        }
    }

    static void registrarPropiedad() {
        String codigo;
        String nombre;
        String valor;
        String direccion;
        String residencial;
        String numeroCasa;
        String patio;
        String numeroHabitaciones;

        System.out.println("Digite un codigo para la Propiedad:");
        codigo = sc.next();

        System.out.println("Digite un nombre para la Propiedad:");
        nombre = sc.next();

        System.out.println("Digite el valor de la Propiedad:");
        valor = sc.next();

        System.out.println("Digite la direccion de la Propiedad:");
        direccion = sc.next();

        System.out.println("Digite el residencial donde se encuentra la Propiedad:");
        residencial = sc.next();

        System.out.println("Digite el numero de casa de la propiedad:");
        numeroCasa = sc.next();

        System.out.println("Digite si tiene patio o no la casa");
        patio = sc.next();

        System.out.println("Digite el nuemro de habitaciones totales de la Propiedad:");
        numeroHabitaciones = sc.next();

        cl.registrarPropiedad(codigo, nombre, valor, direccion, residencial, numeroCasa, patio, numeroHabitaciones);

    }

    static void listarPropiedades() {
        for (String var : cl.getPropiedades()) {
            System.out.println(var.toString());

        }
    }

}
