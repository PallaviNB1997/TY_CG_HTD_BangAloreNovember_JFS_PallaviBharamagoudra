import java.util.Scanner;

public class ArrayMerge {
//	package jsp.programming.arrays;
//	import java.util.Scanner;
//	public class SelectionSort

//	{
	//	public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of the array");
			int []a=new int[sc.nextInt()];
			
			System.out.println("enter the no of elements of the array");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
				
			}
			for(int i=0;i<a.length-1;i++)
			{
				int k=i;
				int j=i+1;
				while(j<a.length)
					
				{
					if(a[k]>a[j])
					{
						k=j;
						
					}
					j++;
				}
					int temp=a[k];
					a[k]=a[i];
					a[i]=temp;
					
			}
			System.out.println("selection sort");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			}
		}


