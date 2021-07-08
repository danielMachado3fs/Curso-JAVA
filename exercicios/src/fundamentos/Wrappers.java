package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		//Os WRAPPERS são as versões objetos dos tipos primitivos
		//Eles possibilitam a utilização de operações com a notação "."
		
		//Na maioria, as classes se diferenciam dos tipos primitivos pela primeira letra que é maiúscula
		
		Byte b = 100; //primitivo byte
		System.out.println(b.byteValue()); //pega exatamente o valor do byte que está na classe
		
		Short s = 1000; //short
		System.out.println(s.toString()); //transforma em string
		
		Integer i = 10000; //int
		System.out.println(i.doubleValue()); //transforma para double
		
		Long l = 100000L; //long
		System.out.println(l.equals(i)); //compara o valor de l com valor de i
		
		Boolean bo = //boolean
				Boolean.parseBoolean("TRUE"); //transforma uma string em boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); //transformou boolean para string e colocou em letra maiúscula
		
		Float f = 123.6F; //float
		System.out.println(f.hashCode()); //pega o hashcode referente ao valor da variável.
		
		Double d = 1254.2; //double
		System.out.println(d.toString()); //converte para string
		
		Character c = '#'; //char
		System.out.println(c.toString()); //converte para string
		
		
		
	}

}
