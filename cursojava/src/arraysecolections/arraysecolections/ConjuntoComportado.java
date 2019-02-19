package arraysecolections;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set<String> aprovados = new TreeSet<>(); // TreeSet ordena pela ordem alfabética, ou do menor ao maior
		// LinkedHashSet ordena pela ordem de inserção
		aprovados.add("João");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		aprovados.add("Pedro");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
	}
}
