package com.ssafy.ws.step2;

public class SeriesMovie extends Movie {
	
	
	private int seriesNum; // 시리즈 중에서 몇번째인지
	private String episode; // 해당 시리즈의 에피소드
	
	// 기본 생성자
	public SeriesMovie() {
		super();
	}
	
	
	public SeriesMovie(int id, String title, String director, String genre, int runningTime, int seriesNum, String episode) {
		super(id, title, director, genre, runningTime);
		this.seriesNum = seriesNum;
		this.episode = episode;	
	}

	public int getSeriesNum() {
		return seriesNum;
	}

	public void setSeriesNum(int seriesNum) {
		this.seriesNum = seriesNum;
	}

	public String getEpisode() {
		return episode;
	}

	public void setEpisode(String episode) {
		this.episode = episode;
	}


	
	
	// toString
	// Object <- Movie <- SeriesMovie
	@Override
	public String toString() {
		// StringBuilder -> 문자열을 이어붙여서 문자열을 만들 때
		// StringBuilder 객체에 문자열을 이어붙일 때는 .append() 메서드 사용
		// StringBuilder 객체를 생성할 때 초기 문자열을 넣을 수 있음.
		// .append() 안에는 문자열 뿐만 아니라, 숫자도 들어갈 수 있음. -> 자동으로 문자열로 변환해서 
		// 이어 붙여줌. + 연산이랑 같은 효과.
		// .append() 뒤에 바로 이어서 .append() 또 붙일 수 있음.
		// .append() 를 이용하는 것이 효율적
		
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", 시리즈 번호 = ").append(this.seriesNum);
		sb.append(", 시리즈 부제목 = " +this.episode);
		
		return sb.toString();
	}
	
	
	
}
