/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;


import Util.Lectura;
import Source.OperadoresIncrementales;

public class MenuOperadoresIncrementales {
    private OperadoresIncrementales op;  

    public MenuOperadoresIncrementales(int valorInicial) {
        op = new OperadoresIncrementales(valorInicial);
    }

    public void ejecutarMenuOperadoresIncre() {
        int opcion;

        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Incrementar");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("6. Módulo");
            System.out.println("7. Decrementar");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");

            opcion = Lectura.leerInteger("");  

            switch (opcion) {
                case 1:
                    op.incrementar();
                    System.out.println("Después de incrementar: " + op.getValor());
                    System.out.println("Explicación: Cuando se usa esta opción el número ingresado aumenta en 1 usando la operació ++");
                    break;
                case 2:
                    int suma = Lectura.leerInteger("Ingresa la cantidad a sumar: ");
                    op.sumarAInicial(suma);
                    System.out.println("Después de sumar " + suma + ": " + op.getValor());
                    System.out.println("Explicación: Cuando se usa esta opción el número ingresado aumenta en "+suma+" usando la operació +=");
                    break;
                case 3:
                    int resta = Lectura.leerInteger("Ingresa la cantidad a restar: ");
                    op.restarAInicial(resta);
                    System.out.println("Después de restar " + resta + ": " + op.getValor());
                    System.out.println("Explicación: Cuando se usa esta opción el número ingresado decrementa en "+resta+" usando la operació -=");
                    break;
                case 4:
                    int multiplicacion = Lectura.leerInteger("Ingresa la cantidad para multiplicar: ");
                    op.multiplicarAInicial(multiplicacion);
                    System.out.println("Después de multiplicar por " + multiplicacion + ": " + op.getValor());
                    System.out.println("Explicación: Cuando se usa esta opción el número ingresado se multiplica por "+multiplicacion+" y se vuelve a asignar usando la operació *=");
                    break;
                case 5:
                    int division = Lectura.leerInteger("Ingresa la cantidad para dividir: ");
                    op.dividirAInicial(division);
                    System.out.println("Después de dividir entre " + division + ": " + op.getValor());
                    System.out.println("Explicación: Cuando se usa esta opción el número ingresado se divide por "+division+" y se vuelve a asignar usando la operació /=");
                    break;
                case 6:
                    int modulo = Lectura.leerInteger("Ingresa la cantidad para módulo: ");
                    op.moduloAInicial(modulo);
                    System.out.println("Después de hacer módulo " + modulo + ": " + op.getValor());
                    System.out.println("Explicación: Cuando se usa esta opción el número ingresado se le saca el módulo por "+modulo+" y se asigna el valor obtenido usando la operació %=");
                    break;
                case 7:
                    op.decrementar();
                    System.out.println("Después de decrementar: " + op.getValor());
                    System.out.println("Explicación: Cuando se usa esta opción el número ingresado aumenta en 1 usando la operació --");
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
