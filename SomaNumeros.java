package jurosetarifa;

import java.util.Scanner;

public class SomaNumeros {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Bem vindo a soma de numeros");
		System.out.println("__________________");
		
		System.out.println("Digite o primeiro numero");
		int numero1 = scanner.nextInt();
		
		System.out.println("Digite o segundo numero");
		int numero2 = scanner.nextInt();
		
		int resultado = numero1 * numero2;
		
		System.out.println("O Resultado da soma é:"+ resultado);
		
		
		
	}

}
