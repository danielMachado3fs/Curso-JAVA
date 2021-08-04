package classes_metodos.desafios;

public class PrimeiroTrauma {
	 
	int a = 3; //não pode mexer
	//DESAFIO: conseguir acessar a variável dentro do método main
	
	
	/* >>>>>>>>RESPOSTA<<<<<<<<
	 * A variável a, é um membro de instancia por não ter a palavra "static" na frente,
	 * sendo assim, só é possível acessá-la de um método da classe (static)
	 * criando uma instância primeiro.
	 */
	
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma(); //Instância "p" criada
		System.out.println(p.a); //valor da variável "a" acessado a partir da instância criada.
	}
}
