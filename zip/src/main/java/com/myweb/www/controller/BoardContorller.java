package com.myweb.www.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myweb.www.domain.BoardVO;
import com.myweb.www.repository.MemberDAO;
import com.myweb.www.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board/*")
public class BoardContorller {
	
	@Inject
	private BoardService bsv;
	
	@Inject
	private MemberDAO mdao;
	
	@PostMapping("/register")
	public String registerGet() {
		return "/board/register";
	}
	
	public String registerPost(BoardVO bvo, RedirectAttributes Ratt) {
		log.info(" >>>>> BVO >>>>> : " + bvo.toString());
	}
}
