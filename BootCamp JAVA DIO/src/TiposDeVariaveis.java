
public class TiposDeVariaveis {

	public static void main(String[] args) {
		int i;

		// int i; repetida

		int I;

		// int 1a; invalida

		int _1a; // não é uma boa pratica, mas compila
		int $aq; // não é uma boa pratica mas compila

		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;

		final int j = 10;

		// j = 15; tipo final não pode receber nenhum valor depois.

		int asrn24678md; // valido mas não usual

		// int asrn246 78md; errado pois tem espaço na variavel

		int asrn2$4678_md = 10; // valido mas não pe uma boa pratica

		// int asrn2$46%78_md = 10; caracter invalido %

		asrn24678md = 100;
		asrn2$4678_md = 10;

		int quantidadeProduto = 50;

		// int QuantidadeProduto; não segue a boa pratica

		final int NUMERO_TENTATIVAS = 5;

		// final int numeroTentativas = 5; não segue a boa pratica

		int QUANTIDADE_OPCOES = 25; // não segue a boa pratica

		// int qtdProd;

		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);

		System.out.println(j);
		System.out.println(asrn24678md);
		System.out.println(asrn2$4678_md);

		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(QUANTIDADE_OPCOES);
	}

}
