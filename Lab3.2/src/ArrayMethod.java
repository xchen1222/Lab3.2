
public class ArrayMethod {

	
	
	
	
	public static String[] mergeSort(String[] list) {

		if (list.length == 1)  
			return list ; 
		
		String [] list2 = new String[list.length/2 ] ;
		String [] list3 = new String[list.length - list2.length ] ;
		System.out.println(list2.length + list3.length + "jban");
		for ( int i= 0 ; i == list2.length ; i++) {
			list2[i] = list[i] ;
		}
		for ( int i= 0 ; i == list3.length ; i++) {
			list3[i] = list[i+list2.length] ;
		} 
		
		return (MergePartition.merge(mergeSort(list2) ,mergeSort(list3))) ; 
	}
	
}
