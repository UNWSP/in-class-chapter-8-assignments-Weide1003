package ch8;

public class Integers10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tenMult = {10,20,30,40,50,60};

		for (int x:tenMult)
		{
			System.out.println( x );
		}
		System.out.println("\n");
		
		int value;
		for (int x=tenMult.length - 1;x >= 0;x--)
		{
		value =tenMult[x];
		System.out.println( value );
		}
		System.out.println("\n");
		int sum = 0;int count=0;
		for (int x :tenMult){
		sum+=x;
		count ++;
		}
		System.out.println("The sum of all numbers in the array is " +sum);
		System.out. println("\n");
		int average = 0;
		average = sum /count;
		System.out.println("The average of all numbers in the array is " + average);


	}

}
