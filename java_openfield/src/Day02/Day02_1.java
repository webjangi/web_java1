package Day02;

public class Day02_1 {
	
	//진수
	 // 2진수[컴퓨터] 0, 1
	 // 10진수[사람] : 0 ~ 9
	 // 8진수 : 0 ~ 7
	 // 16진수 : 0 ~9 a a b c d e f 
	
	//용량
	  // 1bit  : 0 혹은 1 
	
	
	public static void main(String[] args) {
		
		//변수 : 데이터 저장하는 상자
		 //사람 : 1. 상자크기, 2. 상자이름 3. 상자에 들어가는 값
		 // 컴퓨터 :  [메모리 = 저장장치(자원)]
		   // 1. 메모리 주소 [변수 식별] = 16진수
		   // 2. 메모리 크기 [ 바이트단위]
		   // 3. 메모리 데이터  
		
		// 자료형 : 메모리의 크기를 미리 정해진 형태
		 //왜  : 메모리 효율적으로 사용하자. 
		int 변수1 = 10;
		 // 2. 자료형
		  // 1. boolean : 1bit [true , false]
		boolean 논리변수 = true;
		System.out.println("논리변수 값은 : " + 논리변수);
		  // 2. char : 2byte [ 0 ~ 65,000정도]
		char 문자변수 = 'a';
		System.out.println("문자변수 값은 : " + 문자변수);
		char 문자변수2 = 97;
		System.out.println("문자변수2 값은 : " + 문자변수2);
		char 문자변수3 = 98;
		System.out.println("문자변수 3값은:" + 문자변수3);
		// 3. byte : 1byte [+- 120정도]
		byte 바이트변수1 = 100;
		System.out.println("바이트변수 :" + 바이트변수1);
		byte 바이트변수2 = 'd';
	    System.out.println( "바이트변수 2값은" + 바이트변수2);
	    short 숏변수 = 100;
	    System.out.println("숏변수 값은 :" +숏변수);
	    short 숏변수2 = 'a';
	    System.out.println("숏변수2 값은 :" +숏변수2);
	    // 4. 자바의 기본단위 : 정수의 기본타입
	    int 인트변수 = 100;
	    System.out.println("인트변수 값은 :" +인트변수);
	    int 인트변수2 = 'a';
	    System.out.println("인트변수2 값은 :" +인트변수2);
	    //int 인트변수3 = 100000000000; //100억
	    System.out.println("java 정수타입 기본단위 :" +(10));
	    
	    char [] 문자열1 = new char[3];
	     문자열1[0] = '안';
	     문자열1[1] = '녕';
	     
	     String 문자열2 = "안녕하";
	    
	}
	 
	

}

