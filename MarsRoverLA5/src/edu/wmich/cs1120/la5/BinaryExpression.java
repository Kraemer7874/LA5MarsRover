package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression{

	
	private IOperation op;
	private IExpression left;
	private IExpression right;
	
	/**
	 * gets the value from an equation 
	 * @param op either addition or subtraction
	 * @param left the lefthand of the expression
	 * @param right the righthand of the expression
	 */
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
