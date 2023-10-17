//Write a Java program to remove a specific element from an array.

package practiceQuestions;

public class removeElementArray 
{

	public static void main(String[] args) 
	{
		int a[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; //remove 18
		
		int elementToRemove = 18; 
		int index=7; 
		int temp=a[7];
		int arraySize=a.length; 
		
		for(int i=index; i<a.length-1; i++)
		{
			a[i]=a[i+1]; 
		}
		a[arraySize-1] = 0; 
		arraySize--;
		
		
		for(int y:a)
		{
			System.out.print(y + " ");
		}
		
		
	
	}

}
