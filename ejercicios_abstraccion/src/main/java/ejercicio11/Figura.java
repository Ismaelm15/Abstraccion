/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author ismae
 */
public abstract class Figura {
   protected double  base;
   protected double  altura;

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
   
   
   
   public abstract double calcularArea();
}
