public class LetVal implements Expression {

	private String name;
	private Expression value;
	private Expression body;

	public LetVal(String name, Expression valueExpr, Expression bodyExpr) {
		this.name = name;
		this.value = valueExpr;
		this.body = bodyExpr;
	}

	@Override
	public Value eval(Environment env) {
		Value myVal = this.value.eval(env);
		Environment act = new ActivationRecord(this.name, myVal, env);
		Value val = body.eval(act);
		return val;
	}

	@Override
	public String toString() {
		return "let val " + this.name + " = " + this.value + " in " + this.body
				+ " end";
	}
}
