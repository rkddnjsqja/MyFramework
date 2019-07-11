package com.myframework.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.board.model.domain.Board2;
import com.myframework.board.model.repository.Board2DAO;
import com.myframework.controller.Controller;

//Ŭ���̾�Ʈ�� "�۵��" ��û�� ó���ϴ� ���� ��Ʈ�ѷ�!!
//3�ܰ�:�˸´� ���� ��ü���� �Ͻ�Ų��!! �츮�� ��� DAO
//4�ܰ�:jsp�� ������ ���� ���� ��쿣, ����� �����Ѵ�(insert �����Ұ� ����)
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
		System.out.println("��ϰ����"+result);
		
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
