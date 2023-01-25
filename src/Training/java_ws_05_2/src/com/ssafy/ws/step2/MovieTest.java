package com.ssafy.ws.step2;
import java.util.*;

import org.omg.CORBA.PUBLIC_MEMBER;
public class MovieTest {

	public static void main(String[] args) {

		// 이렇겐 안됨. MovieManager mm = new MovieManager();
		MovieManager mm = MovieManager.getInstance();
		Movie m1 = new Movie(0, "기생충", "봉준호", "스릴러", 131);
		Movie m2 = new Movie(0, "아바타 물의길", "제임스 카메론", "SF", 200);
		Movie m4 = new Movie();
		
		mm.add(m1);
		mm.add(m2);
		mm.add(m4);
		for(Movie m : mm.getList()) {
			System.out.println(m.toString());
		}
		
		// 이렇게 MM 을 해도 mm 과 공유하는 이유는
		// 싱글턴이기 때문에 주솟값이 같기 때문.
		MovieManager MM = MovieManager.getInstance();
		System.out.println(MM.getList().length);
		Movie m3 = MM.searchByTitle("아바타 물의길");
		System.out.println(m3.toString());
		System.out.println(m4.toString());
		
	}
}
