package com.myframework.blood.model;

//jsp�ȿ� ����־��� ��ȭ �Ĵ� ������, �ٸ� �÷��������� 
//������ �� �ֵ��� ����������� �и���Ű��!!���뼺�� ����
public class BloodManager {
	
	public String getAdvice(String blood) {
		String msg=null;//��ȭ������ �Ǵ�
		if(blood.equals("A��")){
			msg="�����ϰ� ö���ϴ�";
		}else if(blood.equals("B��")){
			msg="�������� �������̴�";
		}else if(blood.equals("O��")){
			msg="�������� ������̴�";
		}else if(blood.equals("AB��")){
			msg="������ ���";
		}
		return msg;
	}
}
