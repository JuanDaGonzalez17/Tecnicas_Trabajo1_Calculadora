package Source;

public class OperadoresBits {
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

    public OperadoresBits (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void convertirBits(){
        setNum1(Integer.parseInt(Integer.toBinaryString(getNum1())));
        setNum2(Integer.parseInt(Integer.toBinaryString(getNum2())));
    }

    public void and(){
        System.out.println("Operación AND(&): ");
        System.out.println("Multiplica los bits de las dos cadenas (1x1 = 1 -- 1x0 = 0 -- 0x0 = 0): ");
        System.out.println(getNum1() + " &");
        System.out.println(getNum2());
        System.out.println("-------");
        System.out.println(getNum1() & getNum2());
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void or(){
        System.out.println("Operación OR(|): ");
        System.out.println("Multiplica los bits de las dos cadenas (1x1 = 1 -- 1x0 = 1 -- 0x0 = 0): ");
        System.out.println(getNum1() + " |");
        System.out.println(getNum2());
        System.out.println("-------");
        System.out.println(getNum1() | getNum2());
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void xor(){
        System.out.println("Operación XOR(^) mas conocido como or exclusivo: ");
        System.out.println("Multiplica los bits de las dos cadenas (1x1 = 0 -- 1x0 = 1 -- 0x0 = 0): ");
        System.out.println(getNum1() + " ^");
        System.out.println(getNum2());
        System.out.println("-------");
        System.out.println(getNum1() ^ getNum2());
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void not(){
        System.out.println("Operación NOT(~) mas conocido como negacion: ");
        System.out.println("Nos permiter invertir el contenido de bits de una cadena, convirtiendo los 0 en 1 y los 1 en 0: ");
        System.out.println("~ " + getNum1());
        System.out.println("-------");
        System.out.println(~getNum1());
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void desplazamientoIzquierda(){
        System.out.println("Operacion Desplazamiento a la Izquierda: ");
        System.out.println("""
                           Desplaza hacia la izquierda tantas veces como indique el segundo valor binario(en nuestro caso 2), 
                           los bits se mueven a la izquierda y se añaden tantos ceros como indique el segundo valor binario""");
        System.out.println(getNum1() + " << " + 2 + " = " + (getNum1() << 2));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void desplazamientoDerecha(){
        System.out.println("Operacion Desplazamiento a la Derecha: ");
        System.out.println("Desplaza hacia la derecha tantas veces como indique el segundo valor binario, mete digitos por la izquierda y va eliminando el ultimo digito");
        System.out.println("Si se tiene que meter un 1 o un 0 dependera del valor del bit del signo, si es positivo(0) inserta un 0 y si es negativo(1) inserta un 1");
        System.out.println(getNum1() + " >> " + 2 + " = " + (getNum1() >> 2));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
    public void desplazamientoDerechaSinSigno(){
        System.out.println("Operacion Desplazamiento a la Derecha: ");
        System.out.println("Funciona igual que el desplazamiento hacia la derecha solo que no toma en cuenta el signo y siempre agrega 0 a la izquierda: ");
        System.out.println(getNum1() + " >>> " + 2 + " = " + (getNum1() >>> 2));
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
    }
}
