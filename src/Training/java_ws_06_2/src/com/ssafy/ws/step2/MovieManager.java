package com.ssafy.ws.step2;

import java.util.Arrays;

/**
 * 영화리스트를 배열로 관리하는 클래스
 * @author 
 *
 */
public class MovieManager {
	
	private static final int MAX_SIZE = 100; // 배열의 최대 크기
	private Movie[] movieList = new Movie[MAX_SIZE];
	private int size = 0; // 현재 등록된 영화 수
	
	public void add(Movie movie) {
		
		if(size < MAX_SIZE) {
			movieList[size] = movie;
			size++;
		}
		else {
			System.out.println("더 이상 영화를 저장할 수 없습니다.");
		}
		
	}
	
	// 일반 영화, 시리즈 영화 상관없이
	public Movie[] getList() {
		return Arrays.copyOfRange(movieList, 0, size);
	}
	
	// 일반 영화만
	public Movie[] getMovies() {
		
		// 1. movieList 배열에서 일반 영화의 개수를 센다.
		int count = 0;
		for(int i=0; i<size; i++) {
			// 일반 영화라면?
			if(!(movieList[i] instanceof SeriesMovie)) {
				count++;
			}
		}
		// 2. 그 개수만큼 Movie 배열을 만든다.
		Movie[] result = new Movie[count];
		
		// 3. Movie 배열에 일반 영화만 채워넣는다.
		int idx = 0;
		for(int i=0; i<size; i++) {
			if(!(movieList[i] instanceof SeriesMovie)) {
				result[idx] = movieList[i];
				idx++;
			}
		}
		
		// 4. Movie 배열을 반환한다.
		return result;
	}
	
	// 시리즈 영화만
	public Movie[] getSeriesMovies() {
		
		int count = 0;
		for(int i=0; i<size; i++) {
			if(movieList[i] instanceof SeriesMovie) {
				count++;
			}
		}
		
		Movie[] result = new Movie[count];
		int idx = 0;
		for(int i=0; i<size; i++) {
			if(movieList[i] instanceof SeriesMovie) {
				result[idx] = movieList[i];
				idx++;
			}
		}
		
		return result;
	}
	
	
	// 제목이 일치하는 것 .equals()
	// 검색어를 포함하는 것 .contains()
	public Movie searchByTitle(String title) {
		
		for(int i=0; i<size; i++) {
			if(movieList[i].getTitle().contains(title)) {
				return movieList[i];
			}
		}
		return null;
	}
	
	double sum = 0;
	public double getRunningTimeAvg() {
		for(int i=0; i<size; i++) {
			sum += movieList[i].getRunningTime();
		}
		return sum / size;
	}
	
	
}
