package com.lance.aop;

import org.springframework.stereotype.Component;

/**
 * @author lancecong
 * @version 1.0
 * @ClassName UserService
 * @DESCRIPTION TODO
 * @create 2019-12-21 11:42
 **/
@Component
public class TempService {
	String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void temps(){
		System.out.println("temps ....");
	}
}
