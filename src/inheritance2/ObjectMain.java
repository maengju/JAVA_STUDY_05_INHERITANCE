package inheritance2;

class Test extends Object {
	@Override
	public String toString() {
		return getClass()+"@다들 가껨 로아합시다 제발";
	}
}
//===========================================================================

class Sample{
	
}







//===========================================================================
public class ObjectMain {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = "+t);
		System.out.println("객체 t = "+t.toString());  //클래스@16진수
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = "+s.toString());
		System.out.println("객체 s = "+s.hashCode());
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str = "+str.toString()); // 문자열
		System.out.println("객체 str = "+str.hashCode()); //10진수 - 문자열을 다 표현해주지 못한다.
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : "+(aa==bb));
		System.out.println("aa.equals(bb) : "+(aa.equals(bb)));//String타입일경우 문자열 비교
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : "+(cc==dd));  //주소
		System.out.println("cc.equals(dd) : "+(cc.equals(dd))); //주소 비교(Object타입이기때문)
		System.out.println();
		
	
	}
}
