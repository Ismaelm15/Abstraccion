/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author ismae
 */
public abstract class Vehiculo {

    private int bastidor;

    public final void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }

    public abstract int getVelocidad();
}
//Si puede ya que la clase no puede ser final

//No solo el getVelocidad ya que es abstract por lo tanto debe sobreescribirse