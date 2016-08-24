import java.util.Arrays;
import java.util.Collections;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		int[] array = {5, 63, 8, 98, 55, 44, 7, 22, 13, 39, 68, 77};
		Arrays.sort(array);
		int high = array[(array.length-1)];
		int low = array[0];
		int mid = array[(array.length/2)];
		System.out.println(binarysearch(array, num,mid,high,low));
		
	}
	
	public static int  binarysearch(int[] anarray, int num, int mid, int high, int low){
		
		
	
		

		if(mid< num){
			
			low= anarray[(anarray.length/2)+1];
			mid = anarray[anarray.length/2];
			return binarysearch(anarray,num,mid,high,low);
			}
		
		else if(mid > num){
			//must change array
			high =anarray[(anarray.length/2)-1];
			mid = anarray[anarray.length/2];
					
			//mid = anarray[high+low/2];
			return binarysearch(anarray,num,mid,high,low);
			}
		else {
			return anarray[mid];
		}
		
	
	}
}
