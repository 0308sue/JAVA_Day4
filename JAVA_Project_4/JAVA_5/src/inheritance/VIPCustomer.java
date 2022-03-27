package inheritance;

//p236
public class VIPCustomer extends Customer {
	private int agentID;
	double saleRate; 
	
	public VIPCustomer(int customerID,
			String customerName,	int agentID) {
		super(customerID,customerName);
		this.agentID = agentID;
		saleRate = 0.1;
		super.customerGrade = "VIP";
		super.bonusRate = 0.05;
	}
	
	public int calPrice(int price) {
		bonusPoint += price*bonusRate;
		return price-(int)(price*saleRate);
	}

}