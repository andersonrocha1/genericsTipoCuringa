package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
		
	public static void main(String[] args) {
		/* Com tipos curinga podemos fazer métodos
		que recebem um genérico de "qualquer tipo":*/
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		/*Porém não é possível adicionar dados a uma
		coleção de tipo curinga*/
		
		List<?> list = new ArrayList<Integer>();
		list.add(3); // erro de compilação
		
		/* O compilador não sabe qual é o tipo específico do qual a lista foi instanciada. */
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
	
	
	
	
	
	

}
