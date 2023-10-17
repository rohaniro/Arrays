//Write a Java program to calculate the average value of array elements.

package practiceQuestions;

public class averageValueArray 
{

	public static void main(String[] args) 
	{
		int a[] = new int[]{20, 30, 25, 35, -16, 60, -100};
		int sum=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum = sum + a[i]; 
		}
		
		//find average
		int average = sum/a.length; 
		System.out.println("The average of the array is: " + average);

	}

}
