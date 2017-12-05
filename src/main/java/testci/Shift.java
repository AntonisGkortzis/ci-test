package testci;
import java.util.Arrays;
import java.util.Scanner;


public class Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(n);
		int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(array));
		shiftArrayRight2(array, n);
	}
	
	public static void shiftArrayRight(int[] array, int n) {		
		int[] temp = new int[10];
		int lastElement=0;
		for (int j=0; j<n; ++j) {
			lastElement = array[array.length-1];
			for (int i=0; i<array.length-1; ++i) {
				temp[i+1] = array[i];
			}
			temp[0] = lastElement;
			System.out.println(Arrays.toString(temp));
			System.arraycopy( temp, 0, array, 0, temp.length );			
		}		
	}
	
	public static void shiftArrayRight2(int[] array, int shift) {		
		int[] temp = new int[10];
		for(int i = 0; i < shift; i++) {
			int lastElement = array[array.length-1];
			for(int j=0; j<array.length-1; j++) {
				temp[j+1] = array[j];
			}
			temp[0] = lastElement;
			System.out.println(Arrays.toString(temp));
			System.arraycopy( temp, 0, array, 0, temp.length );	
		}
	}
}
