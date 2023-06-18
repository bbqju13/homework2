package com.myweb.www.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String birth;
	private int age;
	private String email;
	private String addr;
	private String reg_date;
}
