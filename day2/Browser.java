package week1.day2;

public class Browser {	

	public String launchbrowser(String browsername)
	{
		System.out.println(browsername +" Browser Launched Successfully");
	    return browsername;
	}

	public void loadurl()
	{
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		Browser b=new Browser();
		b.launchbrowser("Chrome");
		b.loadurl();
	}
}
