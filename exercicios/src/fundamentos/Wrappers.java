package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		//Os WRAPPERS s�o as vers�es objetos dos tipos primitivos
		//Eles possibilitam a utiliza��o de opera��es com a nota��o "."
		
		//Na maioria, as classes se diferenciam dos tipos primitivos pela primeira letra que � mai�scula
		
		Byte b = 100; //primitivo byte
		System.out.println(b.byteValue()); //pega exatamente o valor do byte que est� na classe
		
		Short s = 1000; //short
		System.out.println(s.toString()); //transforma em string
		
		Integer i = 10000; //int
		System.out.println(i.doubleValue()); //transforma para double
		
		Long l = 100000L; //long
		System.out.println(l.equals(i)); //compara o valor de l com valor de i
		
		Boolean bo = //boolean
				Boolean.parseBoolean("TRUE"); //transforma uma string em boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); //transformou boolean para string e colocou em letra mai�scula
		
		Float f = 123.6F; //float
		System.out.println(f.hashCode()); //pega o hashcode referente ao valor da vari�vel.
		
		Double d = 1254.2; //double
		System.out.println(d.toString()); //converte para string
		
		Character c = '#'; //char
		System.out.println(c.toString()); //converte para string
		
		
		
	}

}
