package com.edu.customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

@SuppressWarnings("serial")
public class MyCustomTag extends TagSupport {
	
	int cnt = 1;
	
	@Override
	public int doStartTag() throws JspException {
		System.out.println("시작태그를 만났습니다.");
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		System.out.println("body 처리가 끝났습니다. : " + cnt);
		// EVAL_BODY_AGAIN는 몸체를 다시 실행하는 반환값
		return SKIP_BODY;
	}
	
	@Override
	public int doEndTag() throws JspException {
		System.out.println("끝태그를 만났습니다.");
		return SKIP_PAGE;
	}

}
