package ExemplosMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares.toString());
		
		System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		System.out.println("\nConfira se o modelo tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));
		
		System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));
		
		//System.out.println("\nExiba o terceiro modelo adiicionado: " );
	
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
		for(Map.Entry<String, Double> entry: entries) {
			if(entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais economico: " + modeloMaisEficiente + " - "+ consumoMaisEficiente);
			}
		}
		
		
		
		
	}

}
