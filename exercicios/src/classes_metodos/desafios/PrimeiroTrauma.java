package classes_metodos.desafios;

public class PrimeiroTrauma {
	 
	int a = 3; //n?o pode mexer
	static int b = 5;
	//DESAFIO: conseguir acessar a vari?vel dentro do m?todo main
	
	
	/* >>>>>>>>RESPOSTA<<<<<<<<
	 * A vari?vel a, ? um membro de instancia por n?o ter a palavra "static" na frente,
	 * sendo assim, s? ? poss?vel acess?-la de um m?todo da classe (static)
	 * criando uma inst?ncia primeiro.
	 */
	
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma(); //Inst?ncia "p" criada
		System.out.println(p.a); //valor da vari?vel "a" acessado a partir da inst?ncia criada.
		System.out.println(b); //a variavel "b" pode ser acessada diretamente pois ela ? uma
		//vari?vel da classe(static).
	}
}
