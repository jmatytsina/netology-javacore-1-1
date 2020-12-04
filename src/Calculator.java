import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * (-1);

    BinaryOperator<Integer> sum = (x, y) -> x + y;
    BinaryOperator<Integer> diff = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> divide = (x, y) -> x / y;   // do not analyze if y == 0
    BinaryOperator<Integer> divide = (x, y) -> y == 0 ? null : x / y;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
