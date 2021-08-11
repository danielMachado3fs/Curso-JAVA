package classes_metodos.exemplos_classe;

public class Data {
	
		int dia, mes, ano;
		
		String dataFormatada() {			
			return String.format("%d/%d/%d", this.dia, mes, ano);
		}
		
		Data(int dia, int Cmes, int Cano){
			this.dia = dia; // o "this" � utilizado para acess�r a vari�vel de uma instancia
			//ele � muito utilizado quando � conflito de nomes, ou seja, 
			//nome da vari�vel da instancia
			//igual o nome da vari�vel de argumento do m�todo.
			mes = Cmes;
			ano = Cano;					
		}
		
		//OBS: � possivel utilizar o "this" s� em m�todos de instancia(sem o static no nome),
		//ou seja, m�todos que sempre seram executados a partir de uma inst�ncia sendo acessado
		//pela nota��o ponto.
		//EXEMPLO: d1.dataformatada(); >> m�todo sendo acessado a partir da instancia d1.
		
		public Data(){		//A palavra public o torna vis�vel �s outras classes.
			//dia = 1;
			//mes = 1;
			//ano = 1970;
			
			this(1,1,1970); 
			
			//"this" sendo utilizado como um m�todo
			//s� � possivel utiliz�-lo assim dentro de um construtor, ou seja,
			//chamando um contrutor a partir de outro construtor.
		}

}
