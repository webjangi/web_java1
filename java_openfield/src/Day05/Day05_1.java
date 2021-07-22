package Day05;

public class Day05_1 {

	
	//반복문 
	 // for, while, do~while
	  // 1.for: 어디서부터 어디까지 반복실행 
	  // for (
	
	public static void main(String[] args) {
		
		for( int i =0 ; i<10; i++) {
			System.out.print(i);
		    //i = 0일때 조건:T 반복실행 0	
		}
	
		//예2) 1~50까지 출력
	System.out.println("\n----------------------------------");	
		for(int 변수 = 1 ; 변수<=50; 변수 ++) {	System.out.print(변수);}
	System.out.println("\n----------------------------------");
		//예2) 1~50까지 3씩 증가 출력
		for(int i = 1; i<=50; i+=3) { System.out.println(i+"");}
	System.out.println("\n----------------------------------");	
		int 누적합계 = 0;
		for(int i = 1; i<=50; i++) { 누적합계 += i;}
		System.out.println("1~50까지 누적합계:" + 누적합계);
	
	System.out.println("\n----------------------------------");	
	    
	     int 누적합계2 = 0;
	     for(int i = 0; i<=50; i+=7) { 누적합계2 += i;}
	     System.out.println("1~50까지 7배수들의 누적합계 :" + 누적합계2);
	     
	     int 누적합계3 = 0;
		 for (int i= 1; i<=50; i++) {if (i%7==0) 누적합계3 +=i;} 
		 System.out.println("1~50까지 7배수들의 누적합계 : " + 누적합계3);
		 
		 for(int 곱=1; 곱<=9; 곱++) {			 
			 System.out.println("2 x "+곱+" = " + (2*곱));			 
		 }
	System.out.println("\n----------------------------------");	 
		 for(int 곱=1; 곱<=9; 곱++) {
			  
			 System.out.println("3 x "+곱+" = " + (3*곱));			 
		 }
		 
	System.out.println("\n----------------------------------");			
	     for (int 단=2; 단<=15; 단++) {   	
	    	System.out.println("--"+단+" 단 결과--");
	     for (int 곱=1; 곱<=9; 곱++) {
	    	 System.out.println(단+ " X "+곱+" ="+(단*곱) );
	    	 
	     }
	    	 
	
	
	   	 }
	
	
	
	
	
	
		 
	}
	
}
