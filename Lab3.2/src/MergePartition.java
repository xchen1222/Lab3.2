import java.util.Arrays;

public class MergePartition {

	public static void main(String[] args) {
		
		//Testing arrays
		int [] test1 = {1,4,4,6,2,4,3,17,0};
		String [] test2 = {"A", "C", "E" , "F" , "H"};
		String [] test3 = {"B" , "D" , "G" , "I", "J", "K"};
		
		//MergeTest
		long start = System.nanoTime();
		merge(test3 , test2);
		long end = System.nanoTime();
		long time = end -start; 
		System.out.println("Merge: " + time + "nanoseconds");
				
		
	
		
		
	
		
		
		
		
		
		
		

	}
	/*Pre-Condition: Both list1 and list2 contain Strings in alphabetical order from a to z.
	Returns: An array of the two lists merged together. The result must be in alphabetical order. */
	public static String[] merge(String[] list1 , String[] list2) {
		String[] list3 = new String[list1.length+list2.length];
		int index1 = 0 ; int index2 = 0 ;
		if (list1.length >= list2.length)
		{
			System.out.println("This works");
			for (int i= 0 ; i < list2.length ; i++)
			{
				if (list1[index1].compareTo(list2[index2]) == 1  )
					{
					list3[i] = list2[index2] ; 
					index2++ ;
					}
				else if (list1[index1].compareTo(list2[index2]) == -1  )
					{
					list3[i] = list1[index1] ; 
					index1++ ;  
					}
				
			}
			
		}
		if (list2.length > list1.length)
		{
			
		}
		System.out.println(Arrays.toString(list3));
		return list3;  
	}
	
	
	
	
	
	
	
	
	
	/*Write a method that partitions a list using the first element as the pivot. You should return the
integer position of the pivot in the newly partitioned array. The original array should be rearranged so that
all the elements before the pivot are less than or equal to the pivot and all the elements after the pivot are
greater than the pivot.*/
	public static int partition(int[] list) {
		
	}
	

}
