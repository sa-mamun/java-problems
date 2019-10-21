package polymorphism;

public class Fiction extends Book {

	public Fiction(String t) {
		super(t);
		setPrice();
		
	}

	
	@Override
	public void setPrice() {
		price = 24.99;
		
	}
	
	public String toString()
	{
		return "Title-" + title + " Cost-$" + price;
		
	}
	
	
}
