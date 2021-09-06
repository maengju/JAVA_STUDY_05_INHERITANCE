package inheritance;

public class SubTest extends SuperTest{
	private String name;
	private int age;
	


	public SubTest(String name, int age, double w, double h ) {
		System.out.println("SubTest Ŭ����");
		this.name =name;
		this.age = age;
		super.weight=w; //�̷��ԵǸ� �θ����� �ּҰ��� ���̷�Ʈ�� �������
		//this.weight = w ;
		super.height=h;
		//this.height = h ;
	}
	
	public void output() {
		System.out.println("SubTestŬ������ output()");
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+age);
		System.out.println("������ = "+weight);
		System.out.println("Ű = "+height);
	}

	
	public static void main(String[] args) {
		SubTest aa= new SubTest("ȫ�浿",25,72.3,185.3);
		aa.output();
		System.out.println("------------------------------");
		aa.disp(); //�켱 SubTest���� ã�� ������ SuperTest�� ����.
		System.out.println("------------------------------");
		
		SuperTest bb = new SubTest("�ڳ�",13,25.6,158.7);//�� ������ ���̾���  �θ�� �ڽ�Ŭ������ ���� ����
//		bb.output(); - error
		bb.disp();
	}

} 
