/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author Álvaro
 */
public class Palindromo {
    //ATRIBUTOS
    private boolean isPolidromo;
    private String palabra;
    private Scanner teclado;    //para pedir por teclado

    
    
    //CONSTRUCTORES
    public Palindromo(boolean isPolidromo, String palabra) {
        this.isPolidromo = isPolidromo;
        this.palabra = palabra;
        this.teclado = new Scanner(System.in);
    }
    
    public Palindromo() {
        this.isPolidromo = isPolidromo;
        this.palabra = palabra;
        this.teclado = new Scanner(System.in);  //para pedir por teclado
    }
    
    
    
    public void pedirPalabra() {
        System.out.println("Introduzca la palabra para comprobar si es un palindromo");
        palabra = teclado.next();
    }
}
