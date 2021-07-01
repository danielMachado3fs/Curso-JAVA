package fundamentos;

public class InferenciaDeTipos {
	public static void main(String[] args) {
		//É possivel declarar variáveis sem especificar o tipo dela
		
		var a = "texto"; //Java inferiu que a variavel é do tipo String
		var b = 123; //Java inferiu que a variavel é do tipo int
		
		/*
		 * Quando se declara uma variável utilizando "var", ela deve ser
		 * inicializada na mesma linha, ou seja, não se pode declarar em uma
		 * linha e atribuir valor a ela em outra linha.
		 * 
		 * <<O tipo da variável é inferido a partir do primeiro valor atribuido a ela>>
		 * 
		 * var c = "texto" > inferiu String
		 * c = 123 > da erro pois c só vai suportar string
		 * 
		 * var d = 12 > inferiu Inteiro
		 * d = 12.01 > erro pois d não suporta valor real.
		 */
		
	}
	
}
