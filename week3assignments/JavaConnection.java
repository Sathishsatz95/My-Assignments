package week3assignments;

public class JavaConnection implements DataBaseConnection{

	@Override
	public void connect() {
	System.out.println("Connect the java");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect the Java");
		
	}

	@Override
	public void executeupdate() {
		System.out.println("Execute the Update");
		
	}
	
	public static void main(String[] args) {
		JavaConnection nw = new JavaConnection();
		nw.connect();
		nw.disconnect();
		nw.executeupdate();
	}

}
