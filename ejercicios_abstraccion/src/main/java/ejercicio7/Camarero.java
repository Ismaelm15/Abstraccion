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
public class Camarero extends Trabajador{
    // Único atributo propio de Camarero
    private String rango;

    public Camarero(String rango, String nombre, String apellido1, 
			String NIF) {
		// Llamada al constructor de la superclase
        super(nombre, apellido1, NIF);
        this.rango = rango;
    }
    
    // Método propio de camarero
    public void servirMesa(){
        System.out.println("Objeto Camarero: Sirviendo una mesa");
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
 
   

    @Override
	// Método sobrescrito
    public void cotizar() {
        System.out.println("Cotizando como Camarero");
    }
   }

