package Day04;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class Day04_2 {
	
	public static void main(String[] args) {
		

		
			Scanner scanner = new Scanner(System.in);
			//��ǰ���� ������		
			int �ݶ���� = 10; int ȯŸ��� =10; int ���̴���� =10; //�������
			int �ݶ󱸸ż� = 0; int ȯŸ���ż� = 0; int ���̴ٱ��ż� =0; // ���ż� ����
			int �Ѱ����� = 0;	
			
			
			while(true) {						
				System.out.println("\n[[���Ǳ�]]");
				System.out.println("[[1.�ݶ�[300] 2.ȯŸ[200] 3.���̴�[100] 4.����");
				System.out.println("[[����]]"); int ���� = scanner.nextInt();
				if (���� == 1) {
					System.out.println("[[[�ݶ��� ��ҽ��ϴ�.]]");
					//1. ����� ���� ��� ���� �Ұ�.
					if(�ݶ���� > 0) { //����� ���� ���
						�ݶ󱸸ż�++; //�ݶ󱸸ż� ����
						�ݶ����--; //�ݶ���� ����
					}else {
						System.out.println("[[�ݶ� ����� �����ϴ�.]");
						}
				}
				if (���� == 2) {}
				if (���� == 3) {}
				if (���� == 4) {				
				System.out.println("[[[��ٱ���]]]");
				System.out.println("�ݶ� ���ż� :" + �ݶ󱸸ż� + "������ : " +�ݶ󱸸ż�*300);
				�Ѱ����� = (�ݶ󱸸ż�*300);
				System.out.println("�����Ͻðڽ��ϱ�? ��[1] �ƴϿ�[0]");int ����2 = scanner.nextInt();
				if(����2 == 1) {
					
					
				}
				
				}
									
				
			}// ���ѷ��� ���� ����
			
  }//main
	
}