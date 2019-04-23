class Test{
	public static void main(String[] args){
		Operador exp1 = new Operador(new Operando(4) , '*', new Operando(5));
		Operador exp2 = new Operador(exp1, '/', new Operando(6));

		System.out.println("exp2 = " + exp2.operation());
	}
}