package com.myframework.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.board.model.repository.Board2DAO;
import com.myframework.controller.Controller;

//3:�𵨿��� �Ͻ�Ų��
//4:���������� ���������� �ִٸ� ����(request)
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
	
		return true;//�������ϰڴ�
	}

}
