package facadedesignpattern;

public class Iphone implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("Iphone 14ProMax");
	}

	@Override
	public void price() {
		System.out.println("65000");
		
	}

}
