/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ar.edu.unlar;

import ar.edu.unlar.objetos.Accion;
import ar.edu.unlar.objetos.Cliente;
import ar.edu.unlar.objetos.Cuenta;
import ar.edu.unlar.objetos.CuentaAhorro;
import ar.edu.unlar.objetos.CuentaInversion;
import java.util.ArrayList;


/**
 *
 * @author maxi
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creamos un cliente
        Cliente cliente = new Cliente("Juan", "Av. Los Alamos 123", new ArrayList<Cuenta>());

        // Creamos una cuenta de ahorros para el cliente
        CuentaAhorro cuentaAhorros = new CuentaAhorro(0.02, 5000.0, 205247);

        // Creamos una cuenta de inversión para el cliente
        CuentaInversion cuentaInversion = new CuentaInversion(0.07, new ArrayList<Accion>(), (float) 4000.0,25456);

        // Creamos una acción
        Accion accion = new Accion(5, 1500.0);

        

        // Imprimimos el saldo de las cuentas
        System.out.println("Saldo de la cuenta de ahorros: " + cuentaAhorros.getSaldo());
        System.out.println("Saldo de la cuenta de inversión: " + cuentaInversion.getSaldo());
    }
}

