import java.util.Scanner;
public class For01 {
	public static void main(String[] args){
		/*int count = 3;
		for ( int i = 0, j = 0; i < count ; i++ ,j +=2  ){
			System.out.println("i =" + i +"j =" + j );
		}*/


		/*for ( int i =0; i <= 5; i++ ){
			System.out.println("YES");
		}*/

	/*	int count = 0;
		int sum =0;
		int start = 1;
		int end = 100;
		for ( int i = 1; i <= 100; i++ ){
			if (i % 9 == 0){
				System.out.println("i=" + i );
				count++ ;
				sum += i ;
			}
		}
		System.out.println("sum =" + sum);
		System.out.println("count =" + count);*/

	/*	for(int i = 1; i <= 5; i++ ){
			System.out.println( i +"+" + ( 5-i) + "= 5");
		}*/

    /*  int j = 40 ;
		while ( j <= 200){
			if( j % 2 ==0){
				System.out.println("j=" + j);
			}
			j++;
		}*/

	/*	int i =1;
		int count =0;
		do {
			if( i % 5 ==0 && i % 3 != 0){
				System.out.println("i=" + i);
				count++;
			}
			i++;
		}while( i <= 200);
		System.out.println("count=" + count );*/

	/*	for(int i = 0; i < 2; i++){
			for( int j =0; j < 3; j++){
				System.out.println("i="+i +"j=" +j);
			}
		}*/

	/*	int count =0;
		double totalScore =0;
		Scanner myScanner = new Scanner(System.in);
		for (int j =1; j <=3; j++){
			double sum =0 ;
			for( int i = 1; i <=5; i++){
				System.out.println("qingshurudi"+ i +"getongxuedechengji");
				double score = myScanner.nextDouble();
				sum += score;
				System.out.println("chengjiwei" + score );
				if(score > 60){
					count++;
				}
			}
			System.out.println("pingjunfen =" +(sum/5));
			totalScore += sum; 
		}
			System.out.println("zongfen =" + totalScore +"pingjunfen =" 
				+ (totalScore /15));
		
			System.out.println("count="+ count);*/

			/*
			   *
			  * *
			 *   *
			*******
			 */
			
		/*	for( int i = 1; i <= 5; i++){
				for( int k= 1; k <= 5-i; k++){
				System.out.print(" ");
			}	
				for (int j =1 ; j <= 2*i -1; j++ ){
				  if(j ==1 || j == 2*i -1||i ==5){
				  	System.out.print("*");
				  }else{
				  	System.out.print(" ");
				  }
				
			}
				System.out.print("\n");
			}
			*/
	/*	int sum =0;
		for(int i =1; i<=100; i++){
			sum += i;
			if(sum > 20 ){
				System.out.println("i="+i);
				break;
			}
		}
		*/
	/*	int sum = 0;
		int n = 0;
		for (int i =1; i <=100; i++){
			sum +=i;
			if(sum > 20){
				System.out.println("i="+i);
				n = i;
				break;
			}
		}

		System.out.println("n=" + n);
		*/


	}
}