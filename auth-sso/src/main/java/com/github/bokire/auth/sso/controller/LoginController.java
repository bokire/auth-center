package com.github.bokire.auth.sso.controller;

import org.springframework.stereotype.Controller;

import com.github.bokire.auth.common.mvc.ResponseMessage;

@Controller
public class LoginController {

	public ResponseMessage login() {
		
		return ResponseMessage.success(null);
	}
}
