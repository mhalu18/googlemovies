package intrest;

public class Icici implements Bank {

	@Override
	public void intrest(int P, int T ) {
		final double I=0.04;
		double result=(P*T*I)/100;
		System.out.println("rate of intrest of icici is"+result);
		

		
		
	}

}
