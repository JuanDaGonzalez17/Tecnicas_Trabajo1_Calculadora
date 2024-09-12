package Menus;

import Source.OperadoresCondicionalesYCadenas;
import Util.Lectura;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class MenuOperadoresCondicionalesYCadenas {
    private OperadoresCondicionalesYCadenas op;

    public MenuOperadoresCondicionalesYCadenas(boolean valor1, boolean valor2, String cadena1, String cadena2) {
        op = new OperadoresCondicionalesYCadenas(valor1, valor2, cadena1, cadena2);
    }

    public void ejecutarMenuOperadoresCondYCad() {
        int opcion;

        do {
            System.out.println("\nMenú de Operaciones Condicionales y Cadenas:");
            System.out.println("1. Operación AND");
            System.out.println("2. Operación OR");
            System.out.println("3. Operación NOT (primer valor)");
            System.out.println("4. Operación NOT (segundo valor)");
            System.out.println("5. Operación Ternaria");
            System.out.println("6. Operaciones con Cadenas");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");

            opcion = Lectura.leerInteger("");  

            switch (opcion) {
                case 1:
                    op.operacionAND();
                    break;
                case 2:
                    op.operacionOR();
                    break;
                case 3:
                    op.operacionNOT();
                    break;
                case 4:
                    op.operacionNOTSegundo();
                    break;
                case 5:
                    op.operacionTernario();
                    break;
                case 6:
                    op.operacionesConCadenas();
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