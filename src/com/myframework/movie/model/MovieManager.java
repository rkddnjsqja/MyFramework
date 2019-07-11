package com.myframework.movie.model;

//jsp안에 들어있었던 영화 파단 로직을, 다른 플랫폼에서도 
//재사용할 수 있도록 공통로직으로 분리시키자!!재사용성을 위해
public class MovieManager {
	
	public String getAdvice(String movie) {
		String msg=null;//영화에대한 판단
		if(movie.equals("앤드게임")){
			msg="SF영화 사상 최고 기록 경신";
		}else if(movie.equals("스파이더맨 파프롬 홈")){
			msg="7월 개봉 기대작";
		}else if(movie.equals("맨인블랙3")){
			msg="흥행 실패";
		}
		return msg;
	}
}
