package Day11;

import java.util.Scanner;

public class Day11_3 {
	
	public static void main(String[] args) {
		
		//�������̽� ����		
		ATM atm;
		
		//2. ����
		atm = new ����();
		
		while (true) {			
			Scanner input = new Scanner(System.in);			
			System.out.println("1.���� 2.����");
			
			int ch = input.nextInt();
			
			if(ch==1) {
				atm= new ��������();
				// ����Ŭ������ ����� �������̽��� ����Ŭ���������� ��� ����
				atm.menu();
			}		
			
			
		}//while end
		
		
		
	}

}