package JAVA_04;

public class Drink {
	private String name;
	private int price, count;
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price= price;
		this.count = count;
	}
	public void printDrink() {
		System.out.println(name +"\t" + price+"\t"+count+"\t"+getTotal() );
	}
	public int getTotal() {
		return price*count;
	}

	public static void main(String[] args) {
		//배열크기가 50인  arr 생성
		Drink[] arr  = new  Drink[50]; //배열 선언 & 생성
		arr[0] =new Drink("커피", 3000,3);
		arr[1] =new Drink("녹차", 3500,5);
		arr[2] =new Drink("카페라떼", 5000,7);
		int sum = 0;
		for(int i=0; i< arr.length;i++) {
			if(arr[i]==null) break;
			arr[i].printDrink();
			sum += arr[i].getTotal();
		}
	  System.out.println("총 금액 : " + sum);
	}

}
