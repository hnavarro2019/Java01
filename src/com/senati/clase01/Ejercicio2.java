package com.senati.clase01;
/*
 * 
 * Ejercicio 2
   Realizar un ejercicio que intercambie el valor de dos 
   variables, es decir crearemos e inicializaremos 
   la variable x igual 5 y la variable y a 2. 
   Cuando finalice el programa y deberá contener 
   5 y x contendrá 2.

 * 
 */

public class Ejercicio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=2;
		
		System.out.println(x);
        System.out.println(y);
        
        System.out.println("-------------");
        
		int aux=x;
		x=y;
		y=aux;
		

        System.out.println(x);
        System.out.println(y);	
	}
	
}
