/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean terminar = true;

        do {
           System.out.println("\n\tDatos del Docente");
            System.out.println("Ingrese los nombres del docente");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese la cédula del docente");
            String cedula = entrada.nextLine();

            System.out.printf("\n%s\n%s\n%s\n%s\n\n%s",
                    "Menu",
                    "1. Ingresar un Docente Nombremiento",
                    "2. Ingresar un Docente Factura",
                    "0. Salir",
                    "Elija una opción: ");

            int opcion;
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese el valor del sueldo");
                    double sueldo = entrada.nextDouble();
                    System.out.println("Ingrese el valor de las horas extra");
                    double valorHoras = entrada.nextDouble();
                    System.out.println("Ingrese el numero de horas");
                    int horas = entrada.nextInt();
                    entrada.nextLine();

                    DocenteNombramiento docenteN = new DocenteNombramiento();

                    //calculos del docente por nombramiento
                    docenteN.establerNombres(nombres);
                    docenteN.establerCedula(cedula);
                    docenteN.establecerValorSueldo(sueldo);
                    docenteN.establecerValorHoraExtra(valorHoras);
                    docenteN.establecerNumeroHoras(horas);
                    docenteN.calcularSueldo();

                    System.out.printf("\n%s\n", docenteN);

                    System.out.println("Docente Creado!");

                    break;
                case 2:

                    System.out.println("\nIngrese el valor de la factura");
                    double factura = entrada.nextDouble();
                    System.out.println("Ingrese el valor del descuento del "
                            + "iva en decimales");
                    double ivaDescuento = entrada.nextDouble();
                    entrada.nextLine();

                    DocenteFactura docenteFac = new DocenteFactura();

                    //calculos del docente por Factura
                    docenteFac.establerNombres(nombres);
                    docenteFac.establerCedula(cedula);
                    docenteFac.establecerValorFactura(factura);
                    docenteFac.establecerValorIvaDescuento(ivaDescuento);
                    docenteFac.calcularValorCancelar();

                    System.out.println("\nDocente Creado!");

                    System.out.printf("\n%s\n", docenteFac);
                    break;
                case 0:
                    System.out.println("\nCerrando el programa...");
                    terminar = false;
                    break;
                default:
                    System.out.println("\nError, opción no válida.");
            }
        } while (terminar);
    }

}
