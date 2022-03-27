package String;

public class String_03 {

	public static void main(String[] args) {
		String tmp = "1 0 15 23 6 21 17 10 11 12 13 14";
		//tmp 길이
		System.out.println(tmp.length());
		//tmp 마지막 숫자
		System.out.println(tmp.charAt(tmp.length()-1));
        String[] arr = tmp.split(" ");
        System.out.println("arr 길이 : " + arr.length);
        System.out.println(arr[arr.length-1]);
        for(int i=0; i<arr.length;i++) {
        	System.out.print( arr[i] + "\t");
        }
        System.out.println();
        //배열의 수 더하기
        int sum = 0;
        for(int i=0; i<arr.length;i++) {
        //	int v = Integer.parseInt(arr[i]);  // int = String (String==> int)
        //	sum += v;  
        	sum += Integer.parseInt(arr[i]);
        }
        System.out.println("sum :" + sum);
        System.out.println("sum 을 16진수로 표현 : " + Integer.toHexString(sum).toUpperCase());
        String hex ="";
        String oct ="";
        String bin="";
        for(int i=0 ; i<arr.length;i++) {
        	int v = Integer.parseInt(arr[i]);
        	hex += Integer.toHexString(v)+"\t ";
        	oct += Integer.toOctalString(v)+"\t ";
        	bin += Integer.toBinaryString(v)+"\t ";
        }
        System.out.println("16진수 : " +hex.toUpperCase() );
        System.out.println("8진수 : " + oct);
        System.out.println("2진수 : " +bin );
	} //main
}//class


