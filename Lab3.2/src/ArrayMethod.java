import java.util.Arrays;

public class ArrayMethod {

	
	
	
	
	public static String[] mergeSort(String[] list) {
		String [] list2 = new String[list.length/2 ] ;
		String [] list3 = new String[list.length - list2.length ] ;
		
	
		if (list.length == 1)  
			return list ; 
		
		
		for (int i = 0 ; i < list2.length; i++) {
		list2[i] = list[i]  ;
		}
		for (int i = 0 ; i < list3.length; i++) {
			list3[i] = list[i+list2.length]  ;
		}
		
//		System.out.println(Arrays.toString(list3));
//		System.out.println(Arrays.toString(list2));
//		System.out.println(Arrays.toString(list));
		
		return (MergePartition.merge(mergeSort(list3) ,mergeSort(list2))) ; 
	}
	
}
