
public class CalculatorMain 
{
	public static void main(String[] args)
	{
			Calculator calc = new Calculator();
			
			int sum = calc.add(2, 6);
			System.out.println("The sum of 2 and 6 is "+sum);
			
			int diff = calc.subtract(10, 6);
			System.out.println("The difference of 10 and 6 is "+diff);
	}		
}