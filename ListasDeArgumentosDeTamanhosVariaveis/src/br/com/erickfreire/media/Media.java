package br.com.erickfreire.media;

/**
 * Programa em Java que usa Listas De Argumentos De Tamanhos Variaveis
 * @author Erick Freire
 * @version 1 - Criado em 01-06-2021 as 14:00
 */

public class Media {
	
	public static double media(double...numeros) {
		
		double total = 0.0;
		
		for(double d : numeros)
			total += d;
		
		return total / numeros.length;
		
	}
	
	public static void main(String[] args) {
		double d1 = 10.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;
		
		System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%n%n",d1, d2, d3, d4);
		
		System.out.printf("A Média de d1 e d2 é %.1f%n", media(d1, d2));
		System.out.printf("A Média de d1 e d2 e d3 é %.1f%n", media(d1, d2, d3));
		System.out.printf("A Média de d1 e d2 e d3 e d4 é %.1f%n", media(d1, d2, d3, d4));
		
	}

}
