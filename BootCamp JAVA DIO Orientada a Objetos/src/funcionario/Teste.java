package funcionario;

public class Teste {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();

		Funcionario gerente = new Gerente();//upcast não se perde dados
		Funcionario vendedor = new Vendedor();//upcast
		Funcionario faxineiro = new Faxineiro();//upcast

		// Gerente gerente_ = new Funcionario();//não compila pq não foi colocado explicito qual é o downcast
		Vendedor vendedor1 = (Vendedor) new Funcionario();//downcast de forma explicita, aqui pode se perder dados, não se deve usar downcast em POO
	}
}
