import java.util.Scanner;
public class If01 {
	public static void main(String[] args){
	/*Scanner myScanner = new Scanner(System.in);
	System.out.println("shurumingzi");
	int age = myScanner.nextInt();
	if ( age > 18 ){
		System.out.println("da");
	}else {
		System.out.println("fangguo");
	}
	System.out.println("jixu");*/


	/*double d1 = 66;
	double d2 = 1.2;
	if( d1 > 10.0 && d2 <20.0){
		System.out.println("heshi" + (d1 +d2 ));
	}*/

	/*int num1 = 11 ;
	int num2 = 5 ;
	int sum = num1 + num2 ;
	if( sum % 3 == 0 && sum % 5 == 0){
		System.out.println("nnegbeizhengchu");
	} else{
		System.out.println("buneng");
	}*/

	/*int year = 2024 ;
	if(( year % 4 == 0 && year % 100 != 0 ) || year % 400 ==0 ){
		System.out.println( year +"runnian") ;
	}else{
		System.out.println(year + "bushi");
	}*/

	/*	Scanner myScanner = new Scanner(System.in) ;
		System.out.println("xinyongfen");
		int grade = myScanner.nextInt() ;
		if ( grade <= 100 && grade > 0){
			if ( grade == 100){
				System.out.println("youxiu");
			}else if( grade <= 99 && grade > 80 ){
				System.out.println("lianghao");
			}else if (grade <= 80 && grade >= 60){
				System.out.println("yiban");
			}else{
				System.out.println("bujige");
			}
		}else{
			 System.out.println("CHONGXINSHURU");
		}*/
		   	
	/*	Scanner myScanner = new Scanner(System.in);
		System.out.println("shuruchengji");
		double score = myScanner.nextDouble();
		if ( score > 8.0 ){
			System.out.println("xingbie");
			char gender = myScanner.next().charAt(0);
			if (gender == 'ÄÐ') {
				System.out.println("nanzi");
			}else if( gender =='Å®') {
				System.out.println("nvzizu");
			}else{
				System.out.println("chongxinshuru");
			}

		}else{
			System.out.println("taotai");
		}*/

	/*	Scanner myScanner = new Scanner(System.in);
		System.out.println("shuruzifu(a-g)");
		char c1 = myScanner.next().charAt(0);
		switch(c1){
			case 'a' :
				System.out.println("A");
				break;
			case 'b' :
			    System.out.println("B");
			    break;
			default :
			    System.out.println("cuowu");
		}*/

	/*	Scanner myScanner = new Scanner(System.in) ;
		System.out.println("shuruchengji");
		double score = myScanner.nextDouble() ;
		if ( score < 100 && score > 0 ){
			switch( (int)(score/60) ){
				case 0 :
				System.out.println("bujige");
				break;
				case 1 :
				System.out.println("jige");
				break;
			} 
		}else{
			System.out.println("CUOWU");
		}*/


		Scanner myScanner = new Scanner(System.in) ;
		System.out.println("shuruyuefen");
		int month = myScanner.nextInt();
		switch( month){
			case 3:
			case 4:
			case 5:
			System.out.println("chunji");
			break;
			case 6:
			System.out.println("xiatianna");
			break;
		}

	}

}