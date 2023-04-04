package Arrays;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {

	  
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the count:");
		int count = sc.nextInt();
		
		
		int no[] = new int [count];
		System.out.println("Enter the no:");
		
		for(int i=0;i<no.length;i++)
		{
			no[i]= sc.nextInt();
		}
		int index =0;
		while(index<no.length-1) 
		{
		if(no[index]>no[index+1])
		{
			int temp =no[index];
			no[index]=no[index+1];
			no[index+1]=temp;
		}
		index++;
		}
	/*	if(no[1]>no[2])
		{
			int temp =no[1];
			no[1]=no[2];
			no[2]=temp;
		}
		if(no[2]>no[3])
		{
			int temp =no[2];
			no[2]=no[3];
			no[3]=temp;
		}
		if(no[3]>no[4])
		{
			int temp =no[3];
			no[3]=no[4];
			no[4]=temp;
		}
   */
        for(int i=0;i<no.length;i++)
        {	
        	System.out.println(no[i]);

        }
	
		
	}

}
