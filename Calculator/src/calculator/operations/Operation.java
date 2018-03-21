package calculator.operations;

public abstract class Operation {
	
	protected double a, b;
	
	/**
	 * Returns the name of the operation
	 * 
	 * @return the name
	 */
	public abstract String getName();
	
	/**
	 * Returns the operator needed to trigger the operation
	 * 
	 * @return the operator
	 */
	public abstract String getOperator();
	
	/**
	 * Performs the actual computation and returns the result
	 * 
	 * @return the result of the operation
	 */
	public abstract double calc();
	
	/**
	 * Sets the two numbers to perform the operation
	 * 
	 * @param a first number
	 * @param b second number
	 */
	public void setNumbers(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Parses the provided string to return corresponding operator
	 * 
	 * @param o the string containing the operator
	 * @return the actual operation
	 */
	public static Operation parseOperator(String o) {
		Operation[] ops = new Operation[] { new Addition(), new Multiplication() };
		for (Operation op : ops) {
			if (o.equals(op.getOperator())) {
				return op;
			}
		}
		return null;
	}
}






















