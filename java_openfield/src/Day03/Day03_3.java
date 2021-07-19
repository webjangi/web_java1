package Day03;

import java.util.Scanner;

public class Day03_3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
		/*
		System.out.println("정수 입력 : "); int 문제3 = scanner.nextInt();
		// 배수찾기 : 값%수 == 0 [나머지가 0이면 그 값은 그수의 배수 ]
		System.out.println("입력하신 값은 7의배수 : " + (문제3%7==0));
		
		System.out.println("정수입력 : "); int 문제4 = scanner.nextInt();
		// 홀수/짝수찾기 : 값%2 == 0
		System.out.println("입력하신 값은 홀수 :" + (문제4%2==1));
        
		System.out.println("정수입력 :"); int 문제5 = scanner.nextInt();
		System.out.println( "입력하신 짝수인지 또는 7읠 배수 : " + (문제5%7==0 && 문제5%2==0));
		
		System.out.println("정수1입력 :"); int 문제6_1 = scanner.nextInt();
		System.out.println("정수2입력 :"); int 문제6_2 = scanner.nextInt();
		System.out.println("두 정수중 정수1 더 크다:" + (문제6_1 > 문제6_2));
		
		System.out.println("반지름 :"); int 문제7 = scanner.nextInt();
		double 원넓이 = 문제7 * 문제7 *3.14;
		System.out.println("입력한 반지름의 원 넓이는 : " + 원넓이 );
		
		System.out.println("실수1 :"); double 문제8_1 = scanner.nextDouble();
		System.out.println("실수2 :"); double 문제8_2 = scanner.nextDouble();
		double 비율 = (문제8_1/문제8_2) * 100;
		System.out.println("실수1의 실수2의 백분율 : " + (비율)+ "%");
		System.out.printf("실수1의 실수2의 백분율 : %.2f %%", 비율);
		*/
		System.out.println("윗면 넓이1 : "); double 문제9_1 = scanner.nextDouble();
		System.out.println("밑면 넓이2 : "); double 문제9_2 = scanner.nextDouble();
		System.out.println("높이 : "); double 문제9_3 = scanner.nextDouble();
		double 사다리꼴 = (문제9_1*문제9_2) * 문제9_3 /2;
		System.out.println("사다리꼴 넓이 :" + (사다리꼴));
	}

	
	

	
	
}
