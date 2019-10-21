package inheritance_two;

public class CountedItem extends PurchaseItem {
	private int quantity;
	
	public CountedItem(String n, double up, int q)
	{
		super(n, up);
		this.quantity = q;
	}
	
	public double getPrice()
    {
		return super.getPrice()*quantity;
    	
    }
    
    public String toString()
    {
    	return getName() + "@ "+super.getPrice() +"  "+ this.quantity +" units  "+ this.getPrice() +" $";
    }
}
