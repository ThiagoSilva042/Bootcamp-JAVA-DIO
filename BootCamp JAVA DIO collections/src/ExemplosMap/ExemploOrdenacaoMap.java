package ExemplosMap;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*Dadas as seguinte informações sobre meus livros favoritos e seus autores,
 * crie um dicionario e ordene este dicionario:
 * Exibindo (nome autor - nome livro); 
 * 
 * Autor = Hawking, Stephen - Livro = Nome: Uma breve historia do tempo. Paginas: 256
 * Autor = Duhigg, Charles - Livro = Nome: O poder do habito, paginas: 408
 * Autor = Harari, Yuval Noah - Livro = Nome: 21 Lições para o seculo 21, paginas: 432
 */
public class ExemploOrdenacaoMap {

	public static void main(String[] args) {
		System.out.println("Ordem aleatoria:");
		Map<String, Livros> meusLivros = new HashMap<>() {
			{
				put("Hawking, Stephen", new Livros("Uma breve historia do tempo", 256));
				put("Duhigg, Charles", new Livros("O poder do habito", 408));
				put("Harari, Yuval Noah", new Livros("21 Lições para o seculo 21", 432));
			}
		};

		for (Map.Entry<String, Livros> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}

		System.out.println("\nOrdem Inserção");
		Map<String, Livros> meusLivros1 = new LinkedHashMap<>() {
			{
				put("Hawking, Stephen", new Livros("Uma breve historia do tempo", 256));
				put("Duhigg, Charles", new Livros("O poder do habito", 408));
				put("Harari, Yuval Noah", new Livros("21 Lições para o seculo 21", 432));
			}
		};
		for (Map.Entry<String, Livros> livro : meusLivros1.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}

		System.out.println("\nOrdem alfavetica autores");
		Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros1);
		for (Map.Entry<String, Livros> livro : meusLivros2.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}

		System.out.println("\nOrdem alfabetica nomes dos livros");
		Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
		meusLivros3.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livros> livro : meusLivros3) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}

		System.out.println("\nOrdem numero de pagina");
		Set<Map.Entry<Double, Livros>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
		meusLivros4.addAll((Collection<? extends Entry<Double, Livros>>) meusLivros.entrySet());
		for (Entry<Double, Livros> livro : meusLivros4) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
		}
	}

}

class Livros {
	private String nome;
	private Integer paginas;

	public Livros(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Livros livro = (Livros) o;
		return nome.equals(livro.nome) && paginas.equals(livro.paginas);
	}

	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", paginas=" + paginas + "]";
	}

}

class ComparatorNome implements Comparator<Map.Entry<String, Livros>> {

	@Override
	public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}
}
	class ComparatorPagina implements Comparator<Map.Entry<Double, Livros>> {

		@Override
		public int compare(Map.Entry<Double, Livros> pg1, Map.Entry<Double, Livros> pg2) {
			return pg1.getValue().getPaginas().compareTo(pg2.getValue().getPaginas());
		}
	}
