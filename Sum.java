public class Sum extends Operator{
	void operation(){
		return left.operation() + right.operation();
	}
}