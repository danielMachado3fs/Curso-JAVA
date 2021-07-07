package fundamentos;

public class Conversao {
	
	public static void main(String[] args) {
		
		//Converter números para string
		
		Integer x = 123;
		System.out.println(x.toString()); //converte diretamente pois ja está no tipo Integer
		
		int y = 456;
		System.out.println(Integer.toString(y)); //necessita chamar o "tipo" primeiro para depois converter
		
		
		//Converter string para números
		
		String valor1 = "125";
		String valor2 = "145";
		
		double num1 = Double.parseDouble(valor1); //tranformou valor1 para double
		int num2 = Integer.parseInt(valor2); //transformou valor2 para int
		
		System.out.println(num1 + num2);
		
		
	}

}
