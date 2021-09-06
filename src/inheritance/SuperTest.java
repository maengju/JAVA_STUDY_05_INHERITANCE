package inheritance;

public class SuperTest {
	protected double weight, height;
	
	public SuperTest() {
		System.out.println("SuperTest 클래스 기본 생성자");
	}
	
	
	//2개의 매개변수(인수)를 갖는 생성자를 만들어주세요
	SuperTest(double w , double h ){
		System.out.println("SuperTest 클래스  생성자");
		this.weight=w ;
		this.height=h ;
	}//생성자
	
	
	public void disp() {
		System.out.println("SuperTest 클래스  disp()");
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}//출력
}
