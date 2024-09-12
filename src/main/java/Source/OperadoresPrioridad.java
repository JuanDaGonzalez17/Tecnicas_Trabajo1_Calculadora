package Source;

public class OperadoresPrioridad {
    public void prioridadTabla(){
        System.out.println("El orden de precedencia de los operadores es: ");
        System.out.println("Unario: \t ++, --, ~, !");
        System.out.println("Multiplicacion: \t *, /, %");
        System.out.println("Adición: \t +, -");
        System.out.println("Cambio: \t <<, >>, >>>");
        System.out.println("Relacional: \t <, >, <=, >=");
        System.out.println("Igualdad: \t ==, !=");
        System.out.println("`Y` de bits: \t &");
        System.out.println("`O` de bits exclusivo: \t ^ ");
        System.out.println("`XOR` de bits inclusivo: \t |");
        System.out.println("`Y` logico: \t &&");
        System.out.println("`O` logico: \t ||");
        System.out.println("Operador ternario: \t ?:");
        System.out.println("Asignación: \t =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=");
    }
    public void prioridadOperadoresAritmeticos(){
        System.out.println("Parentesis: \t ( )");
        System.out.println("Potencias: \t Con el metodo pow de la clase Math");
        System.out.println("Multiplicacion: \t *, /, %");
        System.out.println("Adición: \t +, -");
        System.out.println("""
                           Cuando las combinamos todas se empieza con los parentesis y por defecto las operaciones se hacen de izquierda a derecha 
                           siguiendo la prioridad entre operadores artimeticos mencionada anteriormente""");
                                                                                    
    }
    public void prioridadCombinados(){
        System.out.println("""
                           \nCuando hacemos varias operaciones combinadas la prioridad son los parentesis y 
                           luego se opera de izquierda a derecha con la prioridad de operadores que vimos anteriormente.""");
    }
}
