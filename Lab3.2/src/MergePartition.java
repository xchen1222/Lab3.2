import java.util.Arrays;

public class MergePartition {

	public static void main(String[] args) {
		
		//Testing arrays
		int [] test1 = {1,4,4,6,2,4,3,17,0}; String [] test2 = {"Hello", "I", "Want" , "food"};
		String [] test3 = {"zebra" , "tortilla" , "abba" , "foo", "bar", "aba"};
		
		//MergeTest
		long start = System.nanoTime();
		merge(test3 , test2);
		long end = System.nanoTime();
		long time = end -start; 
		System.out.println("Merge: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test1));
		
		
	
		
		
	
		
		
		
		
		
		
		

	}
	/*Pre-Condition: Both list1 and list2 contain Strings in alphabetical order from a to z.
	Returns: An array of the two lists merged together. The result must be in alphabetical order. */
	public static int[] merge(int[] list1 , int[] list2) {
		System.out.println("c".compareTo("b"));
		return list1 ;  
	}
	
	
	
	
	
	
	
	
	
	/*Write a method that partitions a list using the first element as the pivot. You should return the
integer position of the pivot in the newly partitioned array. The original array should be rearranged so that
all the elements before the pivot are less than or equal to the pivot and all the elements after the pivot are
greater than the pivot.*/
	public static int partition(int[] list) {
		
	}
	

}
