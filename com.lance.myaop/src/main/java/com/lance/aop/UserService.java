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
public class UserService {

	public void login(){
		System.out.println("login ....");
	}
}
