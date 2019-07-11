package com.myframework.movie.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.controller.Controller;
import com.myframework.movie.model.MovieManager;

//기존 jsp,모델1방식은 훌륭한 방식이기는 하지만,
//아직 완전히 jsp에서 컨트롤러 코드가 분리 되지는 않았기 때문에
//만일 jsp의 디자인이 다른 파일로 변경되었을때, 컨트롤러코드가 영향을
//받음..(즉 완전한 분리가 되지 않았음)
public class MovieController implements Controller{
	MovieManager manager=new MovieManager();
	/*
	 * 3단계:알맞는 로직 객체에 일 시킨다!!
	 * 4단계: 뷰까지 가져갈 결과가 있다면, 그 결과를 저장한다(request)
	 */
	public void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3단계:일시킨다!!
		String movie=request.getParameter("movie");
		String msg=manager.getAdvice(movie);		
		//4단계:결과를 저장한다!!
		request.setAttribute("result", msg);
	}
	@Override
	public String getResultKey() {
		return "/view/movie";
	}
	@Override
	public boolean isForward() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
