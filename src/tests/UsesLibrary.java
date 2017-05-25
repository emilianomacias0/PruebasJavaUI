
package tests;

import demolibrary.DemoLibrary;


public class UsesLibrary {
 
    public static void main(String[] args) {
           DemoLibrary lb = new DemoLibrary();
             int suma = lb.Suma(lb.Suma(23,56),lb.Suma(80,5));
             int resta = lb.Resta(55, 21);
             int suma2 = lb.Suma2(2, 15, 86);
             System.out.println("Suma " + suma);
             System.out.println("Resta " + resta);
             System.out.println("Suma " + suma2);
    }
}
