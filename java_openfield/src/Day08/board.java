package Day08;

import java.util.Scanner;

public class board {
	// �Խ��� Ŭ����
	
	//1.�ʵ�
		//1.��ȣ
		int number;		
		//2.����
		String subject;		
		//3.����
		String content;
		//4.�ۼ���
		String name;
		//5.�ۼ���
		String day;		
		//6.��ȸ��
		String hit;
	
	//2. ������
		//1.�������
		public board() {	
		}
		
		// ��� �ʵ带 �޴� ������
		public board(int number, String subject, String content, String name, String day, String hit) {
		
			this.number = number;
			this.subject = subject;
			this.content = content;
			this.name = name;
			this.day = day;
			this.hit = hit;
		}		
		//3. ��Ÿ ���
	
	//3. �޼ҵ�
		//1. �۾���
		public void bo_write() {
			Scanner input = new Scanner(System.in);
		 System.out.println("[[�۾��� ������]]");
		 System.out.println("������ : "); String subject = input.next();
		 System.out.println("�۳��� : "); String content = input.next();
		 System.out.println("�ۼ��� : "); String name = input.next();
		 
		 //1. ��ü ����
		 
		 board board = new board(number, subject, content, name, hit);
		 //2. ������ ��ü ������ �޸� ?? (�ֱ�� ��ġ) [�迭, ����Ʈ ��]
		 
		 
		 Day08_2_Start.list[0] = board;
		 //3. ���α׷� ����� ����Ǵ� �޸�(�����������) [����ó��, datebase��]
		 
		 
		}		


		//2. �۸��
		public void bo_list() {
			 System.out.println("[[�۸�� ������]]");
		}		
		//3. �ۼ���
		public void bo_update() {
			 System.out.println("[[�ۼ��� ������]]");
		}		
		//4. �ۻ���
		public void bo_delete() {}
		//5. ��ȸ������
		public void bo_hit() {
			 System.out.println("[[��ȸ������ ������]]");
		}		
		//6. �� ��������
		public void bo_view() {
			 System.out.println("[[�������� ������]]");
		}	 
	
	

}