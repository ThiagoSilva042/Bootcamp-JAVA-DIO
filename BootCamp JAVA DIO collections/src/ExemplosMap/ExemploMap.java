package ExemplosMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {
//		Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
//		modelo = gol - consumo = 14,4ml/l
//		modelo = uno - consumo = 15,6ml/l
//		modelo = mobi - consumo = 16,1ml/l
//		modelo = hb20 - consumo = 14,5ml/l
//		modelo = kwid - consumo = 15,6ml/l

//		Map carrosPopulares2020 = new HashMap(); //antes do java 5
//		Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5)
//		HashMap<String, Double> carrosPopulares = new HashMap<>();
//		Map<String, Double> carrosPopulares2020 = Map.of()

		System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos:");
		Map<String, Double> carrosPopulares = new HashMap<>() {
			{
				put("gol", 14.4);
				put("uno", 15.6);
				put("mobi", 16.1);
				put("hb20", 14.5);
				put("kwid", 15.6);
			}
		};
		System.out.println(carrosPopulares.toString());

		System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);

		System.out.println("\nConfira se o modelo tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));

		System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));

		// System.out.println("\nExiba o terceiro modelo adiicionado: " );

		System.out.println("\nExiba os modelos: ");
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);

		System.out.println("\nExiba os consumos dos carros: ");
		Collection<Double> consumos = carrosPopulares.values();
		System.out.println(consumos);

		System.out.println("\nExiba o modelo mais economico e seu consumo: ");
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";
		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais economico: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
			}
		}

		System.out.println("\nExiba o modelo menos economico e seu consumo: ");

		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

		String modeloMenosEficiente = "";

		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if (entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
			}
		}

		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		
		System.out.println("\nExiba a soma dos consumos: " + soma);
		
		System.out.println("\nExiba a media dos consumos deste dicionario de carros: " + (soma/carrosPopulares.size()));
		
		System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l: ");
		System.out.println(carrosPopulares);
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while (iterator1.hasNext()) {
			if(iterator1.next().equals(15.6)) iterator1.remove();
		}
		System.out.println(carrosPopulares);
		
		System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){
			{
				put("gol", 14.4);
				put("uno", 15.6);
				put("mobi", 16.1);
				put("hb20", 14.5);
				put("kwid", 15.6);
			}
		};
		System.out.println(carrosPopulares1.toString());
		
		System.out.println("\nExiba o dicionario ordenado pelo modelo: ");
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2.toString());
	
		System.out.println("\nApague o dicionario de carros: ");
		carrosPopulares.clear();
		
		System.out.println("\nConfira se o dicionario está vazio: " + carrosPopulares.isEmpty() );
		
	}

}
