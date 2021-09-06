

package inheritance;

import java.util.Scanner;

public class Examination {
	
	Scanner scan = new Scanner(System.in);
	
	public static final String JUNG = "11111"; //정답, 상수화시킬때는 전부다 대문자
								// 상수화 시켯을떈 public과 static으로 거는게 기본 원칙
	
	private int i,score;
	private char[] ox = new char[5];
	private String name,dap;
	
	
	
	public Examination() {
			System.out.print("이름 입력 : ");
			this.name = scan.next();
			System.out.print("답 입력 : ");
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
