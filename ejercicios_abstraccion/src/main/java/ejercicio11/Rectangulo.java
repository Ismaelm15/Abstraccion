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
public class Rectangulo extends Figura {

    double area;

    public Rectangulo(double base, double altura) {
        super(base, altura);

    }

    @Override
    public double calcularArea() {
        double area;
        return area = this.base * this.altura;
    }

}
