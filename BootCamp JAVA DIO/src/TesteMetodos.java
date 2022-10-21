
public class TesteMetodos {
	public static void main(String[] args) {
		// Calculadora
		System.out.println("Execicio calculadora");
		Calculadora.soma(12, 5);
		Calculadora.subtração(10, 5);
		Calculadora.multiplicação(7, 8);
		Calculadora.divisao(3, 1.5);
		
		// Mensagem
		System.out.println("\nExercicio mensagem");
		Mensagem.verificaHora(6);
		Mensagem.verificaHora(15);
		Mensagem.verificaHora(19);
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		
		//Emprestimo
		System.out.println("\nExercicio emprestimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
		Emprestimo.calcular(1000, 2);
		Emprestimo.calcular(1000, 3);
		Emprestimo.calcular(1000, 1);
	}
}
