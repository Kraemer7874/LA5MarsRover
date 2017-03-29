package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression{

	private IOperation op;
	private IExpression left;
	private IExpression right;
	
	
	public BinaryExpression(IOperation op, IExpression left, IExpression right) {
		super();
		this.op = op;
		this.left = left;
		this.right = right;
	}


	@Override
	public int getValue() {
		return op.perform(left, right);
	}

}
