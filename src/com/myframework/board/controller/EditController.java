package com.myframework.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.board.model.domain.Board2;
import com.myframework.board.model.repository.Board2DAO;
import com.myframework.controller.Controller;

public class EditController implements Controller{
	Board2DAO board2DAO = new Board2DAO();
	
	/*
	 * 3�ܰ�:�˸´� ���� ��ü�� �Ͻ�Ų��
	 * 4�ܰ�:jsp�� ������ ���� �������� request�� ����
	 * */
	public void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content=request.getParameter("content");
		String board2_id=request.getParameter("board2_id");
		
		Board2 board2 = new Board2();
		board2.setTitle(title);
		board2.setWriter(writer);
		board2.setContent(content);
		board2.setBoard2_id(Integer.parseInt(board2_id));
		board2DAO.update(board2);
		
		request.setAttribute("board2", board2);
		
	}

	public String getResultKey() {
		return "/view/board/delete";
	}

	public boolean isForward() {
		return true;
	}

}
