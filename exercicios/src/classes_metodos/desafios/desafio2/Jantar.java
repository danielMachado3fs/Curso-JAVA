package classes_metodos.desafios.desafio2;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida arroz = new Comida("Arroz", 0.2);
		Comida feijao = new Comida();
		feijao.nome = "Feijao";
		feijao.peso = 0.15;
		
		Pessoa p1 = new Pessoa("Daniel", 65.9);
		Pessoa p2 = new Pessoa();
		p2.nome = "Julia";
		p2.peso = 50.5;
	
		System.out.println("Antes de comer arroz, Daniel tinha: " + p1.peso);
		p1.comer(arroz);
		System.out.println("Ap?s comer arroz, Daniel tem: " + p1.peso);
		
		
	}

}
