
public class LetVal implements Expression {
	
	private String name;
	private Expression value;
	private Expression body;

	public LetVal(String name, Expression valueExpr, Expression bodyExpr) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.value = valueExpr;
		this.body = bodyExpr;
	}

	@Override
	public Value eval(Environment env) {
		// TODO Auto-generated method stub
		
		Value eVal = env.get(name);
		
		
		return null;
	}

	@Override
	public String toString() {
		return "let val " + this.name + " = " + this.value + " in " + this.body + " end";
	}
}
