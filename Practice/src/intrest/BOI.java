package intrest;

public class BOI implements Bank {
	@Override
	public void intrest(int P, int T) {
		// TODO Auto-generated method stub
		final double I=0.06;
		double result=(P*T*I)/100;
		System.out.println("rate of intrest of BOI is"+result);
		

}
}
