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
public class CuentaCorriente extends Cuenta{
    double interes=0.015;
    double saldoMinimo=500;

    public CuentaCorriente(Persona cliente) {
        super(cliente);
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "interes=" + interes + ", saldoMinimo=" + saldoMinimo + '}';
    }

    @Override
    public void retirar(double dinero){
    if(Cuenta.getSaldo()-dinero<saldoMinimo){
        System.out.println("No se puede sacar el dinero solicitado lo sentimos");
    }else{Cuenta.setSaldo(Cuenta.getSaldo()-dinero);
        System.out.println("Aqui tiene su dinero gracias");
    }
    }
    
    @Override
    public void actualizarSaldo(double saldo){
    if (Cuenta.getSaldo()>1000){
    Cuenta.setSaldo(Cuenta.getSaldo()+saldoMinimo*interes);
    }else{
    Cuenta.setSaldo(Cuenta.getSaldo()+Cuenta.getSaldo()*interes);
    }
    }
    
}
