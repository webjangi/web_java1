package Day06;

import java.util.Scanner;


public class Day06_2 {
	
public static void main(String[] args) {
	int[] �����迭1 = new int[3]; // int�� 3���� ������ �� �ִ� �޸� �Ҵ���� �迭
	
	�����迭1[0] =3;
	�����迭1[0] =4;
	�����迭1[0] =5;
	
	// �迭����2 : ����� ���ÿ� �ʱⰪ 
	String[] ���ڿ��迭2 = {"���缮", "��ȣ��", "�ŵ���"};
	  //stringt Ŭ���� ��ü 3���� �����ϴ� �޸� �Ҵ���� �迭
	
	 Scanner scanner = new Scanner(System.in);
	 
	while(true) {//���ѷ��� [�������� : 4�� �������� break;]
	
		System.out.println("1. �л��� 2.�����Է� 3.�м� 4. ����");
		System.out.println("���� :"); int ch = scanner.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("�л��� �Է�:");break;
		case 2:
		 System.out.println("���� �Է� :");break;
		case 3:
			System.out.println("���� �Է� :");break;
		case 4:
			System.out.println("[[����]]");break;
		
		}
		
	}
	

	
	
	
	
	
}
	
	
}