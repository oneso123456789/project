//��ü ����ȭ: �� ����� ���� ��ü�� ����� ���� ��ü ������ 
// ��.��� �ϴ� ���� ����.
// ���� ��ü�鵵 ���������δ� ��濡 ����� ���� ������ 
// ��.��� �Ҷ��� ���� ������ ��.���� �ϱ� ������ ��ü ����ȭ����
//��ü ������ �����ϰ� �б� ���ؼ� 2���� Ŭ������ �����ȴ�.
// (ObjectInputStream, ObjectOutputStream)

// �Ż� ������ ������ ��ü�� ����� ���� Ŭ����

import java.io.Serializable;

// ��ü ����ȭ�� ���ؼ��� Serializable�̶�� �������̽��� ��� 
// �޾ƾ� �Ѵ�.(�޼ҵ�� ����)
// ����, Serializable �������̽��� ����ȭ �Ѵٴ� ǥ������ ���Ҹ� ��.
// Serializable �������̽��� ������ Ŭ������ ��ü�� ����� 
// ��.����� �ϸ� �츮�� ���α׷����� üũ���� �ʾƵ� �ߺ��� ��ü��
//  ��.����ϴ� ���� ������ �ش�.
public class PersonInformation extends Object implements Serializable {
	
    // ��� ����
    private String name;
    private int age;
    private String address;
    private String telephone;
	
    // ������
public PersonInformation( String name, int age, String address, String telephone ) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.telephone = telephone;
    }

    // �� ��� ������ ���� ���Ͻ�Ű�� getXXX()�޼ҵ�
    public String getName() {
		return name;
    }

    public int getAge() {
		return age;
    }

    public String getAddress() {
		return address;
    }

    public String getTelephone() {
		return telephone;
    }
}