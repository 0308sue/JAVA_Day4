package JAVA_04;

import java.util.Scanner;

public class Book2Main {
	static Scanner sc = new Scanner(System.in);
	Book2[] arr = new Book2[50];
	int cnt;
	
	public static void showMenu() {
		System.out.println("선택하세요 .. ");
		System.out.println("1.데이터 입력");
		System.out.println("2.전체보기 ");
		System.out.println("3.종료 ");
		System.out.println("선택 : ");
	}
	
	public void bookInsert() {
		System.out.println("데이터 입력 .. ");
		System.out.println("책 제목 >>");
		String title = sc.nextLine();
		System.out.println("저자 >> ");
		String writer = sc.nextLine();
		arr[cnt++] =new Book2(title,writer);
	}
	
	public void bookList() {
		System.out.println("책 리스트 .. ");
		for(int i =0;i<cnt;i++) {
			System.out.println("책 제목 : "+arr[i].getTitle());
			System.out.println("저자 : "+arr[i].getWriter());
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Book2Main bm = new Book2Main();
		while(true) {
			Book2Main.showMenu();
			int num = Book2Main.sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1 : bm.bookInsert(); break;
			case 2 : bm.bookList(); break;
			case 3 : System.out.println("종료");
							System.exit(0); //종료
			default : System.out.println("입력오류");
			}
		}
	}

}
