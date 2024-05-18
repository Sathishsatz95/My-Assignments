package week3.day2;

public abstract class CanaraBank implements Payments{

	@Override
	public void cashOnDelivery() {	
		System.out.println("cashOnDelivery");
	}

	@Override
	public void upiPayments() {
		System.out.println("upiPayments");
	}

	@Override
	public void cardPayments() {
		System.out.println("cardPayments");
	}

	@Override
	public void internetBanking() {
		System.out.println("internetBanking");	
	}

	public abstract void recordPaymentDetails(); 
	

}
