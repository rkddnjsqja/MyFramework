package com.myframework.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.board.model.domain.Board2;
import com.myframework.board.model.repository.Board2DAO;
import com.myframework.controller.Controller;

//클라이언트의 "글등록" 요청을 처리하는 서브 컨트롤러!!
//3단계:알맞는 로직 객체에게 일시킨다!! 우리의 경우 DAO
//4단계:jsp로 가져갈 것이 있을 경우엔, 결과를 저장한다(insert 저장할것 없음)
public class WriteController implements Controller{
	Board2DAO board2DAO;
	
	public WriteController() {
		board2DAO = new Board2DAO();
	}
	public void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Board2 board2 = new Board2();
		board2.setTitle(request.getParameter("title"));
		board2.setWriter(request.getParameter("writer"));
		board2.setContent(request.getParameter("content"));
		int result = board2DAO.insert(board2);
		System.out.println("등록결과는"+result);
		
	}

	@Override
	public String getResultKey() {
		
		return "/view/board/write";
	}

	@Override
	public boolean isForward() {
		return false;
	}
}
