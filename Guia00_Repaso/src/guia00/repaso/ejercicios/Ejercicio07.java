package guia00.repaso.ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que genere un número entero aleatorio entre ​0 y ​1000 y
 * le pida al usuario que lo adivine, si el usuario acierta debe responder con
 * la cantidad de intentos y si el usuario no quiere continuar adivinando debe
 * ingresar ​'*' y entonces debe mostrar cuál era el número.
 */
public class Ejercicio07 {
    private int numeroAleatorio = generarNumeroAleatorio();
    private int intentos = 0;
    private boolean adivinado = false;
    private int numeroMax = 1000;
    
    private int generarNumeroAleatorio(){
        return (int) Math.random()* this.numeroMax + 1;
    } 
    
    public void iniciarIntentos() {
        System.out.println("Adivine un número entre el 0 y el " + this.numeroMax);
        Scanner sc = new Scanner(System.in);
        String ingreso;
        do {
            ingreso = sc.nextLine();
            if (ingreso == "*") {
                break;
            }
            if (Integer.parseInt(ingreso) == this.numeroAleatorio) {
                this.adivinado = true;
            }
            this.intentos++;
        } while (!this.adivinado);
        
        mostrarResultados();
    }
    
    public void mostrarResultados(){
        System.out.println("-----------------------------");
        System.out.println(" Intentos: " + this.intentos);
        System.out.println(" Adivinado; " + this.adivinado);
        System.out.println(" Número: " + this.numeroAleatorio);
        System.out.println("-----------------------------");
    }
            
    
}
