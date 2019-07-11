package com.myframework.blood.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.blood.model.BloodManager;
import com.myframework.controller.Controller;

//���� jsp,��1����� �Ǹ��� ����̱�� ������,
//���� ������ jsp���� ��Ʈ�ѷ� �ڵ尡 �и� ������ �ʾұ� ������
//���� jsp�� �������� �ٸ� ���Ϸ� ����Ǿ�����, ��Ʈ�ѷ��ڵ尡 ������
//����..(�� ������ �и��� ���� �ʾ���)
public class BloodController implements Controller{
	BloodManager manager=new BloodManager();
	
	public void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String blood=request.getParameter("blood");
		String msg=manager.getAdvice(blood);
		request.setAttribute("result", msg);
	}

	public String getResultKey() {
		
		return "/view/blood";
	}

	@Override
	public boolean isForward() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
