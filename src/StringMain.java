import java.util.*;


public class StringMain {


	@SuppressWarnings({ "resource", })
	public static void main(String[] args) {
		
		// initializing String Reverse Class
		StringReverse sr=new StringReverse();
		// scanner object to take input from user
		Scanner sc=new Scanner(System.in);
		// initializing array and rev arrays to value 5 
		int array[]=new int[5];
		int rev[]=new int[5];
		// asking user to elements of array size times
		System.out.println("enter the "+array.length +" "+"elements");
		// loop to sort array until five elements
		for(int i=0;i<=array.length-1;i++)
		{  
			//taking input from user and passing it to array[]
			array[i]=sc.nextInt();
			// storing value of each array element to temp variable
			sr.temp=array[i];
			// passing  the starting array[] value to the last rev[] array element
			//to reverse the array[] elements by using rev[] array
			rev[array.length-i-1]=sr.temp;
			
         }
		// prints the taken input from user
		System.out.println(" Array of elements :");
		//loop to print the sorted array
		for(int i=0;i<array.length;i++)
		{  
			// prints array[] element of value i
		   System.out.print(" "+array[i]+" ");
		   
		}
		   System.out.println(" ");
		   //prints the reverse of the sorted array[]
		System.out.println("Reverse of array elements :");
		// loop to print rev[] array elements
		for(int i=0;i<array.length;i++)
		{  
		   System.out.print(" "+rev[i]+" ");
		   
		}
		
	
		
	}

	
	}
