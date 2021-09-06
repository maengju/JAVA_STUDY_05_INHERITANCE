package inheritance;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

//Frame�� BorderLayout(��������) - �������Ͽ��� �Ѱ��� ��ư�� ������ �ִ�.
public class AwtMain2 extends Frame{
	private Button newBtn, exitBtn;
	
	public void init() {
		//���⼱ super ���Ұ� �⺻�����ڿ����� ȣ�Ⱑ��
		newBtn = new Button("���θ����");
		exitBtn = new Button("����");
		
		Panel p = new Panel();//��ݿ�Ȱ �ѹ����� �����ű⋚���� �ʵ尡 �ƴ� ����������
							//FlowLayout - ����� �߽����� ������� ��ġ
		
		p.setLayout(new GridLayout(2,1,5,0));//�յ�,�� ����ġ  (��,��,����,0)
		p.setBackground(new Color(255,200,255)); // ��׶��� �� 
		p.add(newBtn);
		p.add(exitBtn);
		
		add(p);
	
		
		setTitle("â");
		setBounds(500,150,300,400); // â�� ��ġ�� ũ��
		setVisible(true); // â�� ���°�
	}
	public static void main(String[] args) {
		new AwtMain2().init();
	}
}
