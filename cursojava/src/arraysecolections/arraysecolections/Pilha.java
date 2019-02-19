package arraysecolections;

import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		// Deque<String> pilha = new ArrayDeque<>(); mistura de pilha e fila
		
		pilha.push("O Pequeno Príncipe");
		pilha.push("O Hobbit");
		pilha.push("Dom Quixote");
		
		System.out.println("Peek...");
		System.out.println(pilha.peek());
		
		System.out.println("pop...");
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
	}
}
