package inheritance_two;

public class WeighedItem extends PurchaseItem {
private double weight;
    
    public WeighedItem(String n, double up, double w)
    {
        super(n,up);
        this.weight = w;
    }
    
    public double getPrice()
    {
		return super.getPrice()*weight;
    	
    }
    
    public String toString()
    {
    	return getName() + "@ "+super.getPrice() +"  "+ this.weight +" kg  "+ getPrice() +" $";
    }
}
