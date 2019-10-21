
public class Test {
	
	public static void aMethod() throws Exception
	{
		try {
			throw new Exception();
		}
		catch (Exception e) {
			System.out.println("Caught");
		}
		finally {
			System.out.println("finally");
		}
	}

	public static void main(String[] args) {
		
		try {
			aMethod();
		} catch (Exception e) {
			System.out.println("exception");
		}
		finally {
			System.out.println("finally 2");
		}
		System.out.println("finished");

	}

}
