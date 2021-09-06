package inheritance;

import java.awt.Button;
import java.awt.Frame;


//Frame은 BorderLayout(동서남북)
public class AwtMain extends Frame{
	private Button northBtn,southBtn,eastBtn,westBtn,centerBtn;
	private int a = 0;
	
	public void init() {
		//버튼생성
		northBtn = new Button("북쪽");
		southBtn = new Button("남쪽");
		eastBtn = new Button("동쪽");
		westBtn = new Button("서쪽");
		centerBtn = new Button("중앙");
		
		//배치
		add("North",northBtn);
		add("South",southBtn);
		add("East",eastBtn);
		add("West",westBtn);
		add("Center",centerBtn);
		
		setBounds(500,150,300,400); // 창의 위치와 크기
		setVisible(true); // 창을 띄우는것
		
	}

	public static void main(String[] args) {
		new AwtMain().init();

	}

}
