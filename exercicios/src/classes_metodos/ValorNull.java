package classes_metodos;

import classes_metodos.exemplos_classe.Data;

public class ValorNull {
	
		//ERRO DE COMPILA??O: Regra da linguagem violada, o que impede transformar um
	//arquivo .java em um arquivo .class resultando na falha de execu??o do c?digo.
		//ERRO DE RUNTIME: Algo de errado no c?digo, algo que n?o impede o c?digo
	//de ser compilado, m?s o impede de ser executado corretamente. Como por exemplo, 
	//tentar acessar algum atributo de uma vari?vel/objeto null.
	
	public static void main(String[] args) {
		
		/*
		 * >>>>VALOR NULL<<<<
		 * 		Quando atribuimos o valor NULL a uma vari?vel ou objeto, isso significa
		 * que ela n?o estar? referenciando nenhum espa?o de mem?ria, portanto, n?o ser?
		 * possivel acess?r nenhum atributo dela.
		 * 		O valor NULL n?o ? o mesmo que VAZIO.
		 */
		
		String a = null;
		a.concat("!!!");	//Acarretar? em um ERRO RUNTIME pois a vari?vel a, est? nula.
		
		Data d1 = new Data();
		d1 = null;		//Tamb?m n?o ? permitido acessar seus atributos.
		
	}

}
