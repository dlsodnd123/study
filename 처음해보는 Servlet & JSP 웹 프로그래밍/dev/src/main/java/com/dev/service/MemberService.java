package com.dev.service;

import java.util.ArrayList;

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
	
	public MemberVo memberSearch(String id) {
		MemberVo member = dao.memberSearch(id);
		return member;
	}
	
	public void memberUpdate(MemberVo member) {
		dao.memberUpdate(member);
	}
	
	public void memberDelete(String id) {
		dao.memberDelete(id);
	}
	
	public ArrayList<MemberVo> memberList() {
		ArrayList<MemberVo> list = dao.memberList();
		return list;
	}
	
}
