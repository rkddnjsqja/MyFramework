package com.myframework.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.board.model.domain.Board2;
import com.myframework.board.model.repository.Board2DAO;
import com.myframework.controller.Controller;

public class DetailController implements Controller{
	Board2DAO board2DAO = new Board2DAO();
	
	public void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int board2_id=Integer.parseInt(request.getParameter("board2_id"));
		Board2 board2=board2DAO.select(board2_id);
		request.setAttribute("board2", board2);
	}

	public String getResultKey() {
		return "/view/board/detail";
	}

	public boolean isForward() {
		return true;
	}

}
