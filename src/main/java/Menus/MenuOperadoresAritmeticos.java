package Menus;

import Source.OperadoresAritmeticos;
import Util.Lectura;


public class MenuOperadoresAritmeticos {
    private OperadoresAritmeticos op;

    public MenuOperadoresAritmeticos(int num1, int num2) {
        op = new OperadoresAritmeticos(num1, num2);
        
    }
    public void ejecutarMenuOperadoresAritmeticos() {
        int opcion;

        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("0. Salir");
            opcion = Lectura.leerInteger("Elija una opcion: ");

            switch (opcion){
                case 1:
                    op.suma();
                    break;
                case 2:
                    op.resta();
                    break;
                case 3:
                    op.multiplicacion();
                    break;
                case 4:
                    op.division();
                    break;
                case 5:
                    op.modulo();
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