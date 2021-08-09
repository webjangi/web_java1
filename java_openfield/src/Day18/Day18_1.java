package Day18;

import java.util.HashMap;
import java.util.Iterator;

public class Day18_1 {
	
	public static void main(String[] args) {
		
		//Map : 
			// 1.HashMap : 동기회 X  [ 단일 스레드 사용시 ]
			// 2. HashTable : 동기화 O [ 멀티스레드 사용시 ]
				//메소드
					
		
		HashMap<String, Integer> hashMap = new HashMap<>();
			// 멀티제네릭 [k : 키 / v : 값 ] : 객체내 매개타입[자료형] 주기
			
		hashMap.put("유재석", 80);
		hashMap.put("강호동", 70);
		hashMap.put("신동엽", 60);
		hashMap.put("유재석", 80); // key => 해시 [데이터 => 주소값]
		hashMap.put("서장훈", 80); // value => 중복값 허용 
		
			//출력
			System.out.println("hashmap : " + hashMap);
			//호출
			System.out.println("hashmap 두번째 :" + hashMap.get("유재석"));
			//키호출
			System.out.println("hashmap total key:" +hashMap.keySet());
			//값 호출
			System.out.println("hashmap total value:" +hashMap.values());
			//엔트리 (키, 값)
			System.out.println("hashmap size :" + hashMap.size());
			
			System.out.println("hashmap remove" + hashMap.remove("유재석"));
			
			//전체 출력
			for(String key : hashMap.keySet()) {
				System.out.println( hashMap.get(key));
			}
			
			//전체 출력 [ ]
			Iterator<String> iterator = hashMap.keySet().iterator();
			while (iterator.hasNext()) {
				String key = (String) iterator.next();
				System.out.println(key+ "/"+ hashMap.get(key));
				
			}
			
			hashMap.clear();
			System.out.println("hashmap:" + hashMap);
			
			
		
	}
	

}
