package inheritance;

import java.awt.Button;
import java.awt.Frame;

public class AwtMain3 extends Frame{
	private Button newBtn, exitBtn;//�ʵ�
	
	
	public void init() {
		newBtn = new Button("���θ����");
		exitBtn = new Button("����");
		
		
		setLayout(null);
		newBtn.setBounds(100, 100, 120, 50);
		add(newBtn);
		exitBtn.setBounds(100, 155, 120, 50);
		add(exitBtn);
		
		setBounds(500,150,300,400); // â�� ��ġ�� ũ��
		setVisible(true); // â�� ���°�
	}

	public static void main(String[] args) {
		new AwtMain3().init();

	}

}
