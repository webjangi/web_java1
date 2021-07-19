package Day02;

import java.util.Scanner;

public class Day02_3 {
	
	public static void main(String[] args) {
		
		Scanner  입력객체 = new Scanner(System.in);
		/*
		System.out.print("학생의1의 이름입력:"); String 학생1 = 입력객체.next();
		System.out.print("학생의1의 1교시:"); int 학생1_1교시 = 입력객체.nextInt();
		System.out.print("학생의1의 2교시:"); int 학생1_2교시 = 입력객체.nextInt();
		System.out.print("학생의1의 3교시:"); int 학생1_3교시 = 입력객체.nextInt();
		
		
		System.out.print("학생의2의 이름입력:"); String 학생2 = 입력객체.next();
		System.out.print("학생의2의 1교시:"); int 학생2_1교시 = 입력객체.nextInt();
		System.out.print("학생의2의 2교시:"); int 학생2_2교시 = 입력객체.nextInt();
		System.out.print("학생의2의 3교시:"); int 학생2_3교시 = 입력객체.nextInt();
	
		
		System.out.println("========== 출석부 ========== ");
		System.out.println("학생명\t1교시\t2교시\t3교시");
		System.out.println(학생1+"\t"+학생1_1교시+"\t"+학생1_2교시+"\t"+학생1_3교시);
		System.out.println(학생2+"\t"+학생2_1교시+"\t"+학생2_2교시+"\t"+학생2_3교시);
		System.out.println("========================== ");
		*/
		
	
		System.out.print("가입할 아이디 :"); String 아이디 = 입력객체.next();		
		System.out.print("가입할 비밀번호 :"); short 비밀번호 = 입력객체.nextShort();
		System.out.print("가입할 성명 :"); String 이메일 = 입력객체.next();
		System.out.print("가입할 이메일 :"); String 성명 = 입력객체.next();
	
		System.out.println("========== 회원가입 완료 ========== ");
		System.out.println("아이디\t비밀번호\t이메일\t성명");
		System.out.println(아이디+"\t"+비밀번호+"\t"+이메일+"\t"+성명);
		System.out.println("========================== ");
		
	}

}
