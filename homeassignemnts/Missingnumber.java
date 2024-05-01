package homeassignemnts;

public class Missingnumber {
	
	public static void main(String[] args) {

	int[] a= {1,4,3,2,8,6,7};
	
	int n=a.length+1;
	int totalsum=n*(n+1)/2;
	
	int actualSum =0;
    for (int num : a) {
        actualSum += num;
    }

    int missingNumber = totalsum - actualSum;

    System.out.println("The missing number is: " + missingNumber);

		
	}

}
