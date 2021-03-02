/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author ismae
 */
public class CuentaAhorro extends Cuenta {

    double interes;
    double comisionAnual;

    public CuentaAhorro(Persona cliente, double interes, double comisionAnual) {
        super(cliente);
        this.comisionAnual=comisionAnual;
        this.interes=interes;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "interes=" + interes + ", comisionAnual=" + comisionAnual + '}';
    }

    @Override
    public void retirar(double dinero) {
        if (Cuenta.getSaldo() - dinero > 0) {
            System.out.println("Tome su dinero");

        } else {
            System.out.println(" no se puede hacer nada lo siento");
        }

    }

    @Override
    public void actualizarSaldo(double saldo) {
        Cuenta.setSaldo(Cuenta.getSaldo()+(Cuenta.getSaldo()*interes)-comisionAnual);
    }

}
