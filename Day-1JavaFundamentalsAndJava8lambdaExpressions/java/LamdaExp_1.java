package lambdaExpressions.java;

@FunctionalInterface
interface ArithmeticOperations{
	double performOperation(double a, double b);
}

public class LamdaExp_1 {
	public static void main(String[] args) {
        
        double operand1 = 10.0;
        double operand2 = 5.0;

        performOperation("Addition", (a, b) -> a + b, operand1, operand2);

        performOperation("Subtraction", (a, b) -> a - b, operand1, operand2);

        performOperation("Multiplication", (a, b) -> a * b, operand1, operand2);

        performOperation("Division", (a, b) -> (b != 0) ? a / b : Double.POSITIVE_INFINITY, operand1, operand2);
    }

    private static void performOperation(String operation, ArithmeticOperations op, double num1, double num2) {
        System.out.println(operation + ": " + num1 + " and " + num2 + " = " + op.performOperation(num1, num2));
    }
}
