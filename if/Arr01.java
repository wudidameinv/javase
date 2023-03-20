import java.util.Scanner;
public class Arr01 {
	public static void main(String[] args){
/*	int[] arr ={24,69,80,57,13};
	for(int j =0;j< arr.length - 1; j++){
		for(int i =0; i< arr.length-1;i++){
			if(arr[i] > arr[i +1]){
				int temp =arr[i];
				arr[i] =arr[i+1];
				arr[i+1] = temp;
			}
		}
	}
	for(int i =0;i <arr.length; i++){
	System.out.println(arr[i]);
	} 
	*/

/*	String[] names ={"1","2","3"};
	Scanner myScaner =new Scanner(System.in);

	System.out.println("shurumingzi");
	String name = myScaner.next();
	int index =-1;
	for( int i =0; i< names.length; i++){
		if(name.equals(names[i])){
			System.out.println("zhaodao"+name);
			System.out.println("xuhao"+ i);
			index = i;
			break;
		}

		
	}
	if(index == -1){
			System.out.println("cuowu");}*/


		int[][] arr ={{},{}};
		for(int i =0 ;i< arr.length;i++){
			for(int j =0; j< arr[i].length;j++){
				System.out.println(arr[i][j]);

				int arr[][];
				arr =new int[2][2];
			}
		}
		int[][] arr = new int[3][];
		for(int i =0;i< arr.length;i++){
			arr[i] = new int[i+1];
			for(int j =0,j< arr[i].length;j++){
				arr[i][j] =i +1;
				} 
			}
	}
}