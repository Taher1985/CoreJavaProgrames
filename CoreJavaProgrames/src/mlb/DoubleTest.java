package mlb;

public class DoubleTest {

	public Double billAmount = 500.0; 
	
	public Double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}

	public static void main(String[] args) {
		
		DoubleTest test = new DoubleTest();
		
		if(null == test.getBillAmount() || test.getBillAmount().isNaN()){
			System.out.println(test.billAmount);
		}

	}

}
