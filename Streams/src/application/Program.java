package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
        List<Integer> list = Arrays.asList(3, 4, 5, 7, 8); 
		
        Stream<Integer> stream = list.stream().map(x -> x * 10);
        // o m�todo stream() converte a lista list para stream | o m�todo map() aplica uma fun��o a cada elemento da stream 
        
        System.out.println(Arrays.toString(stream.toArray())); 
        // o m�todo toArray() converte a stream para um vetor, assim podendo ser impressa na tela
        
        Stream<String> stream2 = Stream.of("P�o", "Queijo", "Macarr�o", "Tomate");
        // o m�todo of() permite colocar os elementos diretamente entre par�nteses
        
        System.out.println(Arrays.toString(stream2.toArray()));
        
        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));
        
        //a fun��o limit() limita o tamanho da stream
        
        /* a fun��o iterate() recebe dois par�metros, o primeiro diz qual ser� o primeiro valor da stream,
         (no caso 0), o segundo diz qual ser� o crit�rio de gera��o dos outros elementos, que no caso
         ser� x + 2, podendo ser potencialmente infinita
         */
        
        Stream <Long> fibonacci = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(fibonacci.limit(20).toArray()));
        
        // l�gica para a sequ�ncia de fibonacci
	}

}
