package edu.wmich.cs1120.la5;

public class Literal implements IExpression{

	
	private int value;
	
	/**
	 * Gets the literal value
	 * @param value the integer literal value
	 */
	public Literal(int value) {
		super();
		this.value = value;
	}


	@Override
	public int getValue() {
		return value;
	}

}
