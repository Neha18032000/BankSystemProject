package singletondesignpattern;

public class SingletonMain {

	public static void main(String[] args) {
		SingleObjectDemo s=SingleObjectDemo.getInstance();
		s.showMessage();

	}

}
