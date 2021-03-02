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
public abstract class Cuenta {

    static String numeroCuenta;
    static double saldo;
    static Persona cliente;
    static int ncuenta = 0;

    public Cuenta(Persona cliente) {
        ncuenta++;
        this.numeroCuenta = String.format("%020d", ncuenta);
        this.saldo = 0;
        this.cliente = cliente;
    }

    public static String getNumeroCuenta() {
        return numeroCuenta;
    }

    public static void setNumeroCuenta(String numeroCuenta) {
        Cuenta.numeroCuenta = numeroCuenta;
    }

    public static double getSaldo() {
        return saldo;
    }

    public static void setSaldo(double saldo) {
        Cuenta.saldo = saldo;
    }

    public static Persona getCliente() {
        return cliente;
    }

    public static void setCliente(Persona cliente) {
        Cuenta.cliente = cliente;
    }

    public static int getNcuenta() {
        return ncuenta;
    }

    public static void setNcuenta(int ncuenta) {
        Cuenta.ncuenta = ncuenta;
    }

  


    public abstract void actualizarSaldo(double saldo);
    public abstract void retirar(double dinero);
}
