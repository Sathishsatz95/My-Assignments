package week3assignments;

public class APIClient {
	
	public void sendrequest(String endpoint) {
		System.out.println("request to endpoint:" + endpoint);

	}
	
	public void sendrequest(String endpoint, String requestBody, boolean requeststatus) {
		System.out.println("request to endpoint:" + endpoint);
		System.out.println("Request body:" + requestBody);
		System.out.println("Request status: " + requeststatus);

	}
	
	public static void main(String[] args) {
		APIClient nn = new APIClient();
		// Calling the first sendRequest method
		nn.sendrequest("Yes");
		// Calling the second sendRequest method
		nn.sendrequest("Yes", "No", false);
	}

}
