package Day05;

import java.util.Scanner;

public class Day05_2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("������ :"); int �� = scanner.nextInt();
		for(int i =1; i<=��; i++) {
			System.out.print("*");			
		}
System.out.println("\n----------------------------------");				
 System.out.println("������ 5������ �ٹٲ� :"); int ��2 = scanner.nextInt();
		for(int i =1; i<=��2; i++) {			
			System.out.print("*");
			//5������ �ٹٲ�ó��[5���]			
			if(i%5 == 0) {System.out.println();}
			
		}
	
System.out.println("\n----------------------------------");
      
       System.out.println("�Է¹��� �� ��ŭ ��� :"); int ��3 = scanner.nextInt();       
       for(int i= 0; i<=��3; i++) {
    	   
    	   for(int s=1; s<=i; s++) {System.out.print("*");}    	   
    	   
    	 System.out.println("");
       }
	
	
System.out.println("\n----------------------------------");		
        System.out.println("�Է¹��� �� ��ŭ ��� :"); int ��4 = scanner.nextInt();
          for(int i = 1; i<=��4; i++) {
        	
        	for(int s = 1; s<=��4-i+1; s++) {System.out.print("*");}
       	 
        	System.out.println("");
        }


System.out.println("\n----------------------------------");     
System.out.println("��5 ���� :"); int ��5 = scanner.nextInt();       
for(int i = 1; i<=��5; i++) {
	//����
	for(int b = 1; b<=��5-i; b++) {System.out.print(" ");}
	//��
	for(int s = 1; s<=i; s++) {System.out.print("*");}	 
	System.out.println("");
}
  
System.out.println("\n----------------------------------");     
System.out.println("��6 ���� :"); int ��6 = scanner.nextInt();       
for(int i = 1; i<=��6; i++) {
	//����
	for(int b = 1; b<=i; b++) {System.out.print(" ");}
	//��
	for(int s = 1; s<=��6-i+1; s++) {System.out.print("*");}	 
	System.out.println("");
}


System.out.println("��7 ���� :"); int ��7 = scanner.nextInt();       
for(int i = 1; i<=��6; i++) {
	//����
	for(int b = 1; b<=i; b++) {System.out.print(" ");}
	//��
	for(int s = 1; s<=i*2-1; s++) {System.out.print("*");}	 
	System.out.println("");
}


        
        
	}

}