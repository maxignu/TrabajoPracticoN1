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
public class Cliente {
    private String nombre;
    private String direccion;
    private ArrayList<Cuenta>cuenta;

    public Cliente(String nombre, String direccion, ArrayList<Cuenta> cuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Cuenta> getCuenta() {
        return cuenta;
    }

    public void setCuenta(ArrayList<Cuenta> cuenta) {
        this.cuenta = cuenta;
    }

    public boolean addCuenta(Cuenta e) {
        return cuenta.add(e);
    }

    public boolean removeCuenta(Object o) {
        return cuenta.remove(o);
    }
    
}
