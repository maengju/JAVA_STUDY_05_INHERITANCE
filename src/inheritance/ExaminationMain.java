/*
 이름과 5개의 답을 입력하여 OX로 채점하시오
 - 총 문제수는 5문제이다
 점수는 1문제당 20점입니다.
 [실행결과]
 이름입력 : 홍길동
 답 입력 14123
 
 이름 	1 2 3 4 5 점수
 홍길동 	o X O X X 40
 
 클래스 : Examination
 필드 : name, dap, ox[] score
 메소드 : 생성자 - Scanner
 		compare() - 비교,점수 계산
 		getter
  
  
  [실행결과]
인원수 입력 : 3

이름 입력 : 홍길동
답 입력 : 13211

이름 입력 : 코난
답 입력 : 11111

이름 입력 : 또치
답 입력 : 13242

이름      1 2 3 4 5   점수
홍길동     O X X O O   60
코난      O O O O O   100
또치      O X X X X   20
 
 */




package inheritance;

import java.util.Scanner;

public class ExaminationMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i,j;
		
		
		
		System.out.print("인원수 입력 : ");
		int num = scan.nextInt();
		
		//배열생성
		Examination[] ex = new Examination[num]; // Object[] ex로 변경가능(최상위 클래스이기때문
		for(i = 0; i<ex.length; i++) {
			ex[i] = new Examination();//클래스 생성
		}
		
		
		
		//출력문
		System.out.println("이름\t1 2 3 4 5 \t점수");
	
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
