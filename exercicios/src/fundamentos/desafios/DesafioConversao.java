package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner salario = new Scanner(System.in);
		
		System.out.println("Informe o primeiro sal?rio:\n");
		String s1 = salario.nextLine();
		System.out.println("Informe o segundo sal?rio:\n");
		String s2 = salario.nextLine();
		System.out.println("Informe o terceiro sal?rio:\n");
		String s3 = salario.nextLine();
		
		double v1 = Double.parseDouble(s1.replace(",", "."));
		double v2 = Double.parseDouble(s2.replace(",", "."));
		double v3 = Double.parseDouble(s3.replace(",", "."));
		
		double soma = v1 + v2 + v3;
		
		System.out.println(" O valor total ?: " + soma + "\n E a m?dia dos valores ?: " + soma/3);
	}

}
