import java.util.Scanner;
public class Array {
	public static void main(String[] args){
		/*double[] hens ={3,5,6,7,8};
		double total =0 ;
		for(int i = 0 ; i < hens.length ;i++) {
			//System.out.println("di"+(i+1)+"zhiwei"+hens[i]);
			total += hens[i] ;
		}	
		System.out.println(total);*/

	/*	double scores[] = new double[5];
		Scanner myScanner = new Scanner(System.in);
		for( int i = 0; i < scores.length;i++){
			System.out.println("shuru"+ (i +1) +"gezhi");
			scores[i] = myScanner.nextDouble();
		}
		System.out.println("shuju");
		for(int i =0;i < scores.length; i++){
			System.out.println("di"+(i+1)+"gezhi"+scores[i]);
		}*/

		//double score[];
		//scores =new double[5];
		

	/*	String[] arry3 ={"",",",""};
		short[] arr4 = new short[3];
		for( int i =0; i< arr4.length;i++){
			System.out.println(arr4[i]);
		} 
		*/
	
	/*	char[] chars = new char[26];
		for(int i =0; i< chars.length; i++){
			chars[i] = (char)('A' + i); //int -> char
		}
		System.out.println(chars[6]);*/

		int[] arr ={44,5,3,99};
		int max = arr[0];
		int maxIndex =0;
		for( int i = 0; i< arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
				maxIndex = i; 
			}
		}
		System.out.println("max=" + max + "maxIndex=" + maxIndex);
	}
}