package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
        List<Integer> list = Arrays.asList(3, 4, 5, 7, 8); 
		
        Stream<Integer> stream = list.stream().map(x -> x * 10);
        // o método stream() converte a lista list para stream | o método map() aplica uma função a cada elemento da stream 
        
        System.out.println(Arrays.toString(stream.toArray())); 
        // o método toArray() converte a stream para um vetor, assim podendo ser impressa na tela
        
        Stream<String> stream2 = Stream.of("Pão", "Queijo", "Macarrão", "Tomate");
        // o método of() permite colocar os elementos diretamente entre parênteses
        
        System.out.println(Arrays.toString(stream2.toArray()));
        
        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));
        
        //a função limit() limita o tamanho da stream
        
        /* a função iterate() recebe dois parâmetros, o primeiro diz qual será o primeiro valor da stream,
         (no caso 0), o segundo diz qual será o critério de geração dos outros elementos, que no caso
         será x + 2, podendo ser potencialmente infinita
         */
        
        Stream <Long> fibonacci = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(fibonacci.limit(20).toArray()));
        
        // lógica para a sequência de fibonacci
	}

}
