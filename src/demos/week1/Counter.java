package demos.week1;

public class Counter
{
	private int value;
	
	public int getValue()
	{
		return value;
	}
	
	public void click()
	{
		value = value + 1;
	}
	
	public void unclick()
	{
		value = value - 1;
	}
	
	public void reset()
	{
		value = 0;
	}
}
