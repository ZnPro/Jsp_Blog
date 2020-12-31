package com.cos.blog.service;

import com.cos.blog.domain.dto.JoinReqDto;
import com.cos.blog.domain.dto.LoginReqDto;
import com.cos.blog.domain.dto.UpdateReqDto;
import com.cos.blog.domain.user.User;

public class UserService {
	// 회원가입,로그인, 회원수정,아이디중복체크

	public int 회원가입(JoinReqDto dto) {
		return -1;
	}

	public User  로그인(LoginReqDto dto) {
		return null;
	}

	public int 회원수정(UpdateReqDto dto) {
		return -1;
	}

	public int 아이디중복체크(String username) {
		return -1;
	}

}
