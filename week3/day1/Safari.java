package week3.day1;

public class Safari extends Edge{
	
	public void readermode() {
		System.out.println("read the mode");

	}
	
	public void fullscreenmode() {
		System.out.println("To open the full screen mode");

	}
	
	public static void main(String[] args) {
		Safari cr =new Safari();
		cr.openURL();
		cr.closebrowser();
		cr.navigateback();
		cr.openIncognito();
		cr.clearcache();
		cr.takessnap();
		cr.clearcookies();
		cr.readermode();
		cr.fullscreenmode();
		
		
	}

}


