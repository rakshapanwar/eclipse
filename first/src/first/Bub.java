package first;

public class Bub {
	//in bubble sort the greatest sorts to last after each ith loop

	public static void main(String args[])
	{
		int a[]= {36,53,20,5,9,1},t=0,i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-1-i;j++) //comparison b/w current & next & 1 less after each i loop 
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
