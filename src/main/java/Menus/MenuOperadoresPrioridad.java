package Menus;

import Source.OperadoresPrioridad;
import Util.Lectura;

public class MenuOperadoresPrioridad {
    private OperadoresPrioridad op;

    public MenuOperadoresPrioridad(){
        op = new OperadoresPrioridad();
    }

    public void ejectuarMenuOperadoresPrioridad(){
        int opcion;

        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Tabla Completa de Prioridad");
            System.out.println("2. Tabla de prioridad de operadores aritmeticos");
            System.out.println("0. Salir");
            opcion = Lectura.leerInteger("Elija una opcion: ");

            switch (opcion){
                case 1:
                    op.prioridadTabla();
                    op.prioridadCombinados();
                    break;
                case 2:
                    op.prioridadOperadoresAritmeticos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }while (opcion != 0);
    }
}
