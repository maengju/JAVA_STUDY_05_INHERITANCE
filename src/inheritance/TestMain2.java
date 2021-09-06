package inheritance;

class AA{
	public int a = 3;
	
	public void disp() {
		a+=5;
		System.out.println("AA : "+a+" ");
	}
}
//=============================================================================

class BB extends AA{
	public int a = 8;
	public void disp() {
		this.a += 5;    //this.a = this.a+5;
		System.out.println("BB : "+a+" ");
	}
}

//=============================================================================
public class TestMain2 {

	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp(); // BB 13
		System.out.println("aa : "+aa.a+" "); //aa:13
		System.out.println();
		
		AA bb = new BB();//부모 = 자식 - 다형성
		bb.disp(); //BB 13
		System.out.println("bb : "+bb.a);//3 (필드는 Override개념이 없다.)
		System.out.println();
		
		AA cc = new AA();
		cc.disp(); //AA 8
		System.out.println("cc : "+cc.a);//
		System.out.println();
		
		// 자식클래스를 부모클래스로 참조 할려면 캐스팅(형변환)을 해야한ㄷ
		// ex) 자식 = (자식)부모
		
		BB dd = (BB)bb; // 자식 = (자식)부모 - Casting(형변환) = 많이쓰는 구조
		dd.disp();
		System.out.println("dd : "+dd.a);//
		System.out.println();
		
	}

}
