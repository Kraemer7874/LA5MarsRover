package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	// This method will create and return a proper object
	//according to the arguments received
	public static IExpression getExpression(char operator, int val1, int val2) {
		IOperation op = null;
		IExpression left = null;
		IExpression right = null;
		if (operator == '+'){
			op = new Addition();
			left = new Literal(val1);
			right = new Literal(val2);
		}
		if (operator == '-'){
			op = new Subtraction();
			left = new Literal(val1);
			right = new Literal(val2);
		}
		IExpression binary = new BinaryExpression(op, left, right);
		return binary;
	}
}
