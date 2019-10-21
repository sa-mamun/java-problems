package polymorphism;

public class NonFiction extends Book {

	public NonFiction(String t) {
		super(t);
		setPrice();
	}

	@Override
	public void setPrice() {
		price = 37.99;
		
	}
	
	public String toString()
	{
		return "Title-" + title + " Cost-$" + price;
		
	}

}
