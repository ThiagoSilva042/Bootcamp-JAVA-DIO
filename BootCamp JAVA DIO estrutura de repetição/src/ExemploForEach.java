
public class ExemploForEach {
	public static void main(String[] args) {
		//em arrays o indice inicia em 0
		String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };

		for (String aluno : alunos) {
			System.out.println("Nome do aluno eh " + aluno);
		}
	}
}