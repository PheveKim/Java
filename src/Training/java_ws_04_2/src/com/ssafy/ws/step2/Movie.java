package com.ssafy.ws.step2;

public class Movie {
	// 멤버변수
	int id;
	String title;
	String director;
	String genre;
	int runningTime;
	
	// 마우스 우클릭 -> source -> generate constructor
	// 기본 생성자
	public Movie() {
		// super(); // 조상 클래스(부모 클래스)의 생성자 호출
		// 모든 클래스의 조상클래스: Object
	}

	public Movie(int id, String title, String director, String genre, int runningTime) {
		// super(); // 생략해도 됨. 생략해도 있음. default
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
	
	public void info() {
		System.out.println("title: "+title+", genre:"+genre+", runningTime: "+runningTime);
	}
	// 마우스 우클릭 -> source -> generate toString()

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", director=" + director + ", genre=" + genre + ", runningTime="
				+ runningTime + "]";
	}
	
	
	
	
}
