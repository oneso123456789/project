import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MemberInfo> li = new ArrayList<MemberInfo>();
		MemberInfo mm;
		String yn;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �Է��ϼ���? ");
			String name = sc.next();
			System.out.print("���̸� �Է��ϼ���? ");
			int age = sc.nextInt();
			System.out.print("E-Mail�� �Է��ϼ���? ");
			String email = sc.next();
			System.out.print("�ּҸ� �Է��ϼ���? ");
			String address = sc.next();

			MemberInfo m = new MemberInfo();
//			m.name="ȫ�浿";
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			li.add(m);

			System.out.println("����ҷ��� y, ������� n�� �Է�?");
			yn = sc.next();
			if (yn.equals("y")) {
				continue;
			} else if (yn.equals("n")) {
				break;
			}

		} while (true);
		

		for (int i = 0; i < li.size(); i++) {
			mm = li.get(i);

			System.out.println("����:" + mm.getName());
			System.out.println("����:" + mm.getAge());
			System.out.println("E-Mail:" + mm.getEmail());
			System.out.println("�ּ�:" + mm.getAddress());
		}
	}

}

// DTO(Data Transfer Objct)
class MemberInfo extends Object{
	private String name;
	private int age;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
