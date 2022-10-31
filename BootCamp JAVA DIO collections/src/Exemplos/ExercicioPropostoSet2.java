package Exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioPropostoSet2 {

	public static void main(String[] args) {
		System.out.println("Linguagem Favorita: ");
		Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>() {
			{
				add(new LinguagemFavorita("Java", "Eclipse", 1995));
				add(new LinguagemFavorita("Python", "VS Code", 1991));
				add(new LinguagemFavorita("JavaScript", "Sublime Text", 1995));
			}
		};
		for(LinguagemFavorita linguagemFavorita: minhasLinguagensFavoritas) {
			System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getide() + " - " + linguagemFavorita.getanoDeCriacao());
		}
		
		System.out.println("\nOrdem inserção");
		
		Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(){{
			add(new LinguagemFavorita("Java", "Eclipse", 1995));
			add(new LinguagemFavorita("Python", "VS Code", 1991));
			add(new LinguagemFavorita("JavaScript", "Sublime Text", 1995));
		}};
		for(LinguagemFavorita linguagemFavorita: minhasLinguagensFavoritas1) {
			System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getide() + " - " + linguagemFavorita.getanoDeCriacao());
		}
		
		System.out.println("\nOrdem Natural (nome)");
		Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas){{}};
		for(LinguagemFavorita linguagemFavorita: minhasLinguagensFavoritas2) {
			System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getide() + " - " + linguagemFavorita.getanoDeCriacao());
		}
		
		System.out.println("\nOrdem IDE");
		Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
		minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
		for (LinguagemFavorita linguagemFavorita: minhasLinguagensFavoritas3) {
		System.out.println(linguagemFavorita);
		}
		
		System.out.println("\nOrdem ano de criacao e nome");
		Set<LinguagemFavorita> minhaLinguagemFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
		minhaLinguagemFavoritas4.addAll(minhasLinguagensFavoritas);
		for (LinguagemFavorita linguagemFavorita: minhaLinguagemFavoritas4) {
			System.out.println(linguagemFavorita);
		}
		
		System.out.println("\nOrdem Nome / Ano de criacao / IDE");
		Set<LinguagemFavorita> minhasLinguagemFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
		minhasLinguagemFavoritas5.addAll(minhasLinguagensFavoritas);
		for (LinguagemFavorita linguagemFavorita: minhasLinguagemFavoritas5) {
			System.out.println(linguagemFavorita);
		}
		
	}
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
	public String nome;
	public String ide;
	public Integer anoDeCriacao;

	public LinguagemFavorita(String nome, String ide, Integer tempoEpisodio) {
		this.nome = nome;
		this.ide = ide;
		this.anoDeCriacao = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public String getide() {
		return ide;
	}

	public Integer getanoDeCriacao() {
		return anoDeCriacao;
	}

	@Override
	public String toString() {
		return "{" + "nome: " + nome + '\'' + ", ide: " + ide + '\'' + ", anoDeCriacao: " + anoDeCriacao + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, ide, anoDeCriacao);
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome);
    }

	@Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }
	
	}



class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}