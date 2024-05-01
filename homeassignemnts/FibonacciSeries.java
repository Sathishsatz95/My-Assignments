package homeassignemnts;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		//  0 1 1 2 3 5 8 13
		//  f s t
		
	// f means first
    // s means second
    // t means third
		
		int f=0;
		int s=1;
		int t=f;
		
		for (int i=0; i<8; i++)
		{
			System.out.println(f);
			t=f+s;
			f=s;
			s=t;
			
		}
			
		
	}
	

}
