package inheritance;

public class ChildTest extends SuperTest{
	
	private String name;
	private int age;
	
	public ChildTest(String name, int age, double w, double h ) {
		super(w,h);//�θ� ������ ȣ��
		System.out.println("ChildTest Ŭ����");
		this.name =name;
		this.age = age;
		super.weight=w; //�̷��ԵǸ� �θ����� �������� ���̷�Ʈ�� �������
		//this.weight = w ;
		super.height=h;
		//this.height = h ;
	}
	
	public void disp() {
		System.out.println("ChildTestŬ������ disp()");
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+age);
		System.out.println("������ = "+weight);
		System.out.println("Ű = "+height);
	}
	public static void main(String[] args) {
		ChildTest aa = new ChildTest("ȫ�浿",25,72.3,185.3);
		aa.disp();
		
System.out.println("------------------------------");
		
		SuperTest bb = new ChildTest("�ڳ�",13,25.6,158.7);
		bb.disp();//method�� override�� �Ǹ� �������� �θ��̰�,�ڽ��̰� ������ �ڽ�method�� ȣ��
		
		
		
		
	}

}
