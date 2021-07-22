package Day05;

import java.util.Scanner;

public class Day05_2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("별개수 :"); int 별 = scanner.nextInt();
		for(int i =1; i<=별; i++) {
			System.out.print("*");			
		}
System.out.println("\n----------------------------------");				
 System.out.println("별개수 5개마다 줄바꿈 :"); int 별2 = scanner.nextInt();
		for(int i =1; i<=별2; i++) {			
			System.out.print("*");
			//5개마다 줄바꿈처리[5배수]			
			if(i%5 == 0) {System.out.println();}
			
		}
	
System.out.println("\n----------------------------------");
      
       System.out.println("입력받은 별 만큼 출력 :"); int 줄3 = scanner.nextInt();       
       for(int i= 0; i<=줄3; i++) {
    	   
    	   for(int s=1; s<=i; s++) {System.out.print("*");}    	   
    	   
    	 System.out.println("");
       }
	
	
System.out.println("\n----------------------------------");		
        System.out.println("입력받은 별 만큼 출력 :"); int 줄4 = scanner.nextInt();
          for(int i = 1; i<=줄4; i++) {
        	
        	for(int s = 1; s<=줄4-i+1; s++) {System.out.print("*");}
       	 
        	System.out.println("");
        }


System.out.println("\n----------------------------------");     
System.out.println("줄5 개수 :"); int 줄5 = scanner.nextInt();       
for(int i = 1; i<=줄5; i++) {
	//공백
	for(int b = 1; b<=줄5-i; b++) {System.out.print(" ");}
	//별
	for(int s = 1; s<=i; s++) {System.out.print("*");}	 
	System.out.println("");
}
  
System.out.println("\n----------------------------------");     
System.out.println("줄6 개수 :"); int 줄6 = scanner.nextInt();       
for(int i = 1; i<=줄6; i++) {
	//공백
	for(int b = 1; b<=i; b++) {System.out.print(" ");}
	//별
	for(int s = 1; s<=줄6-i+1; s++) {System.out.print("*");}	 
	System.out.println("");
}


System.out.println("줄7 개수 :"); int 줄7 = scanner.nextInt();       
for(int i = 1; i<=줄6; i++) {
	//공백
	for(int b = 1; b<=i; b++) {System.out.print(" ");}
	//별
	for(int s = 1; s<=i*2-1; s++) {System.out.print("*");}	 
	System.out.println("");
}


        
        
	}

}
