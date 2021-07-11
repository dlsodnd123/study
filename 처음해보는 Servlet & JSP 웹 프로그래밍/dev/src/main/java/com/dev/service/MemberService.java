package com.dev.service;

import com.dev.dao.MemberDAO;
import com.dev.vo.MemberVo;

public class MemberService {

	private static MemberService service = new MemberService();
	public MemberDAO dao = MemberDAO.getInstance();
	
	private MemberService() { }
	public static MemberService getInstance() {
		return service;
	}
	
	public void memberInsert(MemberVo member) {
		dao.memberInsert(member);
	}
	
}
