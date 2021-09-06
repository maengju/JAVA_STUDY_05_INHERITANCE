package inheritance;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

//Frame은 BorderLayout(동서남북) - 동서남북에는 한개의 버튼만 넣을수 있다.
public class AwtMain2 extends Frame{
	private Button newBtn, exitBtn;
	
	public void init() {
		//여기선 super 사용불가 기본생성자에서만 호출가능
		newBtn = new Button("새로만들기");
		exitBtn = new Button("종료");
		
		Panel p = new Panel();//쟁반역활 한번쓰고 버릴거기떄문에 필드가 아닌 지역변수로
							//FlowLayout - 가운데를 중심으로 순서대로 배치
		
		p.setLayout(new GridLayout(2,1,5,0));//균등,행 열배치  (행,열,여백,0)
		p.setBackground(new Color(255,200,255)); // 백그라운드 색 
		p.add(newBtn);
		p.add(exitBtn);
		
		add(p);
	
		
		setTitle("창");
		setBounds(500,150,300,400); // 창의 위치와 크기
		setVisible(true); // 창을 띄우는것
	}
	public static void main(String[] args) {
		new AwtMain2().init();
	}
}
