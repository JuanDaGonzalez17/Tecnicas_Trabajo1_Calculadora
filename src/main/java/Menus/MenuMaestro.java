/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;

import Source.Separadores;
import Util.Lectura;



/**
 *
 * @author L E N O V O
 */
public class MenuMaestro {
    public static void ejecutarMenus(){
        int opcion;

        do {
            System.out.println("Elija una opción del menú maestro");
            System.out.println("\nMenú Maestro:");
            System.out.println("1. Menú operaciones aritméticas");
            System.out.println("2. Menú operaciones relacionales");
            System.out.println("3. Menú operaciones de bits");
            System.out.println("4. Menú operaciones de booleanos");
            System.out.println("5. Menú operaciones incrementales-aritméticas combinadas");
            System.out.println("6. Menú operaciones condicionales y de cadenas");
            System.out.println("7. Mostrar ejemplos de separadores");
            System.out.println("8. Mostrar Prioridad entre operadores.");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");

            opcion = Lectura.leerInteger("");  

            switch (opcion) {
                case 1:
                    int num1 = Lectura.leerInteger("Ingrese el primer valor numerico: ");
                    int num2 = Lectura.leerInteger("Ingrese el segundo valor numerico: ");
                    MenuOperadoresAritmeticos menuOA = new MenuOperadoresAritmeticos(num1, num2);
                    menuOA.ejecutarMenuOperadoresAritmeticos();
                    break;
                case 2:
                    int nume1 = Lectura.leerInteger("Ingrese el primer valor numerico: ");
                    int nume2 = Lectura.leerInteger("Ingrese el segundo valor numerico: ");
                    MenuOperadoresRelacionales menuOR = new MenuOperadoresRelacionales(nume1, nume2);
                    menuOR.ejecutarMenuOperadoresRelacionales();
                    break;
                case 3:
                    int numer1 = Lectura.leerInteger("Ingrese el primer valor numerico: ");
                    int numer2 = Lectura.leerInteger("Ingrese el segundo valor numerico: ");
                    MenuOperadoresBits menuOB = new MenuOperadoresBits(numer1, numer2);
                    menuOB.ejecutarMenuOperadoresBits();
                    break;
                case 4:
                    MenuOperadoresBooleanos menuOBool = new MenuOperadoresBooleanos();
                    menuOBool.ejectuarMenuOperadoresBooleanos();
                    break;
                case 5:
                    //Menú de Operadores Incrementales
                    MenuOperadoresIncrementales menuOI = new MenuOperadoresIncrementales(Lectura.leerInteger("Ingresa el valor inicial: "));    
                    menuOI.ejecutarMenuOperadoresIncre();
                    break;
                case 6:
                    //Menú Operadores Condicionales y de Cadenas
                    boolean valor1 = Lectura.leerBoolean("Ingresa el primer valor booleano (true/false): ");
                    boolean valor2 = Lectura.leerBoolean("Ingresa el segundo valor booleano (true/false): ");
                    String cadena1 = Lectura.leerString("Ingresa la primera cadena: ");
                    String cadena2 = Lectura.leerString("Ingresa la segunda cadena: ");
                    MenuOperadoresCondicionalesYCadenas menuOCYC = new MenuOperadoresCondicionalesYCadenas(valor1, valor2, cadena1, cadena2);
                    menuOCYC.ejecutarMenuOperadoresCondYCad();
                    break;
                case 7:
                    Separadores separadores = new Separadores();
                    separadores.imprimirSeparadores();
                    break;
                case 8:
                    MenuOperadoresPrioridad menuOP = new MenuOperadoresPrioridad();
                    menuOP.ejectuarMenuOperadoresPrioridad();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0); 
    }
        
}
