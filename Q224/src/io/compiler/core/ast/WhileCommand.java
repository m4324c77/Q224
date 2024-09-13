package io.compiler.core.ast;

import java.util.List;

public class WhileCommand extends Command{

	private String expression;
	private List<Command> whileList;

	
	@Override
	public String generateTarget() {
		// TODO Auto-generated method stub
		
		StringBuilder str = new StringBuilder();
		str.append("	while ("+expression+") {\n	");
		for (Command cmd: whileList) {
			str.append(cmd.generateTarget());
		}
		str.append("	}\n");
		
		return str.toString();
	}


	public WhileCommand() {
		super();
	}


	public WhileCommand(String expression, List<Command> whileList) {
		super();
		this.expression = expression;
		this.whileList = whileList;
	}


	public String getExpression() {
		return expression;
	}


	public void setExpression(String expression) {
		this.expression = expression;
	}


	public List<Command> getwhileList() {
		return whileList;
	}


	public void setwhileList(List<Command> whileList) {
		this.whileList = whileList;
	}

}
