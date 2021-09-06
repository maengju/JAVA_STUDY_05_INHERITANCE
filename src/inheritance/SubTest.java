package inheritance;

public class SubTest extends SuperTest{
	private String name;
	private int age;
	


	public SubTest(String name, int age, double w, double h ) {
		System.out.println("SubTest 클래스");
		this.name =name;
		this.age = age;
		super.weight=w; //이렇게되면 부모인자 주소값을 다이렉트로 가지고옴
		//this.weight = w ;
		super.height=h;
		//this.height = h ;
	}
	
	public void output() {
		System.out.println("SubTest클래스의 output()");
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}

	
	public static void main(String[] args) {
		SubTest aa= new SubTest("홍길동",25,72.3,185.3);
		aa.output();
		System.out.println("------------------------------");
		aa.disp(); //우선 SubTest에서 찾고 없으면 SuperTest로 간다.
		System.out.println("------------------------------");
		
		SuperTest bb = new SubTest("코난",13,25.6,158.7);//이 개념을 많이쓴다  부모는 자식클래스를 참조 가능
//		bb.output(); - error
		bb.disp();
	}

} 
