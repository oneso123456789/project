public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal01 an = new Animal01();
//		an.age=10;
		an.setAge(10);
		an.name="¿ø¼þÀÌ";
		
//		System.out.println("age="+an.age);
		System.out.println("age="+an.getAge());
		System.out.println("name="+an.name);
	}
}
class Animal01{	
	private int age;
	String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
