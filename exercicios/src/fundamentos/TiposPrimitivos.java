package fundamentos;

public class TiposPrimitivos {
	public static void main(String [] args) {
		//Utilizando os tipos primitivos de dados nos dados de um funcion�rio como exemplo
			
		//OBS: 
			//As v�ri�veis de inst�ncia(vari�veis de classe) caso n seja definido
		//nenhum valor para elas, elas s�i inicializadas com o valor PADR�O
		//de acordo com o tipo.
		
			//No caso das constantes, elas n�o recebem um valor padr�a, ou seja,
		//o valor dela deve ser explicitamente definido antes da cria��o do objeto(antes do cod
		//do objeto) ou no mais tartar, dentro do construtor.
		
		//TIPOS NUM�RICOS INTEIROS
		byte idade = 23; //valor padrao -> 0
		short numeroVoos = 524; //valor padrao -> 0
		int id = 526478; //valor padrao -> 0
		long pontos = 3_658_965_874L; //valor padrao -> 0
		/*
		 * 		Quando um valor ultrapassa a capacidade de
		 *armazenamento do int que � o padr�o do JAVA, � necess�rio dizer que ele �
		 *do tipo long. Para fazer isso utiliza-se a letra L mai�scula ou min�scula
		 *na frente do n�mero.
		 * 		
		 */
		
		//TIPOS NUM�RICOS REAIS (FLUTUANTES)
		float salario = 11_524.69F; //valor padrao -> 0.0
		/*
		 * 		Mesma situa��o do long, o tipo padr�o do JAVA � double que por si � maior
		 * que o float, sendo assim para armazenar um valor do tipo float �
		 * necess�rio indicar esse tipo colocando a letra F mai�scula ou min�scula
		 * na frente do n�mero
		 */
		double vendasAcumuladas = 3_548_758_472_965.69; //valor padrao -> 0.0
		/*
		 * 		OBS: a regra das lestras L para long e F para float refere-se aos n�meros literais,
		 * ou seja, aqueles colocados diretamente no c�digo 
		 * pois os literais tem como padr�o o int para inteiro e double para real.
		 */
		
		//TIPO BOOLEANO
		boolean estaDeFerias = false; // ou true, em java n�o � possivel atribuir outros 
		//falores. O valor padr�o do boolean � false.
		
		//TIPO CARACTERE
		char status = 'A'; // ou pode ser '?' ou quanquer outro simbolo ou letra. O valor 
		//padr�o � o primeiro elemento da tabela unicod -> '\u0000'
		/*
		 * 		Esse tipo de dado suporta apenas um caractere, ou seja,
		 * se atribuir 'AT' para vari�vel status ter� um erro pois 'AT' � uma sequencia de
		 * caracteres, em outras palavras � do tipo String. 
		 */
		
	}
}
