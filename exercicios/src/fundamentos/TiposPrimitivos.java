package fundamentos;

public class TiposPrimitivos {
	public static void main(String [] args) {
		//Utilizando os tipos primitivos de dados nos dados de um funcionário como exemplo
			
		//OBS: 
			//As váriáveis de instância(variáveis de classe) caso n seja definido
		//nenhum valor para elas, elas sãi inicializadas com o valor PADRÂO
		//de acordo com o tipo.
		
			//No caso das constantes, elas não recebem um valor padrõa, ou seja,
		//o valor dela deve ser explicitamente definido antes da criação do objeto(antes do cod
		//do objeto) ou no mais tartar, dentro do construtor.
		
		//TIPOS NUMÉRICOS INTEIROS
		byte idade = 23; //valor padrao -> 0
		short numeroVoos = 524; //valor padrao -> 0
		int id = 526478; //valor padrao -> 0
		long pontos = 3_658_965_874L; //valor padrao -> 0
		/*
		 * 		Quando um valor ultrapassa a capacidade de
		 *armazenamento do int que é o padrão do JAVA, é necessário dizer que ele é
		 *do tipo long. Para fazer isso utiliza-se a letra L maiúscula ou minúscula
		 *na frente do número.
		 * 		
		 */
		
		//TIPOS NUMÉRICOS REAIS (FLUTUANTES)
		float salario = 11_524.69F; //valor padrao -> 0.0
		/*
		 * 		Mesma situação do long, o tipo padrão do JAVA é double que por si é maior
		 * que o float, sendo assim para armazenar um valor do tipo float é
		 * necessário indicar esse tipo colocando a letra F maiúscula ou minúscula
		 * na frente do número
		 */
		double vendasAcumuladas = 3_548_758_472_965.69; //valor padrao -> 0.0
		/*
		 * 		OBS: a regra das lestras L para long e F para float refere-se aos números literais,
		 * ou seja, aqueles colocados diretamente no código 
		 * pois os literais tem como padrão o int para inteiro e double para real.
		 */
		
		//TIPO BOOLEANO
		boolean estaDeFerias = false; // ou true, em java não é possivel atribuir outros 
		//falores. O valor padrão do boolean é false.
		
		//TIPO CARACTERE
		char status = 'A'; // ou pode ser '?' ou quanquer outro simbolo ou letra. O valor 
		//padrão é o primeiro elemento da tabela unicod -> '\u0000'
		/*
		 * 		Esse tipo de dado suporta apenas um caractere, ou seja,
		 * se atribuir 'AT' para variável status terá um erro pois 'AT' é uma sequencia de
		 * caracteres, em outras palavras é do tipo String. 
		 */
		
	}
}
