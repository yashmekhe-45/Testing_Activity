package testingactivity;

public class BillCalculator {
	
	private IBill billService;
	
	public void setBillService(IBill billService) {
		this.billService = billService;
	}
	
	public double calculateBill(double item1, double item2, double item3, double item4) {
		return billService.calculateBill(item1, item2, item3, item4);
	}
}
