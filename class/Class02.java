public class Class02 {
	public static void main(String[] args){
	
		int[][] mapp ={{0,0,0},{1,1,1},{2,2,2}};
		Mytools to = new Mytools();
		to.printarr(mapp);
	}
}
class Mytools{
	public  void printarr(int[][] map){ 
	for(int i = 0; i<map.length; i++){
		for( int j =0;j < map[i].length; j++){
			System.out.print(map[i][j] + "\t");
		}System.out.println();
		}
	}
}