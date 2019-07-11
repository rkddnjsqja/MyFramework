package com.myframework.blood.model;

//jsp안에 들어있었던 영화 파단 로직을, 다른 플랫폼에서도 
//재사용할 수 있도록 공통로직으로 분리시키자!!재사용성을 위해
public class BloodManager {
	
	public String getAdvice(String blood) {
		String msg=null;//영화에대한 판단
		if(blood.equals("A형")){
			msg="세심하고 철저하다";
		}else if(blood.equals("B형")){
			msg="고집세고 다혈질이다";
		}else if(blood.equals("O형")){
			msg="오지랖이 태평양이다";
		}else if(blood.equals("AB형")){
			msg="결정력 장애";
		}
		return msg;
	}
}
