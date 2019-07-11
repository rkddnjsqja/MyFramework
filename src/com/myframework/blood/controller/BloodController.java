package com.myframework.blood.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myframework.blood.model.BloodManager;
import com.myframework.controller.Controller;

//기존 jsp,모델1방식은 훌륭한 방식이기는 하지만,
//아직 완전히 jsp에서 컨트롤러 코드가 분리 되지는 않았기 때문에
//만일 jsp의 디자인이 다른 파일로 변경되었을때, 컨트롤러코드가 영향을
//받음..(즉 완전한 분리가 되지 않았음)
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
