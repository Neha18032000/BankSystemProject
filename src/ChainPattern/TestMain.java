package ChainPattern;

public class TestMain {

	public static void main(String[] args) {
		Chain addchain=new AddNumber();
		Chain subchain=new SubNumber();
		addchain.setNextChain(subchain);
		Numbers request=new Numbers(10,6,"add");
		addchain.calculate(request);
		
		

	}

}
