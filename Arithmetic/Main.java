package Arithmetic;

public class Main{
    public static void main(String[] args) {
        
        try {
             // Arithmetic<Integer, Integer> arithmetic = new Arithmetic<>(10, 10);
            // Arithmetic<Float, Float> arithmetic = new Arithmetic<>(60.2f, 60.5f);
            // Arithmetic<String, Double> arithmetic = new Arithmetic<>("10", 10.5);
            // Arithmetic<Integer, Integer> arithmetic = new Arithmetic<>(30, 0);
            // Arithmetic<Float, Double> arithmetic = new Arithmetic<>(40.1f, 40.5);
            // Arithmetic<Double, Double> arithmetic = new Arithmetic<>(30.9, 30.5);
            Arithmetic<Integer, Double> arithmetic = new Arithmetic<>(20, 20.5);
            
            System.out.println("Addition: " + (Number) arithmetic.add());
            System.out.println("Subtraction: " + (Number) arithmetic.subtract());
            System.out.println("Multiplication: " + (Number) arithmetic.multiply());
            System.out.println("Division: " + (Number) arithmetic.divide());
            System.out.println("Minimum: " + (Number) arithmetic.getMin());
            System.out.println("Maximum: " + (Number) arithmetic.getMax());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } 
    }
}
