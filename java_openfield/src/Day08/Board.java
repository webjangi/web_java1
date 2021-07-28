package Day08;

import java.util.Date;
import java.util.Scanner;

public class Board {
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
		int hit;
	
	//2. ������
		// [ �����ڸ� == Ŭ������ ����]
		//1.������� [ ctrl+�����̹� 
		public Board() {	
		}
		
		// ��� �ʵ带 �޴� ������
		public Board(int number, String subject, String content, String name, String day, int hit) {
		
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
		 int number = 1; // �ε��� -1 ����
		 	// �Խù���ȣ [1. �ڵ�[db] 2. ����]
		 	for(int i=0; i<Day08_2_Start.list.length; i++) {
		 		if(Day08_2_Start.list[i] == null ) {
		 			
		 			//1.ù��° �Խù��� ��� 1���� ����
		 			if(i == 0) {
		 				number = 1; break;
		 			}
		 			else {
			 			number = Day08_2_Start.list[i-1].number + 1; break;
			 			
			 		}	
		 		}
		 	}
		 Date date = new Date(); //���ó�¥/�ð� Ŭ����
		 String day = date.toString(); //��¥��ü�� ����
		 int hit = 1; //  �Խù� �ۼ��� ��ȸ�� 1���� ����
		 	
		 Board board = new Board(number, subject, content, name, day, hit);
		
		 //2. ������ ��ü ������ �޸� ?? (�ֱ�� ��ġ) [�迭, ����Ʈ ��]
		 for(int i=0; i<Day08_2_Start.list.length; i++) {
			 if(Day08_2_Start.list[i]==null) {
				 Day08_2_Start.list[i]= board;
				 break;
			 }
		 }
		 
		 
		// Day08_2_Start.list[0] = board;
		 //3. ���α׷� ����� ����Ǵ� �޸�(�����������) [����ó��, datebase��]
		 
		 
		}		


		//2. �۸��
		public void bo_list() {
			 System.out.println("[[�۸�� ������]]");
			 System.out.println("��ȣ\t����\t\t�ۼ���\t��ȸ��\t�ۼ���");
			 
			 for(int i=0; i<Day08_2_Start.list.length; i++) {				 
				 if(Day08_2_Start.list[i] == null) return;
				 System.out.print(Day08_2_Start.list[i].number + "\t");
				 System.out.print(Day08_2_Start.list[i].subject + "\t");
				 System.out.print(Day08_2_Start.list[i].name + "\t");
				 System.out.print(Day08_2_Start.list[i].hit + "\t");
				 System.out.print(Day08_2_Start.list[i].day + "\t");
				 System.out.println();
			 }
		}		
		//3. �ۼ���
		public void bo_update(int number) {
			Scanner input = new Scanner(System.in);
			 System.out.println("[[�ۼ��� ������]]");
			
			int index = findboard(number);
			if(index== -1)return;		
			System.out.print("���� :");
			Day08_2_Start.list[index].subject = input.nextLine();
			System.out.print("���� :");
			Day08_2_Start.list[index].subject = input.nextLine();
			System.out.println("�����Ϸ�");
			
		}		
		//4. �ۻ���
		public void bo_delete(int number) {
			System.out.println("[[�ۻ��� ������]]");
			System.out.println("[[ �ش� �Խù��� ���� �Ǿ����ϴ�. ]]");
			
			int index = findboard(number);
			if(index == -1) return;
			
			// �ش� �Խù���ȣ�� ��ü ���� 
			Day08_2_Start.list[index] = null;
			//������ �Խù� �ڷ� ����
			for(int j= index; j<Day08_2_Start.list.length; j++) {
				
				//���� ��ü�� ������
				if(Day08_2_Start.list[j+1] != null) {
				   Day08_2_Start.list[j] = Day08_2_Start.list[j+1];
				}else {
					Day08_2_Start.list[j] = null;	
					break;
				}	
			}			
			
		}
		
		//5. ��ȸ������
		public void bo_hit() {
			// System.out.println("[[��ȸ������ ������]]");
			 this.hit++;
		}		
		//6. �� ��������
		public void bo_view(int number) { //�μ�
			
			
				//�Խù� ã�� �޼ҵ� ȣ��
			int index = findboard(number);
			if(index == -1) return; // ���࿡ -1�̸� ���� �޼ҵ� ����
			
			Board board = Day08_2_Start.list[index];			
		    board.bo_hit(); // ��ȸ�� ���� �޼ҵ� ȣ��
				
			
			if(board == null) return;
			
			 System.out.println("[[�������� ������]]");
			 System.out.println("���� :" + board.subject);
			 System.out.println("�ۼ��� :"+board.name + "   ��ȸ�� :"+board.hit+ "   �ۼ��� :"+board.day);
			 System.out.println("���� :");
			 System.out.println("1.���� 2.���� 3.����ۼ� 4.�ڷΰ���");
			 Scanner input = new Scanner(System.in);			 
			 int ch = input.nextInt();
			 if (ch == 1) {}
			 if (ch == 2)  { bo_delete(number); return;}
			 if (ch == 3) {}
			 if (ch == 4) {
				 return; // �޼ҵ� ����
			 }			 
		}	 
	
		//7. �Խù���ȣ�� �ش��ϴ� �迭�� ��ġ�� ã�� �޼ҵ�.
		public int findboard (int number) {
			
			for(int i=0; i<Day08_2_Start.list.length; i++) {				
				 if(Day08_2_Start.list[i] != null && Day08_2_Start.list[i].number == number ) {					 
					 return i; // ã�� �Խù��� �迭��ġ�� ��ȯ				
				 }				
			}
			
			System.out.println("[[����]] �ش� �Խù� ��ȣ�� �����ϴ�.");
			return -1; // �迭�� ������ 0���� -1
		}
		// ��ȯŸ�� : ã�� �迭�� ��ġ ��ȯ

}