package fundamentos.desafios;

import java.util.Scanner;

public class DesafioModulo {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("<<CALCULADORA>>");
		
		System.out.println("\nInforme o primeiro número:");
		double num1 = teclado.nextDouble();
		
		System.out.println("\nInforme o segundo número:");
		double num2 = teclado.nextDouble();
		
		System.out.println("\nInforme a operação:");
		String op = teclado.next();
		teclado.close();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.println("\nO resultado é: " + resultado);
		
	}

}
