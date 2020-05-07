package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		Stream<Integer> stream = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(stream.toArray()));
		
		int soma = list.stream().reduce(0, (x, y) -> x + y );
		System.out.println("Soma = " + soma);
		
		/* a opera��o reduce() pega um elemento inicial,
		e depois uma fun��o que recebe dois argumentos e retorna um resultado, no caso ser� a fun��o de soma		
        */
		
		List<Integer> list2 = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(list2.toArray()));
		
		/* a fun��o filter() filtra a lista recebendo um predicado, no caso pegar� todos os elementos pares da lista
		   a fun��o map() multiplicar� todos os elementos pares por 10
		   a fun��o toList() converte a stream para uma lista */
		   
	}

}
