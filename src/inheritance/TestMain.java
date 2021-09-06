package inheritance;
class Test{
	int a,b;
}




//===================================================================
public class TestMain {

	public static void main(String[] args) {
		Test aa = new Test();
		Test bb = aa; // aa 와 bb가 같은 주소를 갖게됨
		aa.a=2;
		aa.b=5;
		System.out.println(aa.a+"\t"+aa.b); // 2 5
		System.out.println(bb.a+"\t"+bb.b); // 2 5 
		System.out.println();
		
		bb.a=7;
		bb.b=9;
		System.out.println(aa.a+"\t"+aa.b); // 
		System.out.println(bb.a+"\t"+bb.b); //  
		System.out.println();
		
		bb= new Test(); //새로운 주소값을 주게됨
		bb.a=10;
		bb.b=20;
		System.out.println(aa.a+"\t"+aa.b); // 7	9
		System.out.println(bb.a+"\t"+bb.b); // 10	20
		System.out.println();
	}

}
