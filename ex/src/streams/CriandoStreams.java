package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		 
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ","lua ","JS\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lip ","Perl ","Go\n"};
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs,1 ,3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ","PHP ","Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		// Stream.generate(() -> "a\n").forEach(print); Imprime o "a" de forma infinita !
		// Stream.iterate(0,n -> n + 1).forEach(println); gera a soma infinito iniciando com "0" 
		
	}
}
