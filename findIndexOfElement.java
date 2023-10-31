//Write a Java program to find the index of an array element.

package practiceQuestions;

public class findIndexOfElement 
{

	public static void main(String[] args)
	{
        int a[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int index = 77; //return 1
        
        for(int i=0; i<a.length; i++)
        {
        	if(index == a[i])
        	{
        		System.out.println(i); //returns the index 
        	}
        }
	}

}
