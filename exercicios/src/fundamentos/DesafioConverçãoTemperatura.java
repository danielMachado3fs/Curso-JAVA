package fundamentos;

public class DesafioConver��oTemperatura {
	public static void main(String[] args) {
		final int ajuste = 32;
		final double fator = 5/9.0; 
		
		/*Para que o java reconhe�a os n�meros depois da v�rgula � necess�rio 
		 * colocar um dos n�meros no formato inteiro como por exemplo 9.0. Se utilizar 
		 * 5/9 o java vai retornar 0, ent�o deve-se utilizar 5.0/9 ou 5/9.0 ou 5.0/9.0!
		*/
		
		double F,C;		
		
		//Conversao da temperatura
		F = 86;
		C = (F - ajuste) * fator;
		System.out.println("O resultado �: "+ C + "�C");
		
	}

}
