public class Operador extends Expression{
	char operacao;
	Expression right, left;

	Operador(Expression left,char op , Expression right){
		this.left = left;
		this.operacao = op;
		this.right = right;
	}

	double operation(){
		if(operacao == '*'){
			return left.operation() * right.operation();
		}else{
			return left.operation() / right.operation();
		}
	}	

	Expression[] getChild(int i){return null;}
	void add(Expression e){}
	void remove(Expression e){}


}