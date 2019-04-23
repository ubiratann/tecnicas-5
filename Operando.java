public class Operando extends Expression{
	private double valor;

	Operando(double valor){
		this.valor = valor;
	}

	double operation(){
		return valor;
	}
}