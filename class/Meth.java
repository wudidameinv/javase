public class Meth {
	public static void main(String[] args){
	
		A a = new A();
		a.print(4,4,'*'); 
	}
}
class A{
	public void print( int row,int col,char c){
		for( int i =0; i< row; i++){
			for( int j = 0; j< col; j++ ){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}