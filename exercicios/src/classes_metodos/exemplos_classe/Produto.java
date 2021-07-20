package classes_metodos.exemplos_classe;

public class Produto {
	
	String nome;
	double valor;
	static double desconto = 0.25;
	
	Produto(){}
	
	Produto(String NomeInicial, double ValorInicial){
		nome = NomeInicial;
		valor = ValorInicial;
	}
	
	double PrecoComDesconto() {
		
		return valor * (1 - desconto);
		
	}

}
