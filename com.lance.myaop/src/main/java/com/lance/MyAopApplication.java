package com.lance;

import com.lance.aop.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lancecong
 * @version 1.0
 * @ClassName MyAopApplication
 * @DESCRIPTION TODO
 * @create 2019-12-21 11:38
 **/

@EnableAspectJAutoProxy
@ComponentScan("com.lance")
public class MyAopApplication {
	public static void main(String[] args) {

	AnnotationConfigApplicationContext acw = new AnnotationConfigApplicationContext(MyAopApplication.class);
//		UserService userService  = (UserService)
				Object o = acw.getBean("tempService");

//		userService.login();



	}

}
