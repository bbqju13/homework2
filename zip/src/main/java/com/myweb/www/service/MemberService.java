package com.myweb.www.service;

import com.myweb.www.domain.MemberVO;

public interface MemberService {

	int signUp(MemberVO mvo);

	MemberVO isUser(String id, String pw);

}
