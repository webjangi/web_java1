package Day18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18_3 {
	
	public static void main(String[] args) {
		
		
		//스택 : 입출구 동일 [LIFO] : 나중에 들어온 메모리 먼저나감
			// 자동저장 시스템.
			// 예) 동전상자, CTRL+Z []
				// push, pop
		
		
		//큐 : 입출구 양방향 [FIFO ] : 먼저 들어온 메모리 먼저출력 
			// 예) 줄세우기, 
				//offer, poll 
	
		Stack<동전> 동전상자 = new Stack<>();
		동전상자.push(new 동전(100));
		동전상자.push(new 동전(500));
		동전상자.push(new 동전(10));
		
		//출력		
		System.out.println("동전상자 : " + 동전상자);
		System.out.println("동전 개수 : " + 동전상자.size());
		
		for(동전 temp : 동전상자) {
			System.out.println(temp);
		}
		
		동전상자.pop(); // 삭제
		System.out.println("동전 하나 빼기  :" + 동전상자);
		
		//동전 모두 빼기 
	while (!동전상자.isEmpty()) {
		//메모리가 비어 있으면 / !않으면
		System.out.println(동전상자.pop());
		
	}
	
	// 큐 
		// 인터페이스 : 혼자서 메모리 할당 x 
	
	Queue<동전> 동전상자2 = new LinkedList<>();
	동전상자2.offer(new 동전(100));
	동전상자2.offer(new 동전(500));
	동전상자2.offer(new 동전(10));
	
	System.out.println("동전상자 : " + 동전상자2);
	System.out.println("삭제");
	동전상자2.poll(); // 메모리 삭제  [먼저들어온 100원이 삭제]
	System.out.println("동전상자 : " + 동전상자2);
	
	}	

}
