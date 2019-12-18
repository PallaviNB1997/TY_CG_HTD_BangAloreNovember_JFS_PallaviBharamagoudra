import java.util.Scanner;

public class Sorting {
public static void main(String[] args) { 
	sort();
}
public static void sort()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int []a1=new int[sc.nextInt()];
	
	System.out.println("enter the no of elements of the array");
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
		
	}
	for(int i=0;i<a1.length-1;i++)
	{
		for(int j=0;j<a1.length-1-i;j++)
		{
			if(a1[j]>a1[j+1])
			{
				int temp=a1[j];
				a1[j]=a1[j+1];
				a1[j+1]=temp;
				
			}
		}
	}
	System.out.println("the sorted array");
	for(int i=0;i<a1.length;i++)
	{
		System.out.println(a1[i]);
	}
}
}
