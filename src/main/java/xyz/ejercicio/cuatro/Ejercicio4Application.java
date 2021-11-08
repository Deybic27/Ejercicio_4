/*Hacer un programa que calcule el cuadrado de una suma*/
package xyz.ejercicio.cuatro;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio4Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio4Application.class, args);
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b, resultado=0;
		
		System.out.print("Digite dos números: ");
		a = entrada.nextFloat();
		b = entrada.nextFloat();
		
		resultado = Math.pow(a, 2) + Math.pow(b, 2);
		
		System.out.println("\nEl cuadrado de la suma es: "+resultado);
	}

}
