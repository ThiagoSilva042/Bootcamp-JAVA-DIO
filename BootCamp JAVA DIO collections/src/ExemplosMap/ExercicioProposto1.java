package ExemplosMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//• Dada a população estimada de alguns estados do NE brasileiro, faça:
//	1. Estado = PE - População = 9.616.621
//	2. Estado = AL - População = 3.351.543
//	3. Estado = CE - População = 9.187.103
//	4. Estado = RN - População = 3.534.265

public class ExercicioProposto1 {

	public static void main(String[] args) {

		System.out.println("Crie um dicionario e relacione os estados e suas populações: ");
		Map<String, Integer> estadosNE = new HashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
			}
		};

		for (Map.Entry<String, Integer> estados : estadosNE.entrySet()) {
			System.out.println(estados.getKey() + " - " + estados.getValue());
		}

		System.out.println("\nSubstitua a população do estado do RN por 3.534.165");
		estadosNE.put("RN", 3534165);
		System.out.println(estadosNE);

		System.out.println(
				"\nConfira se o estado PB está no dicionario, caso não adicione: " + estadosNE.containsKey("PB"));
		if (estadosNE.containsKey("PB") != true) {
			estadosNE.put("PB", 4039277);
			System.out.println(estadosNE);
		}

		System.out.println("\nExiba a população PE: " + estadosNE.get("PE"));

		System.out.println("\nExiba os estados na ordem de inserção");
		Map<String, Integer> estadosNE2 = new LinkedHashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
				put("PB", 4039277);
			}
		};

		for (Map.Entry<String, Integer> estados : estadosNE2.entrySet()) {
			System.out.println(estados.getKey() + " - " + estados.getValue());
		}
		
		System.out.println("\nExiba os estados na ordem alfabetica");
		Map<String, Integer> estadosNE3 = new TreeMap<>(estadosNE);
		for (Map.Entry<String, Integer> estados : estadosNE3.entrySet()) {
			System.out.println(estados.getKey() + " - " + estados.getValue());
		}
		
		Collection<Integer> populacao = estadosNE2.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : estadosNE2.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("\nExiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("\nExiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));
		
        Iterator<Integer> iterator = estadosNE2.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()) {
        	soma += iterator.next();
        }
        
        System.out.println("\nExiba a soma da população desses estados: " + soma);
        
        System.out.println("\nExiba a média da população de todos os estados" + (soma/estadosNE2.size()));
        
        System.out.println("\nRemova os estados com a população menor que 4.000.000");
        System.out.println(estadosNE2);
        
        Iterator<Integer> interator1 = estadosNE2.values().iterator();
        while(interator1.hasNext()) {
        	if(interator1.next() < 4000000) interator1.remove();
        }
        System.out.println(estadosNE2);
        
        System.out.println("\nApague o dicionario dos estados");
        estadosNE2.clear();
                
        System.out.println("\nConfira se o dicionário está vazio: " + estadosNE2.isEmpty());
        
        
}}
