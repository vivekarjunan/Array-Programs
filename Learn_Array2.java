package Array_Learning;

public class Learn_Array2 {

	public static void main(String[] args) {

	Learn_Array2 obj = new Learn_Array2();
	
	 //obj.find_biggest_no();
	 //obj.find_smallest_no();
	 //obj.find_first_two_big_no();
	 obj.find_first_two_small_no();
	 
		
		
	}

	public void find_first_two_small_no() {

		int[] marks = {70,65,45,67,30};
		
		int first = marks[0];
		int second = marks[0];
		
		for(int i=1;i<marks.length;i++)
		{	
			if(first>marks[i])
			{
				second = first;
				first = marks[i];
			}
			else if(second>marks[i])
			{
				second = marks[i];
			}
		}
		System.out.println(first);
		System.out.println(second);
		
	}

	public void find_first_two_big_no() {

		
		int [] marks = {40,65,98,35,75};
		
		int first = marks[0];
		int second = marks[0];
	
		for(int i=1;i<marks.length;i++)
		{
			if(first<marks[i])
			{
				second = first;
				first = marks[i];
			}
			else if(second<marks[i])
			{
				second = marks[i];
			}
			
			
		}
		
		System.out.println(first);
		System.out.println(second);
		
	}

	public void find_smallest_no() {

		int marks [] = {77,85,68,40,90};
		
		int smallest = marks[0];
		
		for(int i=0;i<marks.length;i++)
		{
			if(smallest>marks[i])
			{	
				smallest = marks[i];
			}
		}
		System.out.println("smallest="+smallest);
	}

	public void find_biggest_no() {
	
		int [] marks = {50,80,70,40,60};
		
		int largest = marks[0];
		
		for(int i=0;i<marks.length;i++)
		{
			if(largest<marks[i])
			{
				largest = marks[i];
			}
		}
		System.out.println("largest"+largest);
	}

}
