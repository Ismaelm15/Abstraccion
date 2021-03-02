/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author ismae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
     
        // Objeto de la superclase
        Gerente pedro = new Gerente ("pedro", "gil", "11qwe1hfk","1500" );
        Gerente juanjo = new Gerente ("juanjo", "moreno", "111hrtyfk","1500" );
        // Objeto de la subclase
      Camarero juan = new Camarero ("Jefe Sala", "juan", "mingolla", "111hfk" );
      Camarero carlos = new Camarero ("Raso", "carlos", "melgar", "111hkkfk" ); 

      ArrayList<Trabajador> lista=new ArrayList<>();
      lista.add(juan);
      lista.add(pedro);
      lista.add(juanjo);
      lista.add(carlos);
      
      for (Trabajador t: lista){
          t.cotizar();
      }
      
      
     }
}
