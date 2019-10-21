import java.io.*;

public class Excep1 {
	
	void method() throws IOException 
	{
		throw new IOException(" Device Input Error ");
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Excep1 excep1 = new Excep1();
		try {
			excep1.method();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
		System.out.println("Rest of the code");

	}

}
