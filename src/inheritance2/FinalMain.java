package inheritance2;

public class FinalMain {
	public final String FRUIT = "���";
	public final String FRUIT2;
	
	public static final String ANIMAL = "ȣ����";
	public static final String ANIMAL2;
	static {
		ANIMAL2 = "�⸰";
	}
	
	public FinalMain() {
		FRUIT2 = "����"; //�ʱ�ȭ �۾�
	}

	public static void main(String[] args) {
		final int AGE = 25;
		//AGE = 30;  -error final�̱⋚���� ����Ұ�.
		System.out.println("AGE = "+AGE);
		
		final int AGE2;
		AGE2=30;   // c���� error���� �ڹٿ��� ����
		System.out.println("AGE2 = "+AGE2);
		
		FinalMain fm = new FinalMain();
		System.out.println("FRUIT = " + fm.FRUIT);
		System.out.println("FRUIT2 = " + fm.FRUIT2);
		
		System.out.println("ANIMAL = " + FinalMain.ANIMAL);
		System.out.println("ANIMAL = " + FinalMain.ANIMAL2);
		
		
		
		
		

	}

}
