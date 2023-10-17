
public class bubbleSort2 
{

	public static void main(String[] args) 
	{
		int a[] = {9,1,8,2,7,3,6,4,5}; 
		int temp=0; 
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=1; j<a.length-i; j++) //j < (n - i): This is the loop condition. It ensures that the inner loop iterates only over the unsorted portion of the array. The n - i represents the number of elements in the array that have not been sorted yet. As the outer loop (i) progresses, the largest elements "bubble up" to their correct positions at the end of the array, so we don't need to compare them again. Hence, the inner loop only runs for the unsorted portion of the array.
			{
				if(a[j-1] > a[j])
				{
					temp =a[j]; 
					a[j] = a[j-1];
					a[j-1] = temp; 
				}
			}
			//return; 
		}
		
        for(int x:a)
        {
        	System.out.print(x + ",");
        }
	}

}
