package com.lance.test;

import com.lance.aop.UserService;

/**
 * @author lancecong
 * @version 1.0
 * @ClassName TestImpl
 * @DESCRIPTION TODO
 * @create 2019-12-21 21:55
 *
 * //		TestImpl test = new TestImpl();
 * //		if(test instanceof TestInterface){
 * //			System.out.println("true");
 * //		}
 **/
public class TestImpl extends UserService implements TestInterface {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void test() {
        System.out.println("implemnts class");
    }


}
