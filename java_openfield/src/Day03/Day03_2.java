package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		// 0. �Է°�ü ����
		Scanner �Է°�ü = new Scanner(System.in);
		
		//1. ������ �Է°� ����
		
		System.out.println("�⺻�� �Է� : "); int �⺻�� = �Է°�ü.nextInt();
		System.out.println("���� �Է�"); int ���� = �Է°�ü.nextInt();
		
		//2. ���� ���
		
		int �Ǽ��ɾ� = �⺻�� + ���� - (int)(�⺻��*0.1);	
		System.out.println("�� ���ɾ� : " +�Ǽ��ɾ� );		
		
		
		//3. �ʸ������� ����
		// �ݾ� : 356789
		
		System.out.println("�ݾ��Է� :"); int �ݾ� = �Է°�ü.nextInt();	
		System.out.println("�ʸ����� :" + (�ݾ�/100000)+"��");
		//�ʸ����� ����
		�ݾ� -= (�ݾ�/100000)*100000;
		System.out.println("������ : " + (�ݾ�)/10000+"��");
		//������ ����
		�ݾ� -= (�ݾ�/10000)*10000;
		System.out.println("õ���� : " + (�ݾ�/1000)+"��");
		�ݾ� -=(�ݾ�/1000)*1000;
		System.out.println("����� : " +(�ݾ�/100)+"��");
		
		
		
		
		
		
	}

}