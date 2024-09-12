package Source;

import Util.Lectura;

public class OperadoresAritmeticos {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public OperadoresAritmeticos(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void suma(){
        System.out.println("Operación Suma: ");
        System.out.println("Adiciona los dos numeros: ");
        System.out.println(getNum1() + " + " + getNum2() + " = " + (getNum1() + getNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void resta(){
        System.out.println("Operacion Resta: ");
        System.out.println("Resta los dos numero: ");
        System.out.println(getNum1() + " - " + getNum2() + " = " + (getNum1() - getNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void multiplicacion(){
        System.out.println("Operación Multiplicación: ");
        System.out.println("Multiplica los numeros dados: ");
        System.out.println(getNum1() + " * " + getNum2() + " = " + (getNum1() * getNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

    }
    public void division(){
        System.out.println("Operacion División: ");
        System.out.println("Divide los numeros a excepción si el denominador es cero: ");
        int division;
        while(true){
            try {
                division = getNum1() / getNum2();
                break;
            }catch(ArithmeticException e){
                System.err.println("Ocurrio un error de Arithmetic Expression" + e);
                setNum2(Lectura.leerInteger("Ingrese un número diferente a cero: "));
            }
        }

        System.out.println(getNum1() + " / " + getNum2() + " = " + division);
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void modulo(){
        System.out.println("Operacion Modulo: ");
        System.out.println("Hace la division entera y devuelve el residuo de la division: ");
        System.out.println(getNum1() + " % " + getNum2() + " = " + (getNum1()/getNum2()));
        System.out.println("-----------------------------------------");
    }
}
