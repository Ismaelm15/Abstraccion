/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.ArrayList;

/**
 *
 * @author ismae
 */
public class pruebaLegislador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Legislador> legisladores = new ArrayList<>();
        legisladores.add(new Senador(500, "malaga", "pp","juan","gil"));
        legisladores.add(new Senador(150, "huelva", "psoe","pepe","moreno"));
        legisladores.add(new Senador(500, "cadiz", "podemos","salvador","marin"));
        legisladores.add(new Diputado(125, "malaga", "pp","pablo","mingolla"));
        legisladores.add(new Diputado(250, "huelva", "psoe","ismael","melgar"));
        legisladores.add(new Diputado(870, "cadiz", "podemos","juanjo","del campo"));

        for (Legislador l : legisladores) {
            System.out.println( l.toString());

        }
        for (Legislador l : legisladores) {
            System.out.println(l.getCamara());

        }
    }

}
