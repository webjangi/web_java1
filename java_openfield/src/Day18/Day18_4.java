package Day18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day18_4 {
	
	
	public static Queue<Subway> ������ = new LinkedList<>();
	public static Queue<Subway> ��꿪 = new LinkedList<>();
	public static Queue<Subway> ���￪ = new LinkedList<>();
	public static Queue<Subway> ���ο� = new LinkedList<>();
	public static ArrayList<Queue<Subway>> ��ö��Ȳ = new ArrayList<>();
	
	//���� �޼ҵ� 
	public static void main(String[] args) {
		
		Queue<Subway> ������ = new LinkedList<>();
		Queue<Subway> ��꿪 = new LinkedList<>();
		Queue<Subway> ���￪ = new LinkedList<>();
		Queue<Subway> ���ο� = new LinkedList<>();
		������.offer(new Subway("A-1"));
		������.offer(new Subway("A-2"));
		������.offer(new Subway("A-3"));
		
	
		 ��ö��Ȳ.add(������);
		 ��ö��Ȳ.add(��꿪);
		 ��ö��Ȳ.add(���￪);
		 ��ö��Ȳ.add(���ο�);
		 
		 Scanner scanner = new Scanner(System.in);
		 while (true) {
			 ��ö����Ȳ();
			 System.out.println("��߽�ȣ : 0.���� 1.��� 2.���� 3.����");
			 int ch = scanner.nextInt();
			 if(ch==0) {��߽�ȣ(ch);}
			 if(ch==1) {��߽�ȣ(ch);}
			 if(ch==2) {��߽�ȣ(ch);}
			 if(ch==3) {��߽�ȣ(ch);}
			 
		}// while		
	}//main ��
	
	// ��ö ��� ��ȣ [�޼ҵ�ȭ : ����ȣ�� ���� ��ö ��� �ڵ� ]
	public static void ��߽�ȣ(int ����ȣ) {
		
		if( ��ö��Ȳ.get(����ȣ).isEmpty()) {
			
			System.out.println("���� ������� ��ö�� �����ϴ� ");
			return;
		}
		
		
	Subway temp = ��ö��Ȳ.get(����ȣ).poll();
	System.out.println("[[��� : " +temp.��ö��ȣ);
	System.out.println("[[�ҿ�ð� : 2�� " );
	
	try {
		Thread.sleep(2000);
	} catch (Exception e) {	
	}
	
	
	��ö��Ȳ.get(����ȣ+1).offer(temp);
		System.out.println("���� : " +temp.��ö��ȣ);
	}

	//��ö ��Ȳ �޼ҵ�
	public static void ��ö����Ȳ() {
		 System.out.println("���� ������ ��ö ȯȲ :" + ��ö��Ȳ.get(0));
		 System.out.println("���� ��꿪 ��ö ȯȲ :" + ��ö��Ȳ.get(1));
		 System.out.println("���� ���￪ ��ö ȯȲ :" + ��ö��Ȳ.get(2));
		 System.out.println("���� ���ο��� ��ö ȯȲ :" + ��ö��Ȳ.get(3));
	}
	
	
	
	
	
}