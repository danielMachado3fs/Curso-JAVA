package classes_metodos.exemplos_classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		//TIPOS PRIMITIVOS
		
		double a = 2;
		double b = a; //atribuição por valor (o valor foi copiado na memória)
		
		System.out.println(a + " " + b);
		
		a++;
		b--; //valores alterados individualmente pois cada variavel tem sua cópia do valor.
		
		System.out.println(a + " " + b);
		
		//OBJETOS
		
		Data a1 = new Data(01,02,2021);
		Data b1 = a1; //atribuição por referencia (a referencia dos dois objetos apontam para
		// os mesmo dados, se mudar o valor em a1, muda o valor em b1)
		
		System.out.println(a1.dataFormatada());
		System.out.println(b1.dataFormatada());
		
		b1.ano = 2023; // o valor do ano foi alterado em a1 e b1
		
		System.out.println(a1.dataFormatada());
		System.out.println(b1.dataFormatada());
		
		
		/*OBS
		 * Ao passar uma variável de tipo primitivo como argumento para um método,
		 * o valor será copiado para variavel do método, não modificando o valor padrão da variável
		 * a partir daquele ponto no código.
		 * 
		 * Ao contrário no objeto, ao passá-lo como parâmetro em um método, se o valor de seus dados
		 * forem alterados, essa alteração será permamente a partir daquele ponto no código.
		 */
		
		
	}

}
