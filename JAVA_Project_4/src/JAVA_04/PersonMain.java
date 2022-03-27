package JAVA_04;

public class PersonMain {
	Person[] arr = new Person[10];
	int cnt;
	
	//추가
   public void insertPerson(String name, int age, String dept) {
	 //  arr[cnt] = new Person(name, age, dept);
	 //  cnt++;
	   arr[cnt++]= new Person(name, age, dept);
   }
   
   public void print() {
	   int sum = 0;
	   for(int i=0; i<arr.length;i++) {
		   if(arr[i]==null) break;
		   System.out.println(arr[i].getName());
		   System.out.println(arr[i].getAge());
		   sum+= arr[i].getAge();
	   }
	   for(int i=0; i<cnt;i++) {
		   System.out.println(arr[i].getName());
		   System.out.println(arr[i].getAge());
		   sum+= arr[i].getAge();
	   }
	   //for-each
	   for( Person p : arr) {
		   if(p==null) break;
		   System.out.println(p.getName());
		   System.out.println(p.getAge());
		   sum += p.getAge();
	   }
	   System.out.println("나이 총합 : "+sum);
	   System.out.println("나이 평균 : "+sum/(float)cnt);
   }
	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		pm.insertPerson("홍길동", 30,"영업부");
		pm.insertPerson("이순신", 25,"인사부");
		pm.insertPerson("강감찬", 27,"개발부");
		pm.print();
	}

}
