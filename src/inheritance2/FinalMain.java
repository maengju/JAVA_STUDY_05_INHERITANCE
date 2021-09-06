package inheritance2;

public class FinalMain {
	public final String FRUIT = "사과";
	public final String FRUIT2;
	
	public static final String ANIMAL = "호랑이";
	public static final String ANIMAL2;
	static {
		ANIMAL2 = "기린";
	}
	
	public FinalMain() {
		FRUIT2 = "딸기"; //초기화 작업
	}

	public static void main(String[] args) {
		final int AGE = 25;
		//AGE = 30;  -error final이기떄문에 변경불가.
		System.out.println("AGE = "+AGE);
		
		final int AGE2;
		AGE2=30;   // c언어에선 error지만 자바에선 가능
		System.out.println("AGE2 = "+AGE2);
		
		FinalMain fm = new FinalMain();
		System.out.println("FRUIT = " + fm.FRUIT);
		System.out.println("FRUIT2 = " + fm.FRUIT2);
		
		System.out.println("ANIMAL = " + FinalMain.ANIMAL);
		System.out.println("ANIMAL = " + FinalMain.ANIMAL2);
		
		
		
		
		

	}

}
