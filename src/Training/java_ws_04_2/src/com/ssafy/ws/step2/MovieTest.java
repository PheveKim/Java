package com.ssafy.ws.step2;

public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		Movie m2 = new Movie(0, "기생충", "봉준호", "스릴러", 131);
		m1.info();
		m2.info();
		System.out.println(m1.toString());
		System.out.println(m2.toString());
	}
}
