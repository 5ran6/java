package global.software.support.data.structure.in.java.stack;

import java.util.Stack;

/**
*
* brunolima on Jun 7, 2021
* 
*/

public class DijkstraInterpreter {
	
	private Stack<String> operationStack;
	private Stack<Double> valueStack;
	
	public DijkstraInterpreter() {
		this.operationStack = new Stack<String>();
		this.valueStack = new Stack<Double>();
	}
	
	public void interpreterExpression(String expression) {
		String[] expressionArray = expression.split(" ");
		
		for (String value : expressionArray) {
			if (value.equals("(")) {
				// do nothing
			} else if (value.equals("+")) {
				this.operationStack.push(value);
			} else if (value.equals("*")) {
				this.operationStack.push(value);
			} else if (value.equals(")")) {
				String operation = this.operationStack.pop();
				
				if (operation.equals("+")) {
					this.valueStack.push(this.valueStack.pop() + this.valueStack.pop());
				} else if (operation.equals("*")) {
					this.valueStack.push(this.valueStack.pop() * this.valueStack.pop());
				}
			} else {
				this.valueStack.push(Double.parseDouble(value));
			}
		}
	}
	
	public void result() {
		System.out.println(this.valueStack.pop());
	}
	
	

}

