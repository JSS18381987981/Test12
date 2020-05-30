package com.cy.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cy.spring.config.SpringConfig;

public class TestBase {
	protected AnnotationConfigApplicationContext ctx;
	@Before
	public void init(){
		ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
	}
	
	@Test
	public void testCtx(){
		System.out.println(ctx);
	}
	
}
