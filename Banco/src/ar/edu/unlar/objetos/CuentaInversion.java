/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.objetos;

import java.util.ArrayList;

/**
 *
 * @author maxi
 */
public class CuentaInversion extends Cuenta {

    private double comision;
    private ArrayList<Accion> accion;

    public CuentaInversion(double comision, ArrayList<Accion> accion, double saldo, int numeroCuenta) {
        super(saldo, numeroCuenta);
        this.comision = comision;
        this.accion = accion;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public ArrayList<Accion> getAccion() {
        return accion;
    }

    public void setAccion(ArrayList<Accion> accion) {
        this.accion = accion;
    }
  public void comprarAcciones(Accion accion) {
       
        double valorTotal = accion.getCantidad() * accion.getPrecioCompra();
        double comisionTotal = valorTotal * comision;
        saldo -= valorTotal + comisionTotal;
    }

    public void venderAcciones(Accion accion) {
        
        double valorTotal = accion.getCantidad() * accion.getPrecioCompra();
        saldo += valorTotal;
    }
}
