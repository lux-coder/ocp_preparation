import java.util.stream.*;
import java.util.function.*;
//import java.util.OptionalDouble.*;
import java.util.*;

public class StreamPrimitives{
	
	public static void main(String[] args){
		
		Stream<Integer> stream = Stream.of(1,2,3,4);
		System.out.println(stream.reduce(0, (n,s) -> n+s));
		
		Stream<Integer> sum = Stream.of(1,2,3);
		System.out.println(sum.mapToInt(x->x).sum());
		
		IntStream intStream = IntStream.of(1,2,3,4);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble());
		
		DoubleStream oneValue = DoubleStream.of(3.14);
		DoubleStream varargs = DoubleStream.of(1.0,2.3,2.6);
		oneValue.forEach(System.out::println);
		System.out.println();
		varargs.forEach(System.out::println);
		
		DoubleStream random = DoubleStream.generate(Math::random);
		random.limit(5).forEach(System.out::println);
		System.out.println();
		DoubleStream fractions = DoubleStream.iterate(0.5, d -> d/2);
		fractions.limit(3).forEach(System.out::println);
		
		IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
		count.forEach(System.out::println);
		
		IntStream ranged = IntStream.range(1,6);
		ranged.forEach(System.out::println);
		
		IntStream rangedClosed = IntStream.rangeClosed(1,5);
		System.out.println(rangedClosed);
		
		Stream<String> objStream = Stream.of("penguin", "fish");
		IntStream intStreamMap = objStream.mapToInt(String::length);
		System.out.println(intStreamMap);
		intStreamMap.forEach(System.out::println);
		
		IntStream rangeClosed = IntStream.rangeClosed(1,10);
		OptionalDouble od = rangeClosed.average();
		System.out.println(od);
		od.ifPresent(System.out::println);
		System.out.println(od.getAsDouble());
		System.out.println(od.orElseGet(() -> Double.NaN));
		
		LongStream ls = LongStream.of(5,10);
		long sum2 = ls.sum();
		System.out.println(sum2);
		
		/* 
		private static int range(IntStream ints){
			IntSummaryStatistics stats = ints.summaryStatistics();
			if(stats.getCount() == 0) throw new RuntimeException();
			return stats.getMax() - stats.getMin();
		}
		 */
		 
		BooleanSupplier b1 = () -> true;
		BooleanSupplier b2 = () -> Math.random() > 0.5;
		
		System.out.println(b1.getAsBoolean());
		System.out.println(b2.getAsBoolean());		
	}
}