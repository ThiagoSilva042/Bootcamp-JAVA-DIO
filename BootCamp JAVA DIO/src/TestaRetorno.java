
public class TestaRetorno {
	public static void main(String[] args) {
		
		//Retornos
		System.out.println("Exercicio retornos");
		
		double areaQuadrado = QuadrilateroComRetorno.area(3);
		System.out.println("Area do quadrado: " + areaQuadrado);
		
		double areaRetangulo = QuadrilateroComRetorno.area(5,5);
		System.out.println("Area do retangulo: " + areaRetangulo);
		
		double areaTrapezio = QuadrilateroComRetorno.area(7,8,9);
		System.out.println("Area do trapezio: " + areaTrapezio);
	}
}
