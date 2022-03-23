/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12;

/**
 *
 * @author no Álvaro
 */
public class Prueba {
     public static void main(String[] args) {
        Persona p1 = new Persona("Antonio", "09117854P", 18);
        Persona p2 = new Persona("Antonia", "09117857K", 20);
        Cuenta cc1 = new CuentaCorriente();
        Cuenta ca1 = new CuentaAhorro();
        
        System.out.println("CUENTA CORRIENTE");
        System.out.println(cc1.getSaldo());
        cc1.setSaldo(500);
        System.out.println(cc1.getSaldo());
        cc1.retirar(100000);
        cc1.actualizarSaldo();
        System.out.println(cc1.getSaldo());
        
        System.out.println("\nCUENTA DE AHORRO");
        System.out.println(ca1.getSaldo());
        ca1.setSaldo(500);
        System.out.println(ca1.getSaldo());
        ca1.retirar(100000);
        ca1.actualizarSaldo();
        System.out.println(ca1.getSaldo());
    }
}
