package Menus;


import Util.Lectura;
import Source.OperadoresBits;

public class MenuOperadoresBits {
    private OperadoresBits op;

    public MenuOperadoresBits(int num1, int num2) {
        op = new OperadoresBits(num1, num2);
        op.convertirBits();
    }

    public void ejecutarMenuOperadoresBits(){
        int opcion;

        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. AND");
            System.out.println("2. OR");
            System.out.println("3. XOR");
            System.out.println("4. NOT");
            System.out.println("5. Desplazamiento Izquierda");
            System.out.println("6. Desplazamiento Derecha");
            System.out.println("7. Desplazamiento Derecha sin Signo");
            System.out.println("0. Salir");
            opcion = Lectura.leerInteger("Elija una opcion: ");

            switch (opcion){
                case 1:
                    op.and();
                    break;
                case 2:
                    op.or();
                    break;
                case 3:
                    op.xor();
                    break;
                case 4:
                    op.not();
                    break;
                case 5:
                    op.desplazamientoIzquierda();
                    break;
                case 6:
                    op.desplazamientoDerecha();
                    break;
                case 7:
                    op.desplazamientoDerechaSinSigno();
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
