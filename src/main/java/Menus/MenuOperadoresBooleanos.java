package Menus;

import Util.Lectura;
import Source.OperadoresBooleanos;

public class MenuOperadoresBooleanos {
    private OperadoresBooleanos op;

    public MenuOperadoresBooleanos() {
        op = new OperadoresBooleanos();
        op.pedirDatos();
    }

    public void ejectuarMenuOperadoresBooleanos(){
        int opcion;

        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. AND Booleano");
            System.out.println("2. OR booleano");
            System.out.println("3. NOT");
            System.out.println("4. AND Evaluando Ambos");
            System.out.println("5. OR Evaluando Ambos");
            System.out.println("6. XOR");
            System.out.println("0. Salir");
            opcion = Lectura.leerInteger("Elija una opcion: ");

            switch (opcion){
                case 1:
                    op.andBool();
                    break;
                case 2:
                    op.orBool();
                    break;
                case 3:
                    op.not();
                    break;
                case 4:
                    op.andAmbos();
                    break;
                case 5:
                    op.orAmbos();
                    break;
                case 6:
                    op.xor();
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
