package week3.day1;

public class Java {

	
	public void reportstep(String msg, String status) {
	System.out.println("The message is "+msg + "\nThe Status is "+status);

	}
	
	public void reportstep(String msg, String status, boolean snap) {
	System.out.println("The message is "+msg + "\nThe status is "+status + "\nThe snap is "+snap);	

	}
	
	public static void main(String[] args) {
		Java rs =new Java();
		rs.reportstep("Welcome", "Open");
		rs.reportstep("Thank you", "Closed", false);
		
	}

}

