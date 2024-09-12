/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Lectura {

    public static String leerString(String texto) {
        BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print(texto);
            return bIn.readLine();  
        } catch (IOException e) {
            System.err.println("Error de IO al leer el dato: " + e.getMessage());
        }
        return "";  // Retorna una cadena vacía si hay error (Porque estaba dando error por no tener un return)
    }

    public static double leerDouble(String texto) {
        BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));
        double retornar = 0;
        boolean esValido = false;

        while (!esValido) {
            try {
                System.out.print(texto);
                retornar = Double.parseDouble(bIn.readLine());
                esValido = true;
            } catch (NumberFormatException e) {
                System.err.println("Debe ingresar un número válido.");
            } catch (IOException e) {
                System.err.println("Error de IO al leer el dato: " + e.getMessage());
            }
        }
        return retornar;
    }

    public static int leerInteger(String texto) {
        BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));
        int retornar = 0;
        boolean esValido = false;

        while (!esValido) {
            try {
                System.out.print(texto);
                retornar = Integer.parseInt(bIn.readLine());
                esValido = true;  
            } catch (NumberFormatException e) {
                System.err.println("Debe ingresar un número válido.");
            } catch (IOException e) {
                System.err.println("Error de IO al leer el dato: " + e.getMessage());
            }
        }
        return retornar;
    }
    
    public static boolean leerBoolean(String texto) {
        BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));
        boolean retornar = false;
        boolean esValido = false;

        while (!esValido) {
            try {
                System.out.print(texto);
                String input = bIn.readLine().toLowerCase();
                if (input.equals("true") || input.equals("false")) {
                    retornar = Boolean.parseBoolean(input);
                    esValido = true;
                } else {
                    System.err.println("Debe ingresar 'true' o 'false'.");
                }
            } catch (IOException e) {
                System.err.println("Error de IO al leer el dato: " + e.getMessage());
            }
        }
        return retornar;
    }
}
