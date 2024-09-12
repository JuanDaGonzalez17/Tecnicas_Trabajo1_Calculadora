package Source;

import Util.Lectura;

public class OperadoresBooleanos {
    private boolean num1;
    private boolean num2;

    public boolean isNum1() {
        return num1;
    }

    public void setNum1(boolean num1) {
        this.num1 = num1;
    }

    public boolean isNum2() {
        return num2;
    }

    public void setNum2(boolean num2) {
        this.num2 = num2;
    }

    public void pedirDatos(){
        setNum1(Lectura.leerBoolean("Ingrese un valor `true` o `false`, para probar con los operadores: "));
        setNum2(Lectura.leerBoolean("Ingrese un valor `true` o `false`, para probar con los operadores: "));
    }
    public void andBool(){
        System.out.println("Realiza la operacion logica de conjuncion ");
        System.out.println("Retornar verdadero cuando ambos son verdaderos, si uno es falso retorna falso.");
        System.out.println("Hay que tener cuidado ya que si el primer valor es falso, toma la conjuncion como falsa y no evalua el segundo valor.");
        System.out.println(isNum1() + " && " + isNum2() + " = " + (isNum1() && isNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void orBool(){
        System.out.println("Realiza la operacion logica de disyuncion ");
        System.out.println("Retornar verdadero cuando uno de los dos es verdadero, si los dos son falsos retorna falso.");
        System.out.println("Hay que tener cuidado ya que si el primer valor es verdadero, toma la disyuncion como verdadera y no evalua el segundo valor.");
        System.out.println(isNum2() + " || " + isNum2() + " = " + (isNum1() || isNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void not(){
        System.out.println("Cambia el valor de logico");
        System.out.println("Retorna verdadero cuando se le ingresa un valor falso.");
        System.out.println("! " + isNum1() + " = " + !isNum2());
    }
    public void andAmbos(){
        System.out.println("Funciona igual que el AND normal, con la condicion de que siempre evalua ambos operandos");
        System.out.println(isNum1() + " & " + isNum2() + " = " + (isNum1() & isNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void orAmbos(){
        System.out.println("Funciona igual que el OR normal, con la condicion de que siempre evalua ambos operandos");
        System.out.println(isNum1() + " | " + isNum2() + " = " + (isNum1() | isNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void xor(){
        System.out.println("Retorna verdadero cuando los operarandos tienen valores diferentes.");
        System.out.println(isNum1() + " ^ " + isNum2() + " = " + (isNum1() ^ isNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
}
