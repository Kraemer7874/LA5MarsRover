package edu.wmich.cs1120.la5;

public class Addition implements IOperation{

	@Override
	public int perform(IExpression left, IExpression right) {
		return left.getValue() + right.getValue();
	}

}