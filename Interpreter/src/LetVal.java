
public class LetVal implements Expression {
	
	private String name;
	private Expression value;
	private Expression body;
	private ActivationRecord act;

	public LetVal(String name, Expression valueExpr, Expression bodyExpr) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.value = valueExpr;
		this.body = bodyExpr;
//		this.act = new ActivationRecord(name,)
	}

	@Override
	public Value eval(Environment env) {
		// TODO Auto-generated method stub
		// TODO Do fFive with 6 - 1
		Value val = body.eval(env);
//		ActivationRecord act = new ActivationRecord(this.name, val, env);
//		Value eVal = env.get(name);
		
		
		return val;
	}

	@Override
	public String toString() {
		return "let val " + this.name + " = " + this.value + " in " + this.body + " end";
	}
}
