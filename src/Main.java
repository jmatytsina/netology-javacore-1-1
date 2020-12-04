public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.sum.apply(1, 2);
        int b = calculator.diff.apply(1, 1);
        Integer c = calculator.divide.apply(a, b); // exception - dividing by zero

        calculator.println.accept(c);
    }
}
