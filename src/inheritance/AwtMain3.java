package inheritance;

import java.awt.Button;
import java.awt.Frame;

public class AwtMain3 extends Frame{
	private Button newBtn, exitBtn;//필드
	
	
	public void init() {
		newBtn = new Button("새로만들기");
		exitBtn = new Button("종료");
		
		
		setLayout(null);
		newBtn.setBounds(100, 100, 120, 50);
		add(newBtn);
		exitBtn.setBounds(100, 155, 120, 50);
		add(exitBtn);
		
		setBounds(500,150,300,400); // 창의 위치와 크기
		setVisible(true); // 창을 띄우는것
	}

	public static void main(String[] args) {
		new AwtMain3().init();

	}

}
