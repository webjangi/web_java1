package Day06;

import java.util.Scanner;

public class Day06_1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ��� : ");int ���� = scanner.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");int ���� = scanner.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");int ���� = scanner.nextInt();
     
		switch(����) {
		case 90 : System.out.println("90�� �Դϴ� "); break;
		case 80 : System.out.println("80�� �Դϴ� "); break;
		case 70 : System.out.println("70�� �Դϴ� "); break;
		default : System.out.println("Ż�� �Դϴ� "); break;
	}
		
		
		int ��� = (����+����+����/3);
		
		switch(���/10) {
		case 9: System.out.println("A����Դϴ�. ");break;
		case 8: System.out.println("B����Դϴ�. "); break;
		case 7: System.out.println("C����Դϴ�.  ");break;
		default:System.out.println("Ż���Դϴ�. ");
		}
		
	}

	
	
}