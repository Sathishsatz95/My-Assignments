package week3.day2;

public class Amazon extends CanaraBank implements Payments{
	
	@Override
	public void recordPaymentDetails() {
		System.out.println("The Record of Payment Details is below:");
		
	}
	
	public static void main(String[] args) {
		
		Amazon bk = new Amazon();
		bk.recordPaymentDetails();
		bk.cardPayments();
		bk.cashOnDelivery();
		bk.internetBanking();
		bk.upiPayments();
		
		
	}

	

}
