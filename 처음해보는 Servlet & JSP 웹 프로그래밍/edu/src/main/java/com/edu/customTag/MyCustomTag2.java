package com.edu.customTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyCustomTag2 extends SimpleTagSupport{
	
	@Override
	public void doTag() throws JspException, IOException {
		System.out.println("커스텀 태그의 바디가 실행되기 전");
		// JSP 1.2 기반 커스텀 태그를 작성할 때는 3개의 메소드들을 작성해야 하는데 JSP 2.0 부터는 3개의 메소드를 하나의 메소드로 처리하도록 변경
		for(int i=0; i<10; i++) {
			getJspBody().invoke(null);			
		}
		System.out.println("커스텀 태그의 바디가 실행되기 후");
	}

}
