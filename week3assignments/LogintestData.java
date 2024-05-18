package week3assignments;

public class LogintestData extends Testdata{
	
	public void enterusername(String UserName) {
		System.out.println("Enter the User name:" + UserName);

	}
	
	public  void enetrpassword(String Password) {
		System.out.println("Enter the Password:" + Password);

	}
	
	public static void main(String[] args) {
		
		LogintestData TD = new LogintestData();
		TD.navigatetohomepage();
		TD.enterusername("Sathishkumar");
		TD.enetrcredentials();
		TD.enetrpassword("sathish95");
		
		
	}

}
