/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.objetos;

/**
 *
 * @author maxi
 */
public class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(double tasaInteres, double saldo, int numeroCuenta) {
        super(saldo, numeroCuenta);
        this.tasaInteres = tasaInteres;
        
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    public void calcularIntereses() {
        saldo += saldo * tasaInteres;
    }
}
