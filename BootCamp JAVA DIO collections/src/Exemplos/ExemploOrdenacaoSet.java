package Exemplos;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * Dadas as seguintes informações sobre algumas series, crie um conjunto e
 * ordene este conjunto exibindo: (nome - genero - tempode episodio);
 * 
 * serie 1 = nome:got, genero:fantasia, tempeoEpisodio: 60; 
 * serie 2 = nome:dark,genero:drama, tempeoEpisodio: 60; 
 * serie 3 = nome:that '70s show,genero:comedia, tempeoEpisodio: 25.
 */

public class ExemploOrdenacaoSet {
	public static void main(String[] args) {
		System.out.println("Ordem aleatoria");
		Set<Serie> minhasSeries = new HashSet<>(){{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comedia", 25));
		}};
		
		for(Serie serie: minhasSeries) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		
		System.out.println("\nOrdem inserção");
		
		Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comedia", 25));
		}};
		
		for(Serie serie: minhasSeries) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		System.out.println("\nOrdem natural (TempoEpisodio)");
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1); 
		for(Serie serie: minhasSeries2) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		}
		
		System.out.println("\nOrdem nome/Genero/TempoEpisodio");
		Set<Serie> minhasSerie3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
		minhasSerie3.addAll(minhasSeries);
		for(Serie serie: minhasSerie3) System.out.println((serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio()));
		
		System.out.println("\nOrdem genero");
		Set<Serie> minhasSerie4 = new TreeSet<>(new ComparatoGenero());
		minhasSerie4.addAll(minhasSeries);
		for(Serie serie: minhasSerie4) System.out.println((serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio()));
		
		System.out.println("\nOrdem Tempo Episodio");
		Set<Serie> minhasSerie5 = new TreeSet<>(new ComparatoTempoEpisodio());
		minhasSerie5.addAll(minhasSeries);
		for(Serie serie: minhasSerie5) System.out.println((serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio()));
	}
}

class Serie implements Comparable <Serie> {
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	
	@Override
	public String toString() {
		return "{" + "nome: " + nome + '\'' + ", genero: " + genero + '\'' + ", tempoEpisodio: " + tempoEpisodio + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if(tempoEpisodio != 0) {
			return tempoEpisodio;
		}
		return tempoEpisodio;
		
		
	}	
	
}



class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if(nome != 0) return nome;
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) return genero;
		
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
		
	}
	
}

class ComparatoGenero implements Comparator<Serie>{

	@Override
	public int compare(Serie g1, Serie g2) {
		int genero = g1.getGenero().compareTo(g2.getGenero());
		if(genero != 0) return genero;
		
		return Integer.compare(g1.getTempoEpisodio(), g2.getTempoEpisodio());
	}
	
}

class ComparatoTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie tE1, Serie tE2) {
		int tempoEpisodio = tE1.getTempoEpisodio().compareTo(tE2.getTempoEpisodio());
		if(tempoEpisodio != 0) return tempoEpisodio;
		
		return tempoEpisodio;
	}
	
}
