package classes_metodos.exemplos_classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		//TIPOS PRIMITIVOS
		
		double a = 2;
		double b = a; //atribui��o por valor (o valor foi copiado na mem�ria)
		
		System.out.println(a + " " + b);
		
		a++;
		b--; //valores alterados individualmente pois cada variavel tem sua c�pia do valor.
		
		System.out.println(a + " " + b);
		
		//OBJETOS
		
		Data a1 = new Data(01,02,2021);
		Data b1 = a1; //atribui��o por referencia (a referencia dos dois objetos apontam para
		// os mesmo dados, se mudar o valor em a1, muda o valor em b1)
		
		System.out.println(a1.dataFormatada());
		System.out.println(b1.dataFormatada());
		
		b1.ano = 2023; // o valor do ano foi alterado em a1 e b1
		
		System.out.println(a1.dataFormatada());
		System.out.println(b1.dataFormatada());
		
		
		/*OBS
		 * Ao passar uma vari�vel de tipo primitivo como argumento para um m�todo,
		 * o valor ser� copiado para variavel do m�todo, n�o modificando o valor padr�o da vari�vel
		 * a partir daquele ponto no c�digo.
		 * 
		 * Ao contr�rio no objeto, ao pass�-lo como par�metro em um m�todo, se o valor de seus dados
		 * forem alterados, essa altera��o ser� permamente a partir daquele ponto no c�digo.
		 */
		
		
	}

}
