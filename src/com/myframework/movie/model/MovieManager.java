package com.myframework.movie.model;

//jsp�ȿ� ����־��� ��ȭ �Ĵ� ������, �ٸ� �÷��������� 
//������ �� �ֵ��� ����������� �и���Ű��!!���뼺�� ����
public class MovieManager {
	
	public String getAdvice(String movie) {
		String msg=null;//��ȭ������ �Ǵ�
		if(movie.equals("�ص����")){
			msg="SF��ȭ ��� �ְ� ��� ���";
		}else if(movie.equals("�����̴��� ������ Ȩ")){
			msg="7�� ���� �����";
		}else if(movie.equals("���κ�3")){
			msg="���� ����";
		}
		return msg;
	}
}
