package Day18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18_3 {
	
	public static void main(String[] args) {
		
		
		//���� : ���ⱸ ���� [LIFO] : ���߿� ���� �޸� ��������
			// �ڵ����� �ý���.
			// ��) ��������, CTRL+Z []
				// push, pop
		
		
		//ť : ���ⱸ ����� [FIFO ] : ���� ���� �޸� ������� 
			// ��) �ټ����, 
				//offer, poll 
	
		Stack<����> �������� = new Stack<>();
		��������.push(new ����(100));
		��������.push(new ����(500));
		��������.push(new ����(10));
		
		//���		
		System.out.println("�������� : " + ��������);
		System.out.println("���� ���� : " + ��������.size());
		
		for(���� temp : ��������) {
			System.out.println(temp);
		}
		
		��������.pop(); // ����
		System.out.println("���� �ϳ� ����  :" + ��������);
		
		//���� ��� ���� 
	while (!��������.isEmpty()) {
		//�޸𸮰� ��� ������ / !������
		System.out.println(��������.pop());
		
	}
	
	// ť 
		// �������̽� : ȥ�ڼ� �޸� �Ҵ� x 
	
	Queue<����> ��������2 = new LinkedList<>();
	��������2.offer(new ����(100));
	��������2.offer(new ����(500));
	��������2.offer(new ����(10));
	
	System.out.println("�������� : " + ��������2);
	System.out.println("����");
	��������2.poll(); // �޸� ����  [�������� 100���� ����]
	System.out.println("�������� : " + ��������2);
	
	}	

}