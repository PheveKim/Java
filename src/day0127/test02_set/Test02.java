package day0127.test02_set;

import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		
		Person p1 = new Person("양명균", "880126");
		Person p2 = new Person("양명균", "880126");
		
		set.add(p1);
		set.add(p2);
		
		// HashSet 은 hashCode, equals 두개가 같아야 같은걸로 봄.
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));
		System.out.println(set);
	}
	
	
}
