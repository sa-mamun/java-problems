package exception_handling;

public class Point {
	private int x;
    private int y;
    public Point(int num1, int num2)
    {
        x = num1;
        y = num2;
    }
  
	public int slope(int num3, int num4) throws ArithmeticException {

	    int numerator = num4 - y;
	    int denominator = num3 - x;
	    int slope = (numerator)/(denominator);
	    return Math.abs(slope);
    }
}
