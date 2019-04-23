public abstract class Expression{
	abstract double operation();
	Expression[] getChild(int i){return null;}
	void add(Expression e){}
	void remove(Expression e){}
}	
	/*
					COMPONENT
		Operation(); 
		addin(); adcionar filhos a um no
		rmeove(); remover filhos de um no
		getchild(); recebe um indice da arvor e retorna seus filhos

					COMPOSIT
					pegue todos os filhos de um componente e execute o Operation dele
		Operation(); pegar os filhos da operaçao e fazer a operação, em nós folhas é só retornar o valor do operando  
		
	*/