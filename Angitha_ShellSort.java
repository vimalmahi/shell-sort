/* 
Shell Sort:

Shellsort,is a generalization of sorting by exchange (bubble sort) or sorting by insertion (insertion sort). The method starts by sorting elements far apart from each other and progressively reducing the gap between them.

Starting with far apart elements, it can move some out-of-place elements into position faster than a simple nearest neighbor exchange.The running time of Shellsort is heavily dependent on the gap sequence it uses. 
*/


import java.util.*;
 
public class Angitha_ShellSort
{
//Function to perform shellsort on the array received
  public static void sort(int[] array)  
    {
    
            int increment = array.length / 2;
            while (increment > 0) 
            {
            	System.out.println("\n increment := " +  increment);
                for (int i = increment; i < array.length; i++) 
                {
                    int j = i;
                    int temp = array[i];
                    while (j >= increment && array[j - increment] > temp) 
                    {
                        array[j] = array[j - increment];
                        j = j - increment;
                    }
                    array[j] = temp;
                }
                System.out.println("\nAfter:=  " + Arrays.toString(array));
                
                if (increment == 2)
                    increment = 1;
                else
                    increment *= (5.0 / 11);
     	    } 
     }//end sort method

  public static void main(String[] args)
  { 
    	 System.out.println("Sorting of numbers using SHELL SORT\n");
         Random random = new Random();
         int number;
         Scanner scanner = new Scanner(System.in);
         while(true)
         { 
             	try 
    	 	{  
                	System.out.print("Enter the limit :");    	     		
   			while (!scanner.hasNextInt()) 
   			{
	   			System.out.println("Invalid input");
	   			scanner.next();
      			}
      			number=scanner.nextInt();
			if(number==0)
			{
				System.out.print("Enter a positive integer\n");
				continue;
			}
        		int[] array = new int[number];//Dynamic allocation
        	
			/*
			//Random elements are inserted into the integer array
			for (int i = 0; i < number; i++)
			array[i] = Math.abs(random.nextInt(100));	
			*/
		
			System.out.println("Please enter "+ number+" numbers");
			for (int i = 0; i < array.length; i++)
	    		{
	    			System.out.print("\n"+ i + "th element is :");
	    			while (!scanner.hasNextInt()) 
	   			{
		   			System.out.println("Invalid input");
		   			scanner.next();
	      			}
		   		array[i] =scanner.nextInt();     					
	      		}
	    		System.out.println("\nBefore:= " + Arrays.toString(array));
	    		sort(array);
	    		System.out.println("\nFinally:=  " + Arrays.toString(array));
	     		break;
         	}
		catch (Exception e)
		{ 
		    System.out.println(e);
		   
		    
	        }   
       	   
	}//end while
  }//end main method
}//end class shell
