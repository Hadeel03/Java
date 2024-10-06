package demos.week1;


public class CounterDemo
{
	public static void main(String [] args)
	{
		Counter tally = new Counter();
		tally.click();
		tally.click();
		int result = tally.getValue();
		System.out.println("result: " + result);
		tally.unclick();
		result = tally.getValue();
		System.out.println("result: " + result);
	}
}