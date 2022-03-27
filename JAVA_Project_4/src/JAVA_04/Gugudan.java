package JAVA_04;

public class Gugudan {
	private int dan;
	private int tot;
	public Gugudan(int dan) {
		this.dan = dan;
	}
	public void print() {
		for(int i =1; i<10; i++) {
			System.out.println(dan+"*"+i +"="+dan*i);
			tot += dan*i;
		}
		System.out.println();
	}
	//getter
	public int getTot() {
		return tot;
	}

	public static void main(String[] args) {
		Gugudan g1 = new Gugudan(3);
		g1.print() ; //3단 출력
		
		Gugudan g2 = new Gugudan(7);
		g2.print() ; //7단 출력
		
		Gugudan g3 = new Gugudan(9);
		g3.print() ; //9단 출력
		System.out.println("구구단 총합 : " +(g1.tot+g2.tot+g3.tot));
		System.out.println("총합 : " +(g1.getTot()+g2.getTot()+g3.getTot()));
	
	}

}
