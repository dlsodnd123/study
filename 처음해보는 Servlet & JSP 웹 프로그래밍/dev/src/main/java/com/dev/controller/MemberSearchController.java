package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.MemberService;
import com.dev.vo.MemberVo;

public class MemberSearchController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		// Parameter 추출
		String id = request.getParameter("id");
		String job = request.getParameter("job");
		String path = null;
		if (job.equals("search")) {
			path = "/memberSearch.jsp";
		} else if (job.equals("update")) {
			path = "/memberUpdate.jsp";
		} else if (job.equals("delete")) {
			path = "/memberDelete.jsp";
		}
		// 유효성 체크
		if (id.isEmpty()) {
			request.setAttribute("error", "ID를 입력해주시기 바랍니다!");
			HttpUtil.forward(request, reponse, path);
			return;
		}
		// Service 객체의 메소드 호출
		MemberService service = MemberService.getInstance();
		MemberVo member = service.memberSearch(id);
		// Output View 페이지로 이동
		if (member == null) request.setAttribute("result", "검색된 정보가 없습니다!");
		request.setAttribute("member", member);
		if (job.equals("search")) path="/result/memberSearchOutput.jsp";
		HttpUtil.forward(request, reponse, path);
	}
	

}
