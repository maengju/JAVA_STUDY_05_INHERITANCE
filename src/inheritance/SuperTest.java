package inheritance;

public class SuperTest {
	protected double weight, height;
	
	public SuperTest() {
		System.out.println("SuperTest Ŭ���� �⺻ ������");
	}
	
	
	//2���� �Ű�����(�μ�)�� ���� �����ڸ� ������ּ���
	SuperTest(double w , double h ){
		System.out.println("SuperTest Ŭ����  ������");
		this.weight=w ;
		this.height=h ;
	}//������
	
	
	public void disp() {
		System.out.println("SuperTest Ŭ����  disp()");
		System.out.println("������ = "+weight);
		System.out.println("Ű = "+height);
	}//���
}
