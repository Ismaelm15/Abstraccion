/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

/**
 *
 * @author ismae
 */
public class Senador extends Legislador {

    private double complemento;

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String getCamara() {
        return "Senador";
    }

    @Override
    public String toString() {
        return super.toString()+"Senador{" + "complemento=" + complemento + '}';
    }



}
