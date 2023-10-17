
public class binarySearch 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9}; 

		System.out.println(binarySearch(a,5));

	}
	
		
	public static int binarySearch(int[] a, int data) //data == target
	{
        int left=0; //starts at beginning of the array
        int right=a.length-1; //starts at the end of the array
        int mid=(right+left)/2; //formula to find the midpoint
		
		while(left<right)
		{
			if(data == a[mid])
			{
				return mid; 
			}
			else if(data < a[mid])
			{
				right=mid-1; 
			}
			else
			{
				left=mid+1;
			}
		} return -1;
		
	  }
	
	/*
	 * class Solution 
{
    public int searchInsert(int[] a, int target) 
    {
        int start=0; //starts at beginning of the array
        int end=a.length-1; //starts at the end of the array

    while(start<=end) 
    {
        int mid=start + (end-start)/2; //formula to find the midpoint. 

        if(target == mid) return mid;   
        else if(a[mid]<target) start=mid+1;
        else end=mid-1; 
    }
    return start; 

    } 
}




class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
        int mid=start+(end-start)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target)start=mid+1;
            else end=mid-1;
        }
        return start;
    }
}
	 */
	
}


