package com.myframework.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.board.model.repository.Board2DAO;
import com.myframework.controller.Controller;

//3:모델에게 일시킨다
//4:뷰페이지로 가져갈것이 있다면 저장(request)
public class ListController implements Controller{
	Board2DAO board2DAO = new Board2DAO();
	
	public void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List boardList=board2DAO.selectAll();
		request.setAttribute("boardList", boardList);
		
	}

	
	public String getResultKey() {
		
		return "/view/board/list";
	}
	
	public boolean isForward() {
	
		return true;//포워딩하겠다
	}

}
