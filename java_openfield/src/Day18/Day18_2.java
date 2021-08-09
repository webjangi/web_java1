package Day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Day18_2 {
	
	
	public static void main(String[] args) {
		
		//컬렉션 중첩
		// 예1)List 컬렉션 => mpa
		ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
			// 제네릭은 컬렉션 가능
			HashMap<String, Integer> map = new HashMap<>();
			HashMap<String, Integer> map2 = new HashMap<>();
			
			arrayList.add(map); map.put("유재석", 90);
			arrayList.add(map2);  map2.put("유재석", 100);
			System.out.println("arraylist 2개의 map : " + arrayList);
			
			
			
			HashMap<String, ArrayList<String>> map3 = new HashMap<>();
			
			ArrayList<String> list = new ArrayList<>();
			map3.put("1", list);
			System.out.println(map3);
			
			//
			HashSet<HashMap<String, Integer>> set = new HashSet<>();
				HashMap<String, Integer> map4 = new HashMap<>();
				set.add(map4);
				System.out.println(set);
		
				
			
			HashMap<String, Integer> clothingmap = new HashMap<>();
			clothingmap.put("나이키상의", 20);
			clothingmap.put("나이키하의", 10);
			HashMap<String, Integer> bagmap = new HashMap<>();
			bagmap.put("나이키가방", 5);
			bagmap.put("아디다스가방", 10);
			
			ArrayList<HashMap<String, Integer>> productlist = new ArrayList<>();
			productlist.add(clothingmap);
			productlist.add(bagmap);
			
			Scanner scanner = new Scanner(System.in);
			while (true) {
				
				System.out.println("리스트목록 : 1.의류 2.가방");
				
				int ch =  scanner.nextInt();
				if(ch==1) {
					System.out.println("전체목록:" + productlist.get(ch));
					System.out.println("전체제품명 : " + productlist.get(ch).keySet());
					System.out.println("나이키상의 재고 :" + productlist.get(ch));
				}
				if(ch==2) {
					System.out.println(productlist.get(2));
				}
				
			}//while
		
				
				
				
		
	}
	

}
