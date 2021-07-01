package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Utilizando os tipos primitivos de dados nos dados de um funcionário como exemplo
		
		//TIPOS NUMÉRICOS INTEIROS
		byte idade = 23;
		short numeroVoos = 524;
		int id = 526478;
		long pontos = 3_658_965_874L; 
		/*
		 * Quando um valor ultrapassa a capacidade de
		 *armazenamento do int que é o padrão do JAVA, é necessário dizer que ele é
		 *do tipo long. Para fazer isso utiliza-se a letra L maiúscula ou minúscula
		 *na frente do número.		
		 */
		
		//TIPOS NUMÉRICOS REAIS (FLUTUANTES)
		float salario = 11_524.69F; 
		/*
		 * Mesma situação do long, o tipo padrão do JAVA é double que por si é maior
		 * que o float, sendo assim para armazenar um valor do tipo float é
		 * necessário indicar esse tipo colocando a letra F maiúscula ou minúscula
		 * na frente do número
		 */
		double vendasAcumuladas = 3_548_758_472_965.69;
		/*
		 * OBS: a regra das lestras L para long e F para float refere-se aos números literais,
		 * ou seja, aqueles colocados diretamente no código 
		 * pois os literais tem como padrão o int para inteiro e double para real.
		 */
		
		//TIPO BOOLEANO
		boolean estaDeFerias = false; // ou true, em java não é possivel atribuir outros falores.
		
		//TIPO CARACTERE
		char status = 'A'; // ou pode ser '?' ou quanquer outro simbolo ou letra
		/*
		 * Esse tipo de dado suporta apenas um caractere, ou seja,
		 * se atribuir 'AT' para variável status terá um erro pois 'AT' é uma sequencia de
		 * caracteres, em outras palavras é do tipo String. 
		 */
		
	}
}
