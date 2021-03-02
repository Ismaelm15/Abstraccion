/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author ismae
 */
public class Gerente extends Trabajador{

    String sueldo;
    public Gerente(String nombre, String apellido1, String NIF, String sueldo) {
        super(nombre, apellido1, NIF);
        this.sueldo=sueldo;
    }

    
    @Override
    public void cotizar() {
        System.out.println("Cotizo como un gernete");
    }
    
    
}
