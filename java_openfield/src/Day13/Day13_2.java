package Day13;

import java.util.Scanner;

public class Day13_2 {
	
	public static void main(String[] args) {
		
			// ���ڿ� ã��  []
		String ���ڿ�1 = "�ڹ� ���α׷���";
		int index = ���ڿ�1.indexOf("���α׷���");
		System.out.println("�˻��� ������ ��ġ :" + index);
		
		
		String ���� = "����ִ� ���̽� �Թ� ����";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ű���� : "); String �˻��� = scanner.next();
		
		if( ����.indexOf(�˻���) !=-1 ) {
			System.out.println("���̽� ���� �����Դϴ�." + ����);
		}else { 
			System.out.println("���̽� ���� ������ �ƴմϴ�.");
		}
		
		// ���ڿ� ���� [length()] ��ȯ : ���ڼ� 
		System.out.println("���ڿ�1 ���ڼ� :" + ���ڿ�1.length());
		
			// ��ȿ���˻�
			String �ֹε�Ϲ�ȣ = "8005211055919";
			if(�ֹε�Ϲ�ȣ.length()==13) {
				System.out.println( "�������� �ֹι�ȣ�Դϴ�. ");
				
			}else {
				System.out.println("���ڼ��� Ʋ�Ƚ��ϴ�. ");
				}
		
			// ���ڿ� �߶󳻱� [substring()] : �ε���[��ġ] �������� �ڸ���. 
		System.out.println(�ֹε�Ϲ�ȣ.substring(6)); // 6�� �ε��� ���� ���
		System.out.println(�ֹε�Ϲ�ȣ.substring(0, 6));		
		// ���ڿ� ���� [ split()]	: ���ڱ���
			String[] ���� = �ֹε�Ϲ�ȣ.split("2") ;	
			System.out.println(����[0]);
			System.out.println(����[1]);
			System.out.println(����[2]);
			System.out.println(����[3]);
		
		//���ڿ� ��ü [replace("��ü�� ����", "���ο��")] :
		String ���ڿ�2 = "�ڹٽ�ũ��Ʈ";
		String ��ü���� = ���ڿ�2.replace("�ڹ�", "JAVA");
		System.out.println(���ڿ�2);
		System.out.println(��ü����);
		// �빮�� ��ȯ
		String ���ڿ�3 = "java programming";
		System.out.println("�ҹ��� : " + ���ڿ�3.toLowerCase());
		System.out.println("�빮�� : " + ���ڿ�3.toUpperCase());
	
		// ���� ���� [trim()] : �յ� ���� ����
		String ���ڿ�4 = "�ڹ�        ���α׷���      ";
				System.out.println("�������� :" + ���ڿ�4.trim());
		
		//���ڿ� ��ȯ []
		String ���ڿ�5 = String.valueOf(10); // ���� [int] 10�� ���ڿ� 10���� ��ȯ
				System.out.println("���� -> ���� :" + ���ڿ�5);
		
		String ���ڿ�6 = String.valueOf(10.5); // ���� [int] 10�� ���ڿ� 10���� ��ȯ		
				System.out.println("���� -> ���� :" + ���ڿ�6);
	}
	

}