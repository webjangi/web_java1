package Day07;

import java.util.Random;
import java.util.Scanner;

public class Day07_2 {

	public static void main(String[] args) {
		
		//0.����
		Scanner scanner = new Scanner(System.in);
		Random random = new Random(); //����[����] ���� ��ü
		//1. �迭����
		int[] ��ȣ = new int[6];
		int[] ��÷��ȣ = new int[6];
	
		
		//2. �Է¹ޱ�
		for(int i=0; i<6; i++){
			System.out.println("1~45 �� �Է� : "); int ���� = scanner.nextInt();
			// 1. 1~45 �������� üũ
			if(����<=0 || ����>45) {
				System.out.println("[[���]] : 1~45���̿��� �Է� [[�ٽ� �Է�]]");
				i--;//�������� �Է¾ƴϱ� ������ i�� ����
			}else {	
			// 2. �̹� �迭�� �����ϴ� ��ũ
				boolean �ߺ�üũ = true;
				for(int temp : ��ȣ) {
					//for (�ӽú��� : �迭 ) => �迭�� ��� ��Ҹ� �ϳ��� ���� ����
					if(temp==����) {
						System.out.println("[[���]]�̹� ������ ��ȣ �Դϴ�.[�ٽ��Է�]");
						i--;
						�ߺ�üũ = false;
						break;
					}
				}
			    if(�ߺ�üũ)��ȣ[i] = ����; 
			
			}						
		}// for end
		//2-1 �Է�rkqt Ȯ��
		System.out.print("\n �����Ͻ� ��ȣ�� :");
		for (int temp:��ȣ) {
			System.out.print(temp+" ");
		}//for end
		
		
		//3. ��÷��ȣ ����
		for(int i =0; i<6; i++) {
			//1. ���� ����
			int ��÷ = random.nextInt(45)+1; //0~44 +1 ==> 1~45				   
			//2. �ߺ� ����
			boolean �ߺ�üũ = true;
			for(int temp: ��÷��ȣ) {
				if(temp == ��÷) {
					i--; 
					�ߺ�üũ = false;
					break;
				}
				
			}//for end
			if(�ߺ�üũ) ��÷��ȣ[i] = ��÷;
		}
		
		//3-1 ������ Ȯ��
		System.out.print("\n ��÷��� ��ȣ��:");
		for(int temp : ��÷��ȣ) {
			System.out.print(temp+" ");
		}
					
		//4. ��÷��� [�� �迭�� ��]
		int ��÷���� =0;
		for (int temp: ��ȣ) {
			
			for(int temp2:��÷��ȣ) {
				if(temp == temp2) ��÷����++;
			}			
		}
		System.out.println("\n ��÷���� :" +��÷����);
		
		
		
		
		
	}
	
	
}