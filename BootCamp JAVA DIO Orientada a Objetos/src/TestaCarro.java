
public class TestaCarro {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setCor("Preto");
		carro.setModelo("Trooler");
		carro.setCapacidadeTanque(45);
		
		System.out.println(carro.getModelo());
		System.out.println(carro.getCor());
		System.out.println(carro.getCapacidadeTanque());
		System.out.println(carro.totalValorTanque(5.99));
	
		Carro carro1 = new Carro("Laranja", "Jimny", 55);
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalValorTanque(4.99));
	
	}
}
