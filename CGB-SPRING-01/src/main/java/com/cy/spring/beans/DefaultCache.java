package com.cy.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Lazy
@Scope("prototype")
@Component
public class DefaultCache implements Cache {
	@Autowired
	@Qualifier("defaultCache")
	private Cache cache;
	public DefaultCache(){
		System.out.println("DefaultCache");
	}
}
