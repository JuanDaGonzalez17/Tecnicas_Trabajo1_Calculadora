/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;
public class OperadoresCondicionalesYCadenas {
    private boolean valor1;
    private boolean valor2;
    private String cadena1;
    private String cadena2;

    public OperadoresCondicionalesYCadenas(boolean valor1, boolean valor2, String cadena1, String cadena2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.cadena1 = cadena1;
        this.cadena2 = cadena2;
    }

    public void operacionAND() {
        System.out.println("Operación AND:");
        System.out.println(valor1 + " AND " + valor2 + " = " + (valor1 && valor2));
        System.out.println("Explicación: Usa el operador AND representado por \"&&\" para retornar un valor booleano");
    }

    public void operacionOR() {
        System.out.println("Operación OR:");
        System.out.println(valor1 + " OR " + valor2 + " = " + (valor1 || valor2));
        System.out.println("Explicación: Usa el operador OR representado por \"||\" para retornar un valor booleano");
    }

    public void operacionNOT() {
        System.out.println("Operación NOT sobre el primer valor:");
        System.out.println("NOT " + valor1 + " = " + (!valor1));
        System.out.println("Explicación: Usa el operador NOT representado por \"!\" para cambiar el valor de un booleano a su contrario");
    }

    public void operacionNOTSegundo() {
        System.out.println("Operación NOT sobre el segundo valor:");
        System.out.println("NOT " + valor2 + " = " + (!valor2));
        System.out.println("Explicación: Usa el operador NOT representado por \"!\" para cambiar el valor de un booleano a su contrario pero con el segundo valor booleano ingresado");
    }
    
    public void operacionTernario() {
        System.out.println("Operación Ternaria:");
        String resultado = (valor1 == valor2) ? "Los valores booleanos son iguales" : "Los valores booleanos son diferentes";
        System.out.println(resultado);
        System.out.println("""
                           Explicación: Aplica un condicional if-else para comprobar una condición y ejecutar una acción 
                           usando la siguiente notación: (condición a evaluar) ? acción si se cumple : acción si no se cumple""");
    }

    public void operacionesConCadenas() {
        System.out.println("Operaciones con cadenas:");
        System.out.println("Cadena1: " + cadena1);
        System.out.println("Cadena2: " + cadena2);
        System.out.println("Concatenación: " + cadena1 + " " + cadena2);
        System.out.println("Explicaión: concatena las cadenas usando el símbolo \"+\"");
        System.out.println("¿Cadena1 igual Cadena2?: " + cadena1.equals(cadena2));
        System.out.println("Explicaión: compara las cadenas usando la función .equals() así: cadena1.equals(cadena2)");
        System.out.println("¿Cadena1 contiene Cadena2?: " + cadena1.contains(cadena2));
        System.out.println("Explicaión: verifica si la cadena1 contiene la cadena2 usando la función .contains() así: cadena1.contains(cadena2)");
    }
}