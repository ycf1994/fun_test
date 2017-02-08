package com.controller;

import javax.servlet.http.HttpServletRequest;

import com.ycf.fun.annotation.Router;
import com.ycf.fun.controller.Controller;

@Router(uri="user")
public class UserController extends Controller{
	public void show(int age,String name,HttpServletRequest request){
		System.out.println(age);
		System.out.println(name);
		System.out.println(request.getMethod());
	}
}
