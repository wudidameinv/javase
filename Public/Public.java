public class Public {
	public static void main(String[] args){
		Method me = new Method();
	//	System.out.println( me.max(2,3));
	//	System.out.println( me.max(5,6,7));
	//	me.m(6);
	//	me.m(6,5) ;
	//	System.out.println(me.sum(2,3,4,5));
		System.out.println( me.total("marry",20,60,70));
}
}
class Method{
/*	public void m(int n){
		System.out.println( n * n);
	}
	public void m(int n1,int n2){
		System.out.println( n1 * n2);
	}
*/
/*	public int max(int n1,int n2){
		return n1 > n2 ? n1:n2;
	}

	public double max(double n1,double n2, double n3 ){ //n1,n2,n3
		double max01 = n1 > n2 ? n1:n2;
		return max01 > n3 ? max01 : n3;
	}
	*/

/*	public int sum(int... nums){
		int res = 0;
		for(int i = 0; i< nums.length; i++){
			res+= nums[i];
		}return res;
	}*/

	public String total(String name,double... scores){
		double totalsc = 0;
		for(int i = 0; i< scores.length; i++){
			totalsc+= scores[i];
			
	}return  name + "chengji"+ totalsc;
}
//除了void都要有返回值 在pulic里面
//普通参数放前面 名字要一致
}
//成员方法
    //public 返回数据类型 方法名(形参列表){ 方法体
    //语句
    //return 返回值；
