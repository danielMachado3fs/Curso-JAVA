package fundamentos;

public class Operadores {
	
	public static void main(String[] args) {
		
		//TIPOS DE OPERADORES
		
		/*
		 * Unários: Quando trabalha apenas com um operando
		 * a++
		 * 
		 * Binários: Quando trabalha com dois operandos
		 * a + b
		 * 
		 * Ternários: Quando trabalha com três operandos
		 * a ? b : c
		 *
		 */
		
		//FORMA
		
		/*
		 * Préfixada: Quando está antes do operando
		 * Pósfixada: Quando está depois do operando
		 * Infixada: Quando está entre os operandos
		 */
		
		//OPERADORES LÓGICOS
		
		/*
		 * and: && = (E) uma coisa e outra
		 * or: || = (OU) uma coisa ou outra
		 * xor: ^ = (OU exclusivo) so pode uma coisa ou outra, dois true não serve, dois false não serve
		 * not: ! = (negação) !true é igual falso porque está negando o verdadeiro
		 * 
		 */
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(condicao1 ^ !condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao1);
		
		System.out.println("\nTabela Verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\nTabela Verdade OU (OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela Verdade OU exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela Verdade NEGAÇÂO (NOT)");
		System.out.println(!true);
		System.out.println(!false);
		
		//OPERADORES RELACIONAIS
		
		/*
		 * == igual
		 * > maior
		 * >= maior igual
		 * < menor
		 * <= menor igual
		 * != diferente
		 * 
		 */
		
		//OPERADORES ATRIBUIÇÃO
		
		/*
		 * a = b -> a recebe b
		 * a += b -> a = a+b
		 * a -= b -> a = a-b
		 * a *= b -> a = a*b
		 * a /= b -> a = a/b
		 * a %= 2 -> a = a mod 2 (resto da divisao, retorna 0 ou 1)
		 * 
		 */
		
		//OPERADORES UNÁRIOS
		
		/*
		 * ++ incrremento -> a++ ou ++a
		 * -- decremento -> a-- ou --a
		 * 
		 * Quando o operador vem antes do operando, a operação é realizada prioritariamente,
		 * ou seja, se ouver uma comparação logo após, o valor ja vai estrar incrementado.
		 */
		
		

		
		
		
	}

}
