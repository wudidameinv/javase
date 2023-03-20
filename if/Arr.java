import java.util.Scanner;
public class Arr {
	public static void main(String[] args){
	/*	int n1 = 10;
		int n2 = n1;
		n2 = 80;//print n2=80

		int[] arr1 ={1,2,3};
	//	int[] arr2 =arr1;

		int[] arr2= new int[arr1.length];
		for( int i =0; i<arr1.length;i++){
			arr2[i] = arr1[i];
		}
		for( int i =0; i<arr2.length;i++){
			
		System.out.print(arr2[i]);
	}
	*/

		
	//	int[] arr ={11,22,33,44,55,66};
	/*	for(int i =0 ;i <(arr.length /2); i++){
			int temp =arr[arr.length -1-i];
			arr[arr.length-1-i]= arr[i];
			arr[i] = temp;
		}
		for(int i =0 ;i <arr.length;i++){
		System.out.print(arr[i]);
		}
		*/

	/*	int[] arr2 = new int[arr.length];
		for(int i = arr.length-1,j =0; i >= 0; i--,j++){
			arr2[j] = arr[i];
		}
		for(int i =0 ;i <arr2.length;i++){
		System.out.print(arr2[i]);
		}
		arr = arr2; 
		*/
	
		Scanner myScanner = new Scanner(System.in);

		int[] arr ={1,2,3};
		do{ 
			System.out.print("qingshuru");
			int num = myScanner.nextInt();

			int[] arr2= new int[arr.length +1];
			for(int i =0 ;i <arr.length;i++){
				arr2[i] =arr[i];
			}
			arr2[arr2.length -1] =num;
			arr = arr2;

			for(int i =0 ;i <arr.length;i++){
			System.out.print(arr[i]);
			
			}System.out.print("\n");
			System.out.println("y/n");
			char ans = myScanner.next().charAt(0);
			if(ans =='n'){
				break;
			}
		}while(true);
	}
}