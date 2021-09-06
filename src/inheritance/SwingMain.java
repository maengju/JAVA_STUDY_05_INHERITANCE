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
		//��ư����
		northBtn = new JButton("����");
		southBtn = new JButton("����");
		eastBtn = new JButton("����");
		westBtn = new JButton("����");
		centerBtn = new JButton(new ImageIcon("��.gif"));
		
		//��ġ
		add("North",northBtn);
		add("South",southBtn);
		add("East",eastBtn);
		add("West",westBtn);
		add("Center",centerBtn);
		
		setBounds(500,150,300,400); // â�� ��ġ�� ũ��
		setVisible(true); // â�� ���°�
	}

	public static void main(String[] args) {
		new SwingMain().init();

	}

}
