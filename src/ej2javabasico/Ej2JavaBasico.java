
package ej2javabasico;

public class Ej2JavaBasico {

    public static void main(String[] args) {
        
        double precioConIVA = sumaIVA(125.32);
        System.out.println("El precio con IVA es: " + String.format("%.2f", precioConIVA));        
        
    }
    static double sumaIVA(double precio){
        return precio * 1.21; // IVA en Argentina 21%
    }
}
