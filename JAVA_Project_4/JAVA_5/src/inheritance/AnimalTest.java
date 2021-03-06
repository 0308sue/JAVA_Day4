package inheritance;

class Animal{
	 public void move() {
		 System.out.println("동물이 움직입니다.");
	 }
}
class Human extends Animal{
	 public void move() {
		 System.out.println("사람이 두 발로 걷습니다.");
	 }
}
class Tiger extends Animal{
	 public void move() {
		 System.out.println("호랑이가  네 발로 뜁니다.");
	 }
}
class Eagle extends Animal{
	 public void move() {
		 System.out.println("독수리가 하늘을 납니다.");
	 }
}
public class AnimalTest {
	public void moveAnimal(Animal animal) { //다형성(p261)
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Human()); //Human h = new Human();
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());

	}

}

