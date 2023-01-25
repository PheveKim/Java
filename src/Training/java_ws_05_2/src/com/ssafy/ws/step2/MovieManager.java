package com.ssafy.ws.step2;
import java.util.*;
/**
 * 영화리스트를 배열로 관리하는 클래스
 * 
 * @author
 *
 */
public class MovieManager {
	
	private final int MAX_SIZE = 100; //final : 더이상 고칠 수 없는 상수.
	private Movie[] movieList = new Movie[MAX_SIZE];
	private static MovieManager instance = new MovieManager();
	private int size = 0;
	// 싱글턴
	// 1. private 으로 자기자신의 인스턴스를 만들기
	// 2. 생성자를 private 으로 막기
	// 3. 유일한 인스턴스에 접근 가능한 getter 만들기
	
	
	private MovieManager() {
	}
	
	
	public static MovieManager getInstance() {
		return instance;
	}
	
	public void add(Movie movie) {
		if(size < MAX_SIZE) { // 현재 개수가 100개 미만이라면, 
			movieList[size] = movie;
			size++;
			
		}
		else {
			System.out.println("더 이상 저장할 수 없어요.");
		}
	}
	
	public Movie[] getList() {
		// 길이가 100인 배열을 반환하는 것이 아니라, 현재 영화 개수 만큼만 반환.
		return Arrays.copyOfRange(this.movieList, 0, this.size);
	}
	public Movie searchByTitle(String title) {
		for(int i=0; i<size; i++) {
			if(movieList[i].getTitle().equals(title)) { // string은 == 안쓰고 equals로 비교해야함.
				return movieList[i];
			}
		}
		return null;
	}
	
}
