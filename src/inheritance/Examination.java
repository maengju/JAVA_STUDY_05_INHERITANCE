

package inheritance;

import java.util.Scanner;

public class Examination {
	
	Scanner scan = new Scanner(System.in);
	
	public static final String JUNG = "11111"; //����, ���ȭ��ų���� ���δ� �빮��
								// ���ȭ �������� public�� static���� �Ŵ°� �⺻ ��Ģ
	
	private int i,score;
	private char[] ox = new char[5];
	private String name,dap;
	
	
	
	public Examination() {
			System.out.print("�̸� �Է� : ");
			this.name = scan.next();
			System.out.print("�� �Է� : ");
			this.dap = scan.next();
			System.out.println();
		
	}

	
	public void compar() {
		
		int count=0;
		for(i=0; i<ox.length;i++) {
			char a = dap.charAt(i);
			char b = JUNG.charAt(i);
			if(a==b) {
				ox[i]='O';
				count++;
			}else ox[i]='X';
			score=20*count;
		}
	}
	
	public char[] getOx() {
		return ox;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	
	
	
}
