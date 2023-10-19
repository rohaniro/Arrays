
public class passingObjAsParameters 
{

	public static void main(String[] args) 
	{
        int a[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max=a[0], min=a[0]; 
        
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i]; 
			}
			if(a[i] < min)
			{
				min = a[i]; 
			}
		}
		System.out.println(max + ", " + min);
	}

}

/*
 * [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * 
 * max = a[0] (25)
 * 
 * is max (25) > a[0] 25 > ==> No
 * is max (25) > a[1] 14 > ==> No
 * is max (25) > a[2] 56 > ==> Yes
 * 	Therefore, max (25) == a[2] (56)
 * 	max is nor 56
 * 
 * 
*/ 
