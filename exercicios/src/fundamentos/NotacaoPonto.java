package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		/*
		 * Nota??o Ponto
		 * 
		 * Serve para utlizar fun??es da linguagem java.
		 */
		
		String a = "Bom dia x";
		//Nesse caso, utilizando o "." ? poss?vel utilizar fun??es para vari?veis do tipo String.
		a = a.replace("X", "Senhora"); //Trocar caracteres da String. Nesse caso est? trocando o X por Senhora.
		a = a.concat("!!!"); //Concatenar uma String com outra
		a = a.toUpperCase(); //Tornar todas as letras mai?sculas.
		System.out.println(a);
		/*
		 * Nas opera??es anteriores, a vari?vel "a" foi recebendo novos valores a cada linha,
		 * pois as fun??es utilizadas n?o armazenam automaticamente as mudan?as na vari?vel,
		 * ou seja, o valor da vari?vel ? alterado somente na linha que est? a senten?a.
		 */
		
		//COMPARA??O DE STRINGS
		
		String b = "23";
		String c = "   23   ";
		System.out.println(b.equals("23")); //Para uma correta compara??o, utiliza-se a fun??o "equals()"
		System.out.println(b.equals(c.trim())); //A fun??o "trim()" remove os espa?os em branco da String.
		
		
		//? possivel utilizar as fun??es em uma mesma linha
		
		String x = "Utiliza??o da y".replace("y", "nota??o").concat(" ponto").toUpperCase();
		System.out.println(x);
		
		/*
		 * Essas fun??es com a utiliza??o da nota??o ponto, s? funcionam com objetos,
		 * ou seja, n?o funcionam com os tipos primitivos de vari?veis.
		 */
		
		
	}

}
