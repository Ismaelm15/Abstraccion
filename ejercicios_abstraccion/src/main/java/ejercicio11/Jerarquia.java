/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.ArrayList;

/**
 *
 * @author ismae
 */
public class Jerarquia{
    public static void main(String[] args) {
        ArrayList<Figura> figuras=new ArrayList<>();
        figuras.add(new Rectangulo(10,12));
        figuras.add(new Triangulo(10,5));
        figuras.add(new Romboide(15,5));
        for (Figura f: figuras){
            System.out.println("Area: "+f.calcularArea());
        }
    }

}
