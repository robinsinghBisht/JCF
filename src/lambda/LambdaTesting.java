package lambda;


import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class LambdaTesting {

    Integer num1;
    Integer num2;

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> consumer = (num1, num2) -> System.out.println(num1+num2);

        BiFunction<Integer, Integer, Integer> functionCon = (num1, num2) ->  num1+num2;

        consumer.accept(10,10);
        System.out.println("Value : " + functionCon.apply(20, 30));
    }



}
