package ExemplosSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioPropostoSet1 {

	public static void main(String[] args) {
		
		System.out.println("Crie um conjunto contendo as cores do arco-iris: ");
		HashSet<String> coresArcoIris = new HashSet<String>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
		System.out.println("Exiba todas as cores uma abaixo da outra: " + coresArcoIris);
		
		System.out.println("Exiba a quantidade de cores que tem o arco-iris: " + coresArcoIris.size());
		
		System.out.println("Exiba as cores em ordem alfabetica: ");
		Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
		System.out.println(coresArcoIris2);
		
		System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);
        
        System.out.println("Exiba todas as cores que começam com a letra V: ");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("V")) System.out.println(cor);
        }
        
        System.out.println("Remova todas as cores que não começa com a letra V: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("V")) iterator2.remove();
        }
        System.out.println(coresArcoIris);
        
        System.out.println("Limpe o conjunto");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);
        
        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
        
        
        
	}

}
