package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_3 {
	
	public static void main(String[] args) {
		
	Scanner scaner = new Scanner(System.in);	
	Random random = new Random(); // ���� Ŭ������ �̿��� ���� ��ü
	
	//1. ������ ����		
	String[] ������ = {"[ ]", "[ ]","[ ]",
			           "[ ]","[ ]","[ ]", 
			           "[ ]","[ ]","[ ]"};
	
	
		while(true) {
			for (int i = 0; i<������.length; i++) {
				System.out.print(������[i]);
				if (i%3 == 2) System.out.println();
			}
				
			//3. �÷��̾�� ��ġ ���ù޾� �� �α�
			System.out.println("��ġ���� : "); int index =scaner.nextInt();
			//1. �̹� ���� �����ϴ� ��� �ٽ� �Է¹ޱ�
				if( ������[index].equals("[ ]")) { ������[index] = "[0]"; break;}
				  //string Ŭ������ == ���� ������ ���Ұ� [.equals]
				else {
					System.out.println("[[��]] �̹� �� �ڸ� �Դϴ�.[�ٽ��Է�]");
					
				 }				
				}
		//4. ��ǻ�Ͱ� ������������ �˵ΰ���
	int rindex = random.nextInt(9);
	System.out.println(random.nextInt());	
		
		
		}//while;

}