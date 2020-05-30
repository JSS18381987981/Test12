package com.cy.test;

import org.junit.Test;

import com.cy.spring.beans.DefaultCache;

public class TestBeans01 extends TestBase {
	@Test
	public void testDefaultCache(){
		DefaultCache cache = ctx.getBean("defaultCache", DefaultCache.class);
		System.out.println(cache);
		DefaultCache cache1 = ctx.getBean("defaultCache", DefaultCache.class);
		System.out.println(cache==cache1);
	}
}