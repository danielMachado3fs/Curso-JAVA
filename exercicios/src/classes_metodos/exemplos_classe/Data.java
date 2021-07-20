package classes_metodos.exemplos_classe;

public class Data {
	
		int dia, mes, ano;
		
		String dataFormatada() {			
			return String.format("%d/%d/%d", dia, mes, ano);
		}
		
		Data(int Cdia, int Cmes, int Cano){
			dia = Cdia;
			mes = Cmes;
			ano = Cano;					
		}
		
		Data(){
			dia = 1;
			mes = 1;
			ano = 1970;
		}

}
