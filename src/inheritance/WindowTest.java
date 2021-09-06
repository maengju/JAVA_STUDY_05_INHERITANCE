package inheritance;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame { //WindowTest is a Frame
	
	public WindowTest() {
		
		super("�������� �׸���");//�θ������ ȣ��
		//setTitle("�������� �׸���"); //���α׷� ����
		
		setFont(new Font("���� ���",Font.BOLD,14)); //(,,,) ��Ʈ,����(1)����(2),ũ��
		System.out.println("����");
		setForeground(Color.BLACK);
		//������� ������ ��� ���ڻ��� ������ �⺻
		//setBackground(Color.YELLOW);//���� �ٲܼ����� 
		
		setBackground(new Color(166,235,242));//ColorŬ������ �����ڿ� R,G,B�� ȣ��
		
		//setSize(300,400); // â�� ũ�⸸
		setBounds(500,150,300,400); // â�� ��ġ�� ũ��
		setVisible(true); // â�� ���°�
	}
	@Override
	public void paint(Graphics g) { // ����, ��� ���� �Ǹ� JVM�� ȣ���ϴ� �޼ҵ� (�ݹ� �޼ҵ�)
		g.drawString("����", 100, 80);//�۾���
		g.drawLine(100, 100, 300, 300);//���߱�
		g.drawRect(150,200,20,50); //�簢�� ��ġ  ����  ����
		//g.drawOval(40, 150, 40,40 );//���׸���
		g.fillOval(40, 150, 40,40 );//������ ���׸���
	}

	public static void main(String[] args) {

		new WindowTest();


	}

}
