package fundamentos.desafios;

public class DesafioOperadoresLogicos {
	
	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		if(trabalho1 && trabalho2) {
			System.out.println("Compraremos uma tv de 50''");
		}
		if(trabalho1 ^ trabalho2){
			System.out.println("Compraremos uma tv de 32''");
		}
		if((trabalho1 || trabalho2) == false){
			System.out.println("N�o vamos ao shopping");
		}
	}

}
