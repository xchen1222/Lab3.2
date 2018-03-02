import java.util.Arrays;

public class MergePartition {

	public static void main(String[] args) {
		
		//Testing arrays
		int [] test1 = {5,4,4,7,2,6} ; 
		String [] test2 = {"A" ,"C" ,"E", "Z"};
		String [] test3 = {"B", "D", "F" , "Z"};
		String [] test4 = { "Q" ,"B" ,"C" ,"F" ,"A" , "O", "Z" , "Z" ,"A" , "T" };
		
		//MergeTest
		long start = System.nanoTime();
		merge(test3 , test2);
		long end = System.nanoTime();
		long time = end -start; 
		System.out.println("Merge: " + time + "nanoseconds");
		
		//PartitionTest
		 start = System.nanoTime();
		partition(test1);
		end = System.nanoTime();
		time = end -start; 
		System.out.println("Partition: " + time + "nanoseconds");
	
		
		//mergeSort
		start = System.nanoTime();
		ArrayMethod.mergeSort(test4) ; 
		end = System.nanoTime();
		time = end -start ; 
		System.out.println("mergeSort: " + time + "nanoseconds");
		
		
		
		
		
		
		
		

	}
	/*Pre-Condition: Both list1 and list2 contain Strings in alphabetical order from a to z.
	Returns: An array of the two lists merged together. The result must be in alphabetical order. */
	public static String[] merge(String[] list1 , String[] list2) {
		String[] list3 = new String[list1.length+list2.length];
		int index1 = 0 ; int index2 = 0 ;
		

			
			for ( int i =0 ; i < list3.length ; i++)
			{
				if ( index1 > list1.length-1) {
					list3[i] = list2[index2] ; 
					index2++ ; 
					
					 continue ; }
				if ( index2 > list2.length-1) {
					list3[i] = list1[index1] ; 
					index1++ ;
				
					
					 continue ; }
				else if (list1[index1].compareTo(list2[index2]) < 0  || list1[index1].compareTo(list2[index2])==0  )
					{
					list3[i] = list1[index1] ; 
					index1++ ;
					
					}
				 
				 
				 else if (list1[index1].compareTo(list2[index2]) > 0  )
					{
					list3[i] = list2[index2] ; 
					index2++ ;
					
					}
				
			} 
			
		
		

		System.out.println(Arrays.toString(list3));
		return list3;  
	}
	
	
	
	
	
	
	
	
	
	/*Write a method that partitions a list using the first element as the pivot. You should return the
integer position of the pivot in the newly partitioned array. The original array should be rearranged so that
all the elements before the pivot are less than or equal to the pivot and all the elements after the pivot are
greater than the pivot.*/
	
		public static int partition(int[] list) {
			int pivot = 0;
			for (int i = list.length-1; i > pivot; i--) {
				if (list[i] < list[pivot]) {
					swap(list,pivot,pivot+1);
					swap(list,pivot,i);
					pivot++;
				}
			}
			
		
		
		
		
		
		
		
		
		
		
	
		System.out.println(Arrays.toString(list));
		return pivot;
	}
	
	
	public static void swap(int[] arr , int index1 , int index2)
	{
		int x = arr[index1] ;
		arr[index1] = arr[index2] ;
		arr[index2] = x ; 
		System.out.println(x);
		}	
		
}
