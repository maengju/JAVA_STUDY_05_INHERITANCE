package inheritance2;

class Test extends Object {
	@Override
	public String toString() {
		return getClass()+"@�ٵ� ���� �ξ��սô� ����";
	}
}
//===========================================================================

class Sample{
	
}







//===========================================================================
public class ObjectMain {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("��ü t = "+t);
		System.out.println("��ü t = "+t.toString());  //Ŭ����@16����
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("��ü s = "+s.toString());
		System.out.println("��ü s = "+s.hashCode());
		System.out.println();
		
		String str = "apple";
		System.out.println("��ü str = "+str.toString()); // ���ڿ�
		System.out.println("��ü str = "+str.hashCode()); //10���� - ���ڿ��� �� ǥ�������� ���Ѵ�.
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : "+(aa==bb));
		System.out.println("aa.equals(bb) : "+(aa.equals(bb)));//StringŸ���ϰ�� ���ڿ� ��
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : "+(cc==dd));  //�ּ�
		System.out.println("cc.equals(dd) : "+(cc.equals(dd))); //�ּ� ��(ObjectŸ���̱⶧��)
		System.out.println();
		
	
	}
}
