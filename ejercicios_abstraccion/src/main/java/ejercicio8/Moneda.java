/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Random;

/**
 *
 * @author ismae
 */
public class Moneda extends Azar {

    Random rnd = new Random();

    @Override
    public int lanzar() {
        int numero;
        return numero=rnd.nextInt(2)+1;
    }
    
}

