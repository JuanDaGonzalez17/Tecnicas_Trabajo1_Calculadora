package Source;

public class OperadoresRelacionales {
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

    public OperadoresRelacionales(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void mayor(){
        System.out.println("Operación Relacional (mayor): ");
        System.out.println("Compara los dos numeros, mira si el primer numero es mayor que el segundo y retorna True or False: ");
        System.out.println(getNum1() + " > " + getNum2() + " Retorna: " + (getNum1() > getNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }

    public void menor(){
        System.out.println("Operación Relacional (menor): ");
        System.out.println("Compara los dos numeros, mira si el primer numero es menor que el segundo y retorna True or False: ");
        System.out.println(getNum1() + " < " + getNum2() + " Retorna: " + (getNum1() < getNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }

    public void mayorIgual(){
        System.out.println("Operación Relacional (mayor o igual): ");
        System.out.println("Compara los dos numeros, mira si el primer numero es mayor o igual que el segundo y retorna True or False: ");
        System.out.println(getNum1() + " >= " + getNum2() + " Retorna: " + (getNum1() >= getNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }

    public void menorIgual(){
        System.out.println("Operación Relacional (menor o igual): ");
        System.out.println("Compara los dos numeros, mira si el primer numero es menor o igual que el segundo y retorna True or False: ");
        System.out.println(getNum1() + " <= " + getNum2() + " Retorna: " + (getNum1() <= getNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }

    public void igualdad(){
        System.out.println("Operación Relacional (Igualdad): ");
        System.out.println("""
                           A diferencia de los otros operadores relacionales, este trabaja con cualquier tipo de dato, 
                           pero normalmente no se usa con objetos, para comparar objetos se usa el metodo (equals), 
                           ya que la igualdad compara si los dos estan guardados en la misma referencia en la memoria RAM""");
        System.out.println("Compara los dos numeros, mira si el primer dato es igual al segundo y retorna True or False: ");
        System.out.println(getNum1() + " == " + getNum2() + " Retorna: " + (getNum1() == getNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }

    public void desigualdad(){
        System.out.println("Operación Relacional (Desigualdad): ");
        System.out.println("A diferencia de los otros operadores relacionales, este trabaja con cualquier tipo de dato, pero normalmente no se usa con objetos, para comparar objetos se usa el metodo (equals), ya que la desigualdad compara si los dos estan guardados en la misma referencia en la memoria RAM");
        System.out.println("Compara los dos numeros, mira si el primer dato es igual al segundo y retorna True or False: ");
        System.out.println(getNum1() + " != " + getNum2() + " Retorna: " + (getNum1() != getNum2()));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }

}
