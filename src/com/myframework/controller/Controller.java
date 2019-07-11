package com.myframework.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Ŭ���̾�Ʈ�� ��û�� ó���ϴ� ��� ��Ʈ�ѷ����� ���� �ڷ�������
//���� ���� Ŭ����..
public interface Controller {//�ڷ���+��������
	//�� ��ü�� ��ӹ޴� ���~ ��Ʈ�ѷ��� �ݵ�� �Ʒ��� �޼�������� �����ؾ��ϰ�,
	//�ݵ�� �ڽſ��� �°� �������̵� �ϵ��� ���� ����!!
	//��������
	public void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	public String getResultKey();//�������� �ڿ����� ������� �ʴ´�!!
	public boolean isForward();//������ ���θ� �������� �޼���!!
}
