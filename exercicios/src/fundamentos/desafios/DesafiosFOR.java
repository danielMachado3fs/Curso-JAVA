package fundamentos.desafios;

public class DesafiosFOR {

	public static void main(String[] args) {
		
		for(int cont = 10; cont >= 0; cont -= 2) { //A variável cont só é visivel dentro do laço for
			//pois ela foi declarada dentro do escopo do for.
			System.out.printf("Contador = %d\n",cont);
		}
		
		String valor = "#";
		
		for(; !valor.equals("######") ;) {
			System.out.println(valor);
			valor += "#";
			}
		}		
	}
