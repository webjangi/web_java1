package Day12;

import java.util.Scanner;

public class Day12_1 {	
	
	// ����ó�� : ����[����] �߻������� ��� ó�� �ڵ�
		// ���� : ���ܰ� �߻����� �� ���α׷� ���� ���� [���α׷� ����ȭ]
		// �ڵ�� ������ �����Ϸ� [����] X
		// �ڵ�� ������ ������ ����� �Ŀ� ���α׷� ����� ����
		// ���� ó����� 
			//1. IF : �̹� �˰� �ִ� ������ ���
			//2. tr~catch : �پ��� ����� ������ ��� 
		//����
			//try { ���ܰ� �߻��ҰͰ��� �ڵ� }catch(����Ŭ���� ��ü��){ ���ܴ�ü�ڵ� }
	public static void main(String[] args) {
		
		// 1. ��ü�� null �ΰ�� ���
		try {
			//���ܰ� �߻��ϸ� catch �̵� // �ƴϸ� �״�� ����
			String ���ڿ� = null;
			System.out.println(���ڿ�);
			System.out.println(���ڿ�.toString()); 
		}
		catch ( NullPointerException exception) {
				// ����Ŭ������ ��ü��(����)
			System.out.println("�����߻� : ���� "+ exception);
			System.out.println("[[�����ڿ��� ����]] ");
			
		}
		
		
		//2. �迭�� index�� ������ ���
		
		try {
	String[] ���ڿ� = new String[2];		
		���ڿ�[0] = "��ȣ��";
		���ڿ�[1] = "���缮";
		���ڿ�[2] = "�ŵ���";
	}
	catch (ArrayIndexOutOfBoundsException exception) {
		System.out.println("�����߻� :" + exception);
		System.out.println("[[���̻� �ο��� �߰��� �� �����ϴ�.]]");
		
	}
	
		//3. ���� => ���� ���氡��	
		try {
			String  ���ڿ�2 = "100";
			String  ���ڿ�3 = "��100";
			
			System.out.println(Integer.parseInt(���ڿ�2));
						// Integer.parseInt(���ڿ�2) : ���ڿ� => ����
			System.out.println(Integer.parseInt(���ڿ�3));
		}
		catch(NumberFormatException exception) {
			System.out.println("�����߻� :" + exception);
		}
		
		
		//4. ����Ŭ������ �� ���
		
		try {
		String ���ڿ� = null;
		System.out.println(���ڿ�);
		//System.out.println(���ڿ�.toString()); 
			
		String[] ���ڿ��迭 = new String[2];		
		���ڿ��迭[0] = "��ȣ��";
		���ڿ��迭[1] = "���缮";
		���ڿ��迭[2] = "�ŵ���";
		
		String  ���ڿ��迭2 = "100";
		String  ���ڿ��迭3 = "��100";
		
		System.out.println(Integer.parseInt(���ڿ��迭2));	
		System.out.println(Integer.parseInt(���ڿ��迭3));
		
		}catch(Exception exception) {
			System.out.println("���ܹ߻� :" + exception);
		}finally {
			System.out.println("������ ����Ǵ� finally �ڵ�" );
		}
		
		
		
		while(true) {
		Scanner scanner = new Scanner(System.in);
		
			try {
			System.out.println("�����Է� �ޱ� ");
			int ���� = scanner.nextInt();
			}catch (Exception exception ) {
				System.out.println("�����߻� : " + exception );
			}
		
			
		}
		
		
		
		
	}	
}