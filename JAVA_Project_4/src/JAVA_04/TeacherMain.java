package JAVA_04;

import java.util.Scanner;

public class TeacherMain {
	static Scanner sc =new Scanner(System.in);
    //배열 이름 : arr
	Student[] arr = new Student[50];
	int cnt;
	public void showMenu() {
		System.out.println("선택하세요>>");
		System.out.println("1.입력 2.전체보기/종료");
		System.out.println("선택>>");
	}
	public void inputData() {
		System.out.println("성적입력>>");
		System.out.println("이름 >>");
		String name = sc.next();
		System.out.println("국어 영어 수학 >>");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		//arr  첫번째에 학생 정보 저장
		arr[cnt++] =new Student(name, kor, eng, math);
		
	}
	public void viewData() {
		rankMethod();
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==null) break;
			System.out.println("이름 : " + arr[i].getName());
			System.out.println("국어 : " + arr[i].getKor());
			System.out.println("영어 : " + arr[i].getEng());
			System.out.println("수학 : " + arr[i].getMath());
			System.out.println("총점 :" + arr[i].getTotal());
			System.out.println("평균 :" + arr[i].getAvg());
			System.out.println("석차 : " +arr[i].getRank());
			System.out.println(); 
		}
	}
	private void rankMethod() {
		for(int i=0; i<cnt-1 ;i++) {
			for(int j=i+1; j<cnt; j++) {
				if(arr[i].getTotal() >  arr[j].getTotal()) {
					arr[j].setRank();  //rank를 1증가하는 메소드
				}else if(arr[i].getTotal() <  arr[j].getTotal()) {
					arr[i].setRank();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		TeacherMain t = new TeacherMain();
		while(true) {
			t.showMenu();
			int num = sc.nextInt();
			switch(num) {
			case 1 : t.inputData(); break;
			case 2: t.viewData();
							System.exit(0); //종료
			default : System.out.println("입력오류");
			} //switch
		}//while
	} //main

} //class