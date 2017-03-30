package edu.wmich.cs1120.la5;

public interface IOperation {
	// perform the operation accordingly and return the value
	/**
	 * Performs either addition or subtraction
	 * @param left the left side of the argument
	 * @param right the right side of the argument
	 * @return return the value of the operation
	 */
	int perform(IExpression left, IExpression right);
}
