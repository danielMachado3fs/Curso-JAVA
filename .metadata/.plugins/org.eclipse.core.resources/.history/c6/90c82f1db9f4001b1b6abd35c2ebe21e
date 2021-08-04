package classes_metodos.exemplos_classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		//INSTANCIANDO UM PRODUTO
		Produto p1 = new Produto(); //Instancia/Objeto 1
		p1.nome = "Celular";
		p1.valor = 2500.00;
				
		var p2 = new Produto(); //Instnacia/Objeto 2
		p2.nome = "Notebook";
		p2.valor = 4500.00;
			
		Produto p3 = new Produto("Fone", 500);
			
		//O valor do desconto do produto é um atributo da classe
		//ou seja, padrão para todos os produtos
			
		Produto.desconto = 0.6; //Membro da classe sendo acessado diretamente da classe
		//alterando o desconto de todas as instâncias que nesse caso são os produtos.
			
		p1.desconto = 0.5; //Membro da classe sendo acessado pela intância. O que não é recomento
		//pois gera a impressão que so está sendo alterado o valor de desconto para essa 
		//intancia, o que na verdade, todas as instancias criadas a partir dessa linha
		//considerarão esse valor de desconto.
			
		double ValorFinal = p1.PrecoComDesconto();
		double ValorFinal2 = p2.PrecoComDesconto();
		double ValorFinal3 = p3.PrecoComDesconto();
			
		System.out.printf("Valor final Celular = %d", ValorFinal);
		//System.out.printf("\nValor final Notebook = %d", ValorFinal2);
		//System.out.printf("\nValor final Fone = %d", ValorFinal3);
			
		System.out.println(p1.PrecoComDesconto());
		//A classe produto definiu o tipo das instancias p1 e p2, o que irá mudar será os dados
		//de cada instancia.
		
	}
}
