/*
 �̸��� 5���� ���� �Է��Ͽ� OX�� ä���Ͻÿ�
 - �� �������� 5�����̴�
 ������ 1������ 20���Դϴ�.
 [������]
 �̸��Է� : ȫ�浿
 �� �Է� 14123
 
 �̸� 	1 2 3 4 5 ����
 ȫ�浿 	o X O X X 40
 
 Ŭ���� : Examination
 �ʵ� : name, dap, ox[] score
 �޼ҵ� : ������ - Scanner
 		compare() - ��,���� ���
 		getter
  
  
  [������]
�ο��� �Է� : 3

�̸� �Է� : ȫ�浿
�� �Է� : 13211

�̸� �Է� : �ڳ�
�� �Է� : 11111

�̸� �Է� : ��ġ
�� �Է� : 13242

�̸�      1 2 3 4 5   ����
ȫ�浿     O X X O O   60
�ڳ�      O O O O O   100
��ġ      O X X X X   20
 
 */




package inheritance;

import java.util.Scanner;

public class ExaminationMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i,j;
		
		
		
		System.out.print("�ο��� �Է� : ");
		int num = scan.nextInt();
		
		//�迭����
		Examination[] ex = new Examination[num]; // Object[] ex�� ���氡��(�ֻ��� Ŭ�����̱⶧��
		for(i = 0; i<ex.length; i++) {
			ex[i] = new Examination();//Ŭ���� ����
		}
		
		
		
		//��¹�
		System.out.println("�̸�\t1 2 3 4 5 \t����");
	
		for(i = 0; i<ex.length; i++) {
			ex[i].compar();
			System.out.print(ex[i].getName()+"\t");
			
			for(j=0;j<ex[i].getOx().length; j++) {
			System.out.print(ex[i].getOx()[j]+" ");
			}
			System.out.print("\t"+ex[i].getScore());
			System.out.println();
		}
			
		
		
		
		
	}

}
