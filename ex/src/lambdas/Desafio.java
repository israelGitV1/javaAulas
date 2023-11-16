package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto  p1 = new Produto("iPad", 3235.89, 0.13);
		DecimalFormat df = new DecimalFormat("#,###.00");
		;
		/*
		 * 1. A partir do produto calculado o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500	(Isento)
		 * 3. Frete: >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56 
		 * 
		 */
		
		Predicate<Produto> isCaro =
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook",3893.89 ,0.15);
		System.out.println(isCaro.test(produto));
		
		
		Function<Produto, Double> comDesconto = p -> p.preco * (1 - p.desconto);
		UnaryOperator<Double> comImposto = v -> v >= 2500 ?(v * 0.085) + v : v ;
		UnaryOperator<Double> comFrete = v -> v >= 3000 ? v + 100 : v + 50;
		Function<Double, String> comArredondamento = v -> df.format(v);
		UnaryOperator<String> comFomatoReal = v -> "R$:" + v;
		
		System.out.println(comDesconto.apply(p1));
		System.out.println(comDesconto.andThen(comImposto).apply(p1));
		System.out.println(comDesconto.andThen(comImposto).andThen(comFrete).apply(p1));
		System.out.println(comDesconto.andThen(comImposto)
				                      .andThen(comFrete)
				                      .andThen(comArredondamento)
				                      .apply(p1));
		
		String preco =comDesconto.andThen(comImposto)
                .andThen(comFrete)
                .andThen(comArredondamento)
                .andThen(comFomatoReal)
                .apply(p1);
		
		System.out.println("O preço final é "+preco);
		
		
	
	}
}
