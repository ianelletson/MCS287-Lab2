public class LetFun implements Expression {
	private String funName, param;
	private Expression funBody, letBody;

	public LetFun(String functionName, String parameter,
			Expression functionBody, Expression letBody) {
		this.funName = functionName;
		this.param = parameter;
		this.funBody = functionBody;
		this.letBody = letBody;
	}

	@Override
	public Value eval(Environment env) {
		// TODO Auto-generated method stub
		// TODO this still doesn't work
		Environment funEnv = new ActivationRecord(funName, param, funBody, env);
		Value val = letBody.eval(funEnv);
		return val;
	}

	@Override
	public String toString() {
		return "let fun " + this.funName + " " + this.param + " = "
				+ this.funBody + " in " + this.letBody + " end";
	}

}
