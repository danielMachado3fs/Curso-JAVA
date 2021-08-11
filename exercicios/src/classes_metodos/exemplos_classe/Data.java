package classes_metodos.exemplos_classe;

public class Data {
	
		int dia, mes, ano;
		
		String dataFormatada() {			
			return String.format("%d/%d/%d", this.dia, mes, ano);
		}
		
		Data(int dia, int Cmes, int Cano){
			this.dia = dia; // o "this" é utilizado para acessár a variável de uma instancia
			//ele é muito utilizado quando á conflito de nomes, ou seja, 
			//nome da variável da instancia
			//igual o nome da variável de argumento do método.
			mes = Cmes;
			ano = Cano;					
		}
		
		//OBS: é possivel utilizar o "this" só em métodos de instancia(sem o static no nome),
		//ou seja, métodos que sempre seram executados a partir de uma instância sendo acessado
		//pela notação ponto.
		//EXEMPLO: d1.dataformatada(); >> método sendo acessado a partir da instancia d1.
		
		public Data(){		//A palavra public o torna visível às outras classes.
			//dia = 1;
			//mes = 1;
			//ano = 1970;
			
			this(1,1,1970); 
			
			//"this" sendo utilizado como um método
			//só é possivel utilizá-lo assim dentro de um construtor, ou seja,
			//chamando um contrutor a partir de outro construtor.
		}

}
