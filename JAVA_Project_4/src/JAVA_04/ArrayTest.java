package JAVA_04;

public class ArrayTest {

	public static void main(String[] args) {
		String[] str = {"one","two","three","four"};
		for(int i =0; i<str.length;i++) {
			System.out.println(str[i]);
		}
		//for-each
		for( String s : str) {
			System.out.println(s);
		}
		//2차원 배열 
		int[][] tmp = new int[3][4];
		tmp[0][0] = 100;
		tmp[0][1] =200;
		tmp[2][2] = 300;
		System.out.println(tmp.length);
		System.out.println(tmp[0].length);//열 길이 출력
		for(int i=0 ; i<tmp.length;i++) {
			for(int j = 0; j< tmp[i].length;j++) {
				System.out.print(tmp[i][j]+"\t");
			}
		System.out.println();	
		}
		int[][] a = {{1,2,3},{11,22,33},{111,222,333},{1111,2222,3333}};
		System.out.println(a.length);
		for(int i=0 ; i<a.length;i++) {
			for(int j = 0; j< a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
		System.out.println();	
		}
		System.out.println(a);//주소값 
		System.out.println(a[0]);//주소값 
		System.out.println(a[0][0]);//값 

	}

}
