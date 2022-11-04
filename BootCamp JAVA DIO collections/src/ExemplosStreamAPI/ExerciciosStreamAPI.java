package ExemplosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
	public static void main(String[] args) {
		List<String> numeroAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		System.out.println("Imprima todos os elemntos dessa lista de String: ");
		numeroAleatorios.forEach(System.out::println);
		
		System.out.println("\nPegue os 5 primeiros numeros e coloque dentro de um Set: ");
		//numeroAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
		Set<String> collectSet = numeroAleatorios.stream().limit(5).collect(Collectors.toSet());
		
		System.out.println("Tranforme esta lista de String em um lista de numeros inteiros.");
		List<Integer> collectList = numeroAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
		
		
		
	}
}
