package Menus;

import Source.OperadoresRelacionales;
import Util.Lectura;

public class MenuOperadoresRelacionales {
    private OperadoresRelacionales op;

    public MenuOperadoresRelacionales(int num1, int num2) {
        op = new OperadoresRelacionales(num1, num2);
    }

    public void ejecutarMenuOperadoresRelacionales(){
        int opcion;

        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Mayor que");
            System.out.println("2. Menor que");
            System.out.println("3. Mayor o igual que");
            System.out.println("4. Menor o igual que");
            System.out.println("5. Igualdad");
            System.out.println("6. Desigualdad");
            System.out.println("0. Salir");
            opcion = Lectura.leerInteger("Elija una opcion: ");

            switch (opcion){
                case 1:
                    op.mayor();
                    break;
                case 2:
                    op.menor();
                    break;
                case 3:
                    op.mayorIgual();
                    break;
                case 4:
                    op.menorIgual();
                    break;
                case 5:
                    op.igualdad();
                    break;
                case 6:
                    op.desigualdad();
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
