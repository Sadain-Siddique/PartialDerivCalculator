package test_package;

import ast.Operation;
import tokenizer.AbstractTreeBuilder;
import tokenizer.TokenizerException;

public class MainClass {

	public static void main(String[] args) throws TokenizerException {
		AbstractTreeBuilder tree = new AbstractTreeBuilder("(3/(x+pi))");
		Operation derivative = tree.getTree().getDerivative();
		System.out.println(derivative.toString());
		System.out.println(derivative.getNumericResult(8d));
	}

}
