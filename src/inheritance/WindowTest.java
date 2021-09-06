package inheritance;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame { //WindowTest is a Frame
	
	public WindowTest() {
		
		super("내가만든 그림판");//부모생성자 호출
		//setTitle("내가만든 그림판"); //프로그램 제목
		
		setFont(new Font("맑은 고딕",Font.BOLD,14)); //(,,,) 폰트,굵기(1)기울기(2),크기
		System.out.println("도형");
		setForeground(Color.BLACK);
		//윈도우는 바탕은 흰색 글자색은 검정이 기본
		//setBackground(Color.YELLOW);//색을 바꿀수있음 
		
		setBackground(new Color(166,235,242));//Color클래스의 생성자에 R,G,B를 호출
		
		//setSize(300,400); // 창의 크기만
		setBounds(500,150,300,400); // 창의 위치와 크기
		setVisible(true); // 창을 띄우는것
	}
	@Override
	public void paint(Graphics g) { // 구현, 어떠한 때가 되면 JVM이 호출하는 메소드 (콜백 메소드)
		g.drawString("도형", 100, 80);//글쓰기
		g.drawLine(100, 100, 300, 300);//선긋기
		g.drawRect(150,200,20,50); //사각형 위치  높이  길이
		//g.drawOval(40, 150, 40,40 );//원그리기
		g.fillOval(40, 150, 40,40 );//속이찬 원그리기
	}

	public static void main(String[] args) {

		new WindowTest();


	}

}
