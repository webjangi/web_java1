package Day08;

import java.util.Scanner;

public class Day08_2_Start {

	public static Scanner input = new Scanner(System.in);
	
	public static board[] list= new board[100];
	
	
	public static void main(String[] args) {
		
		//2. �޼ҵ� ȣ�� 
	   start(); //main �޼ҵ尡 start �޼ҵ带 ������ [static]
		
	}//main end

		//1. �޼ҵ� ����
		//���α׷� ���� �޼ҽ�
	public static void start() {
		
		board board = new board(); // �ʵ尡 null�� ���� ��ü
		
		while(true) {		
			 board.bo_list(); //1. �۸��
			 System.out.println("0.�۾��� 1.�ۻ󼼺��� ");
			 int ch = input.nextInt();
			 if(ch==0) board.bo_write(); //�۾���
			 if(ch==1) {
				 int ch2 = input.nextInt();
				 board.bo_view(ch2); // �� ���̹���
			 }
		}
		
	}
	
	
}// class end