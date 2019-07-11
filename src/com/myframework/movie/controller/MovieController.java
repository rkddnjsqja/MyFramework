package com.myframework.movie.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.controller.Controller;
import com.myframework.movie.model.MovieManager;

//���� jsp,��1����� �Ǹ��� ����̱�� ������,
//���� ������ jsp���� ��Ʈ�ѷ� �ڵ尡 �и� ������ �ʾұ� ������
//���� jsp�� �������� �ٸ� ���Ϸ� ����Ǿ�����, ��Ʈ�ѷ��ڵ尡 ������
//����..(�� ������ �и��� ���� �ʾ���)
public class MovieController implements Controller{
	MovieManager manager=new MovieManager();
	/*
	 * 3�ܰ�:�˸´� ���� ��ü�� �� ��Ų��!!
	 * 4�ܰ�: ����� ������ ����� �ִٸ�, �� ����� �����Ѵ�(request)
	 */
	public void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3�ܰ�:�Ͻ�Ų��!!
		String movie=request.getParameter("movie");
		String msg=manager.getAdvice(movie);		
		//4�ܰ�:����� �����Ѵ�!!
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
