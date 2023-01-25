package com.ssafy.ws.step2;

public class MovieTest {
	public static void main(String[] args) {
		
		MovieManager mm = new MovieManager();
		Movie m1 = new Movie(1, "아바타2", "제임스카메론", "SF", 200);
		Movie m2 = new Movie(2, "아바타1", "제임스카메론", "SF", 180);
		Movie m3 = new Movie(3, "반지의제왕", "피터잭슨", "판타지", 180);
		SeriesMovie m4 = new SeriesMovie(4, "해리포터", "크리스콜롬버스", "판타지", 130, 1, "마법사의돌");
		SeriesMovie m5 = new SeriesMovie();
		
		mm.add(m1);
		mm.add(m2);
		mm.add(m3);
		mm.add(m4);
		mm.add(m5);
		
		Movie[] mm_array = mm.getList();
		for(int i=0; i<mm.getList().length; i++) {
			System.out.println(mm_array[i].toString());
		}
		Movie m6 = mm.searchByTitle("아바타");
		System.out.println(m6.toString());
		System.out.println(mm.getRunningTimeAvg());
		
		Movie[] series_movies = mm.getSeriesMovies();
		for(int i=0; i<series_movies.length; i++) {
			System.out.println(series_movies[i].toString());
		}
		Movie [] normal_movies = mm.getMovies();
		for(int i=0; i<normal_movies.length; i++) {
			System.out.println(normal_movies[i].toString());
		}
	}
}
