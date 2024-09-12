/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;


/**
 *
 * @author L E N O V O
 */
public class OperadoresIncrementales {
    private int valor;

    public OperadoresIncrementales(int valorInicial) {
        this.valor = valorInicial;
    }

    public void incrementar() {
        valor++;  
    }

    public void decrementar() {
        valor--;  
    }

    public void sumarAInicial(int cantidad) {
        valor += cantidad;  
    }

    public void restarAInicial(int cantidad) {
        valor -= cantidad;  
    }

    public void multiplicarAInicial(int cantidad) {
        valor *= cantidad;  
    }

    public void dividirAInicial(int cantidad) {
        if (cantidad != 0) {
            valor /= cantidad;  
        } else {
            System.out.println("Error: No se puede dividir entre 0.");
        }
    }

    public void moduloAInicial(int cantidad) {
        if (cantidad != 0) {
            valor %= cantidad; 
        } else {
            System.out.println("Error: No se puede hacer módulo con 0.");
        }
    }

    public int getValor() {
        return valor;
    }
}
