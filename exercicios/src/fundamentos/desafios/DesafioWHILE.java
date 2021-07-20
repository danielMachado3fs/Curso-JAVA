package fundamentos.desafios;

import java.util.Scanner;

public class DesafioWHILE {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("<<CALCULO MÉDIA DAS NOTAS");
		
		double nota = 0, total = 0;
		int cont = 0;
		
		while (nota != -1) {
			System.out.println("Informe a nota: ");
			nota = entrada.nextDouble();
			while(nota >= 0 && nota <= 10) {
				total += nota;
				cont++;
				System.out.println("Informe a nota: ");
				nota = entrada.nextDouble();
			}
			System.out.println("Nota inválida");
		}
			
		
		System.out.println("Foram informadas" + cont + " notas válidas");
		System.out.println("\nA média das notas é: " + total / cont);
		entrada.close();
	}

}
