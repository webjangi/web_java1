package Day05;

public class Day05_1 {

	
	//�ݺ��� 
	 // for, while, do~while
	  // 1.for: ��𼭺��� ������ �ݺ����� 
	  // for (
	
	public static void main(String[] args) {
		
		for( int i =0 ; i<10; i++) {
			System.out.print(i);
		    //i = 0�϶� ����:T �ݺ����� 0	
		}
	
		//��2) 1~50���� ���
	System.out.println("\n----------------------------------");	
		for(int ���� = 1 ; ����<=50; ���� ++) {	System.out.print(����);}
	System.out.println("\n----------------------------------");
		//��2) 1~50���� 3�� ���� ���
		for(int i = 1; i<=50; i+=3) { System.out.println(i+"");}
	System.out.println("\n----------------------------------");	
		int �����հ� = 0;
		for(int i = 1; i<=50; i++) { �����հ� += i;}
		System.out.println("1~50���� �����հ�:" + �����հ�);
	
	System.out.println("\n----------------------------------");	
	    
	     int �����հ�2 = 0;
	     for(int i = 0; i<=50; i+=7) { �����հ�2 += i;}
	     System.out.println("1~50���� 7������� �����հ� :" + �����հ�2);
	     
	     int �����հ�3 = 0;
		 for (int i= 1; i<=50; i++) {if (i%7==0) �����հ�3 +=i;} 
		 System.out.println("1~50���� 7������� �����հ� : " + �����հ�3);
		 
		 for(int ��=1; ��<=9; ��++) {			 
			 System.out.println("2 x "+��+" = " + (2*��));			 
		 }
	System.out.println("\n----------------------------------");	 
		 for(int ��=1; ��<=9; ��++) {
			  
			 System.out.println("3 x "+��+" = " + (3*��));			 
		 }
		 
	System.out.println("\n----------------------------------");			
	     for (int ��=2; ��<=15; ��++) {   	
	    	System.out.println("--"+��+" �� ���--");
	     for (int ��=1; ��<=9; ��++) {
	    	 System.out.println(��+ " X "+��+" ="+(��*��) );
	    	 
	     }
	    	 
	
	
	   	 }
	
	
	
	
	
	
		 
	}
	
}