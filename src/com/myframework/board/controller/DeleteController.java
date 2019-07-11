package com.myframework.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.board.model.domain.Board2;
import com.myframework.board.model.repository.Board2DAO;
import com.myframework.controller.Controller;

public class DeleteController implements Controller{
	Board2DAO board2DAO = new Board2DAO();
	
	public void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String board2_id=request.getParameter("board2_id");
		int result=board2DAO.delete(Integer.parseInt(board2_id));
		
	}

	public String getResultKey() {
		return "/view/board/delete";
	}

	public boolean isForward() {
		return false;
	}

}
