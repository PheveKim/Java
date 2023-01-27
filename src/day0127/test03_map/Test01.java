package day0127.test03_map;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		
		// Map
		// - 사전과 같은 자료구조
		// - 키 & 값의 쌍으로 저장
		// - 키로 구별
		// - 키는 중복되면 안되고, 값은 중복 될 수 있음.
		HashMap<String, String> map = new HashMap<>();
		//Map<String, String> map = new TreeMap<>();
		
		
		// 맵에 값 저장
		map.put("Hong", "010-2222-2222");
		map.put("Yang", "010-3333-3333");
		map.put("Lee", "010-9999-9999");
		
		// 중복된 키로 값을 넣을 경우 새로운 값으로 대체.
		map.put("Lee", "010-8888-8888");
		System.out.println(map);
		
		// 값을 가져오려면?
		System.out.println(map.get("Yang"));
		
		// 없는 키로 값을 가져온다면? => null
		System.out.println(map.get("Kim"));
		
		// 키가 있는지 미리 확인!
		System.out.println(map.containsKey("Kim"));
		
		// 값이 있는 지 확인.
		System.out.println(map.containsValue("010-3333-3333"));
		
//		// 반복문 돌리기
//		for(int i=0; i<map.size(); i++) {
//			System.out.println(map.entrySet()..getKey() + " " + map.values());
//		}
		
		map.forEach((key,value) -> {
			System.out.println(key + ":" + value);
		});
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("ddd"+entry.getKey()+" : "+entry.getValue());
		}
		
		Iterator<String> e = map.keySet().iterator();
		while(e.hasNext()) {
			String key = e.next();
			System.out.printf("키: %s, 값: %s \n", key, map.get(key));
		}
		
		for(String key : map.keySet()) {
			System.out.printf("키: %s, 값: %s \n", key, map.get(key));
		}
		
		System.out.println(map.size());
		
		for(int i=0; i<map.size(); i++) {
			System.out.println(map.get("Hong"));
		}
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			
			
			
		}
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		
		
		
	}
	
	
}
