package inheritance;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingMain extends JFrame{
	private JButton northBtn,southBtn,eastBtn,westBtn,centerBtn;
	private int a = 0;
	
	public void init() {
		//버튼생성
		northBtn = new JButton("북쪽");
		southBtn = new JButton("남쪽");
		eastBtn = new JButton("동쪽");
		westBtn = new JButton("서쪽");
		centerBtn = new JButton(new ImageIcon("망.gif"));
		
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
		new SwingMain().init();

	}

}
