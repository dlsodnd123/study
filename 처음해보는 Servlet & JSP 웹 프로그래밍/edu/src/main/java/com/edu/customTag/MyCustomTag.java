package com.edu.customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

@SuppressWarnings("serial")
public class MyCustomTag extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		System.out.println("시작태그를 만났습니다.");
		return SKIP_BODY;	// SKIP_BODY는 태그의 몸체를 처리하지 않고 스킵
	}
	
	@Override
	public int doAfterBody() throws JspException {
		System.out.println("body 처리가 끝났습니다.");
		return super.doAfterBody();
	}
	
	@Override
	public int doEndTag() throws JspException {
		System.out.println("끝태그를 만났습니다.");
		return super.doEndTag();
	}

}
