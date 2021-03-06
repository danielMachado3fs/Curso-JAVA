package classes_metodos.exemplos_classe;

public class DataTeste {
	
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();
		
		//Modificou apenas o ano e dia da data padr?o definida no construtor padr?o
		d1.ano = 2021; 
		d1.dia = 13;
		
		//Modificou apenas o mes da data padr?o definida no construtor padr?o
		d2.mes = 02;
		
		Data d3 = new Data(05,05,2021);
		Data dataDefault = new Data();
		
		System.out.printf("Data 1: " + d1.dataFormatada());
		System.out.printf("\nData 2: " + d2.dataFormatada());
		System.out.printf("\nData 3: " + d3.dataFormatada());
		System.out.printf("\nData Default: " + dataDefault.dataFormatada());
	}

}
