package com.dev.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.MemberService;
import com.dev.vo.MemberVo;

public class MemberListController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		MemberService service = MemberService.getInstance();
		ArrayList<MemberVo> list = service.memberList();
		
		request.setAttribute("list", list);
		HttpUtil.forward(request, reponse, "/result/memberListOutput.jsp");
	}

}
